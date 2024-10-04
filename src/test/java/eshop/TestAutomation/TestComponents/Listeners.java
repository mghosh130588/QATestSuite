package eshop.TestAutomation.TestComponents;

import Resources.ExtentReporterNG;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.IOException;

public class Listeners extends BaseTest implements ITestListener {

    ExtentTest test;
    ExtentReports extent= ExtentReporterNG.getReportObject();
    ThreadLocal<ExtentTest> extentTest =new ThreadLocal<ExtentTest>();
    @Override
    public void onTestStart(ITestResult result) {
        test= extent.createTest(result.getMethod().getMethodName());
        extentTest.set(test);
        log.info("----------"+result.getMethod().getMethodName()+"-------is started");
    }

    @Override
    public void onTestSuccess(ITestResult result) {

        extentTest.get().log(Status.PASS, "Test Passed");
        log.info("------" + result.getMethod().getMethodName()+" Passed---------");
    }

    @Override
    public void onTestFailure(ITestResult result) {
        String Screenshotpath = "./reports/";
        String failedmethod = result.getMethod().getMethodName();
        //extentTest.get().fail(result.getThrowable());
        //WebDriver driver =null;

        try {
            driver =(WebDriver)result.getTestClass().getRealClass().getField("driver").get(result.getInstance());
        } catch(Exception e) {
            e.printStackTrace();
        }

        try {
            getScreenShotPath(failedmethod,driver);
        } catch (Exception e) {
            e.printStackTrace();
        }
            System.out.println(Screenshotpath +failedmethod+".png");
            extentTest.get().fail(result.getThrowable());
            extentTest.get().fail(MediaEntityBuilder.createScreenCaptureFromPath(failedmethod+".png").build());
            log.warn("The test case faile" +failedmethod);
                   // .addScreenCaptureFromPath(filepath, result.getMethod().getMethodName());

    }

    @Override
    public void onTestSkipped(ITestResult result) {

    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
        ITestListener.super.onTestFailedButWithinSuccessPercentage(result);
    }

    @Override
    public void onTestFailedWithTimeout(ITestResult result) {

    }

    @Override
    public void onStart(ITestContext context) {

    }

    @Override
    public void onFinish(ITestContext context) {

        extent.flush();
    }
}

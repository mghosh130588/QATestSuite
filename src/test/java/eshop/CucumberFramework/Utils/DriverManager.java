package eshop.CucumberFramework.Utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class DriverManager {

 public WebDriver driver;


 public WebDriver initilizeDriver()
 {
     String browsername = ConfiguratorManager.getConfiguration().getProperty("browser");
     switch (browsername) {
         case "firefox":
             System.out.println("Initial browser SetUp");
             WebDriverManager.firefoxdriver().setup();
             FirefoxOptions option = new FirefoxOptions();
             driver = new FirefoxDriver(option);
             driver.manage().window().fullscreen();
             System.out.println("Initial Browser has been SetUp");
             break;
         case "chrome":
             System.out.println("Initial browser SetUp");
             WebDriverManager.chromedriver().setup();
             ChromeOptions coption = new ChromeOptions();
             driver = new ChromeDriver(coption);
             driver.manage().window().maximize();
             System.out.println("Initial Browser has been SetUp");
             break;
         case "chromeheadless":
             System.out.println("Initial browser SetUp");
             WebDriverManager.chromedriver().setup();
             ChromeOptions choption = new ChromeOptions();
             choption.setHeadless(true);
             driver = new ChromeDriver(choption);
             driver.manage().window().maximize();
             System.out.println("Initial Browser has been SetUp");
             break;
         case "edge":
             System.out.println("Initial browser SetUp");
             WebDriverManager.edgedriver().setup();
             EdgeOptions eoption = new EdgeOptions();
             driver = new EdgeDriver(eoption);
             driver.manage().window().maximize();
             System.out.println("Initial Browser has been SetUp");
             break;
     }
     return driver;
 }
}

package eshop.CucumberFramework.Utils;

import PageObject.BasePages.CatalogPage;
import PageObject.BasePages.LogInPage;
import PageObject.BasePages.PageObjectManager;
import org.openqa.selenium.WebDriver;

public class TestComponent {
    public CatalogPage cp;
    public WebDriver driver;
    public LogInPage lp;
    public PageObjectManager pm;
    DriverManager dm;

    public TestComponent() {
        dm = new DriverManager();
        this.driver = dm.initilizeDriver();
        pm = new PageObjectManager(driver);
    }

}

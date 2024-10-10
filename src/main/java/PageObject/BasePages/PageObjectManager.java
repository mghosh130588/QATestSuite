package PageObject.BasePages;

import org.openqa.selenium.WebDriver;

public class PageObjectManager {

    public WebDriver driver;
    public BasketPage bp;
    public CatalogPage cp;
    public CheckOutPage review;
    public LogInPage lp;
    public SuccessPage sp;

    public PageObjectManager(WebDriver driver) {
        this.driver = driver;
    }

    public UpdatePage up;

    public BasketPage getBp() {
        bp = new BasketPage(driver);
        return bp;
    }

    public CatalogPage getCp() {
        cp = new CatalogPage(driver);
        return cp;
    }

    public CheckOutPage getReview() {
        review = new CheckOutPage(driver);
        return review;
    }

    public LogInPage getLp() {
        lp = new LogInPage(driver);
        return lp;
    }

    public SuccessPage getSp() {
        sp = new SuccessPage(driver);
        return sp;
    }

    public UpdatePage getUp() {
        up = new UpdatePage(driver);
        return up;
    }
}

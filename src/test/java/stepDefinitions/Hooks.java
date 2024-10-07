package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

    @Before("@Smoke")
    public void setUp(){
        System.out.println("This is before for smoke tags");

    }

    @Before("@DataProviderTest")
    public void SetUp2(){
        System.out.println("This is before for all cases");

    }
    @After
    public void teardown(){


    }
}

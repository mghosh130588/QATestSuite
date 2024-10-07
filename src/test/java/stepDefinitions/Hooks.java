package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

    @Before("@Smoke")
    public void setUp(){


    }

    @Before("@DataProviderTest")
    public void SetUp2(){


    }
    @After
    public void teardown(){


    }
}

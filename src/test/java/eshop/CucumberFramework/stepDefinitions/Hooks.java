package eshop.CucumberFramework.stepDefinitions;

import eshop.CucumberFramework.Utils.TestComponent;
import io.cucumber.java.After;

public class Hooks {

    public TestComponent tc;

    public Hooks(TestComponent tc){
        this.tc = tc;
    }

    @After
    public void teardown(){
        tc.dm.initilizeDriver().quit();
    }
}

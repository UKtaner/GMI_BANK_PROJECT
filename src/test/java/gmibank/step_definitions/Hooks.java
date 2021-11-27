package gmibank.step_definitions;

import gmibank.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.IOException;

public class Hooks {
    @Before
    public void setUp(){
//        System.out.println("This is hooks before method");
    }
    @After
    public void tearDown(Scenario scenario) throws IOException {

        final byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
//       Attaching the screenshot to the scenarios in the default-cucumber-reports.html
        if (scenario.isFailed()) {
            scenario.attach(screenshot, "image/png", "Screenshot");
            Driver.closeDriver();
        }
    }
}



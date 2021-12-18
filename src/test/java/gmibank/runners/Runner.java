package gmibank.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "pretty",
                "html:target/default-cucumber-reports.html",
                "json:target/json-reports/cucumber.json",
                "junit:target/xml-report/cucumber.xml",
                "rerun:target/failedRerun.txt",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
        },


        features = "src/test/resources/features",
        glue = "gmibank/step_definitions",
<<<<<<< HEAD
<<<<<<< HEAD
        tags = "@api",
=======
        tags = "@customerInfo",


>>>>>>> master
=======

        tags = "@api",

      



>>>>>>> 07fdf6d81aad0ef035e8152e52ce0fcc09490248

        dryRun = false

)
public class Runner {

}
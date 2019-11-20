package com.qa.stepDefinations;


import com.qa.util.TestBase;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class hooks extends TestBase {

    @Before
    public void setUp() {
        initialization();
    }

    @After
    public void tearDown(Scenario scenario) {
        if (scenario.isFailed()) {
            try {
                // Code to capture and embed images in cucumber test reports (if scenario fails)
                final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
                scenario.embed(screenshot, "image/png"); // ... and embed it in the report.
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        driver.quit();

    }

}

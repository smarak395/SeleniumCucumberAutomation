package com.qa.util;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.io.FileInputStream;
import java.util.NoSuchElementException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class TestBase {

    public static WebDriver driver;
    public static Properties prop;

    public TestBase() {
        try {
            prop = new Properties();
            FileInputStream fIs = new FileInputStream("src/test/java/com/qa/config/config.properties");
            prop.load(fIs);

        } catch (Exception ex) {
            ex.getMessage();
        }
    }

    public static void initialization() {
        String browser = prop.getProperty("browser");
        if (browser.equals("chrome")) {
            System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver");
            driver = new ChromeDriver();
        } else if (browser.equals("firefox")) {
            System.setProperty("webdriver.gecko.driver", "src/test/resources/drivers/geckodriver");
            driver = new FirefoxDriver();
        }
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
    }

    public void waitForPageToLoad() {
        WebDriverWait wait = new WebDriverWait(driver, TestUtil.PAGE_LOAD_TIMEOUT);
        wait.until(ExpectedConditions.and(
                (ExpectedCondition<Boolean>) d -> {
                    JavascriptExecutor jsExec = (JavascriptExecutor) d;
                    return (Boolean) (jsExec.executeScript("return document.readyState")).equals("complete");
                }, (ExpectedCondition<Boolean>) d -> {
                    JavascriptExecutor jsExec = (JavascriptExecutor) d;
                    return (Boolean) jsExec.executeScript("return window.jQuery != undefined && jQuery.active == 0");
                }));
    }

    public boolean isElementPresent(WebElement element) {
        try {
            element.isDisplayed();
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    public void enterText(WebElement element, String data) {
        element.clear();
        element.sendKeys(data);
    }

    public void clickButton(WebElement element) {
        try {
            element.click();
            waitForPageToLoad();
        } catch (Exception ex) {
            clickButtonJS(element);
            waitForPageToLoad();
        }
    }

    private void clickButtonJS(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", element);

    }
}

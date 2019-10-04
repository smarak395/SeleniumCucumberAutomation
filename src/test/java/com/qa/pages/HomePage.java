package com.qa.pages;

import com.qa.util.TestBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static org.junit.Assert.assertTrue;

public class HomePage extends TestBase {


    @FindBy(how = How.XPATH, using = "//span[@class='navigation_page' and contains(text(),'My account')]")
    public WebElement myAccountTab;

    @FindBy(how = How.CLASS_NAME, using = "logout")
    public WebElement signOut;


    public void assertMyAccountPage() {
        assertTrue(isElementPresent(myAccountTab));
    }

    public void clickSignOut() {
        clickButton(signOut);
    }

}

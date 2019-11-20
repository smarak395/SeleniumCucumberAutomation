package com.qa.pages;

import com.qa.util.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import static org.junit.Assert.assertTrue;

public class LoginPage extends TestBase {

    public LoginPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(how = How.CLASS_NAME, using = "login")
    public WebElement signInHeaderLink;

    @FindBy(how = How.ID, using = "email")
    public WebElement emailAddress;

    @FindBy(how = How.ID, using = "passwd")
    public WebElement passWd;

    @FindBy(how = How.NAME, using = "SubmitLogin")
    public WebElement signIn;

    @FindBy(how = How.XPATH, using = "//img[@class='logo img-responsive']")
    public WebElement appLogo;

    public void enterLoginCredential(String userName, String password) {
        enterText(emailAddress, userName);
        enterText(passWd, password);
    }

    public void clickSignInHeaderLink() {
        clickButton(signInHeaderLink);
    }

    public void clickSignIn() {
        clickButton(signIn);
    }

    public void assertLogo() {
        assertTrue(isElementPresent(appLogo));
    }

    public void assertSuccessfullySignedOutFromApplication() {
        assertTrue(isElementPresent(signInHeaderLink));
    }

}

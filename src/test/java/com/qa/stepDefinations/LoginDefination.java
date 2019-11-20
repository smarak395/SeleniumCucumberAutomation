package com.qa.stepDefinations;
import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;
import com.qa.util.TestBase;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginDefination extends TestBase {

    LoginPage loginPage = new LoginPage();
    HomePage homePage = new HomePage();

    @Given("^user is already on Login Page$")
    public void user_is_already_on_Login_Page() {
        driver.navigate().to(prop.getProperty("url"));
    }

    @When("^title of login page is My Store$")
    public void title_of_login_page_is_My_Store() {
        loginPage.assertLogo();
    }

    @Then("^user clicks on the header signIn link$")
    public void user_clicks_on_the_header_signIn_link() {
        loginPage.clickSignInHeaderLink();
    }

    @Then("^user enters \"([^\"]*)\" and \"([^\"]*)\"$")
    public void user_enters_and(String userName, String password) {
        loginPage.enterLoginCredential(userName, password);
    }

    @Then("^user clicks on signIn button$")
    public void user_clicks_on_signIn_button() {
        loginPage.clickSignIn();
    }

    @Then("^user is on My Account page$")
    public void user_is_on_My_Account_page() {
        homePage.assertMyAccountPage();
    }

    @When("^user clicks on signOut button$")
    public void user_clicks_on_signOut_button() {
        homePage.clickSignOut();
    }

    @Then("^user should be signedOut from the application$")
    public void user_should_be_signedOut_from_the_application() {
        loginPage.assertSuccessfullySignedOutFromApplication();
    }
}

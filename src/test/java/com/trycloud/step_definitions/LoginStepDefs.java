package com.trycloud.step_definitions;


import com.trycloud.pages.LoginPage;
import com.trycloud.utilities.BrowserUtils;
import com.trycloud.utilities.ConfigurationReader;
import com.trycloud.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;


public class LoginStepDefs {
    LoginPage loginPage = new LoginPage();
    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));

    }
    @When("the user logs in with username and password")
    public void theUserLogsInWithUsernameAndPassword() {
        loginPage.userName.sendKeys(ConfigurationReader.getProperty("username"));
        loginPage.password.sendKeys(ConfigurationReader.getProperty("password"));
    }

    @When("the user clicks on the {string} button or presses the {string} key")
    public void the_user_clicks_on_the_button_or_presses_the_key(String loginText, String keyEnter) {
        if (keyEnter.equalsIgnoreCase("Enter")) {
            // Simulate pressing the Enter key on the password field
            loginPage.password.sendKeys(Keys.ENTER);
        } else {
            // Click on the login button
            loginPage.password.click();
        }

    }
    @Then("the user should be redirected to the homepage")
    public void the_user_should_be_redirected_to_the_homepage() {
        String currentUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertTrue("User is not redirected to the homepage",
                currentUrl.contains("dashboard"));
    }

    @When("user enters the username {string} and {string}")
    public void userEntersTheUsernameAnd(String username, String password) {
        loginPage.userName.sendKeys(username);
        loginPage.password.sendKeys(password);
    }


    @And("the user should not be able to log in")
    public void theUserShouldNotBeAbleToLogIn() {
        loginPage.loginBtn.click();

    }

    @Then("user should see the message {string}")
    public void userShouldSeeTheMessage(String expectedMessage) {
        Assert.assertEquals(expectedMessage,loginPage.WrongMessage.getText());

    }

    @When("the user leaves the username or password field empty")
    public void the_user_leaves_the_username_or_password_field_empty() {
        loginPage.userName.clear();
        loginPage.password.clear();

    }
    @When("the user clicks on the {string} button")
    public void the_user_clicks_on_the_button(String string) {
        loginPage.loginBtn.click();

    }

    @Then("the user should see an error message {string}")
    public void the_user_should_see_an_error_message(String expectedMessage) {


        String actualValidationMessage = loginPage.userName.getAttribute("validationMessage");

        Assert.assertEquals(expectedMessage, actualValidationMessage);
    }

    @When("the user enters a password")
    public void theUserEntersAPassword() {

        loginPage.password.sendKeys(ConfigurationReader.getProperty("password"));
    }
    @Then("the password should be displayed as dots")
    public void thePasswordShouldBeDisplayedAsDots() {
        String inputType = loginPage.password.getAttribute("type");
        Assert.assertEquals("Expected the password field to be type='password'.",
                "password", inputType);
    }


    @And("the user has entered a password")
    public void theUserHasEnteredAPassword() {
        loginPage.password.sendKeys("password");

    }

    @When("the user clicks on the {string} icon")
    public void theUserClicksOnTheIcon(String iconName) {
        loginPage.iconBtn.click();
    }

    @Then("the password should be displayed in plain text")
    public void thePasswordShouldBeDisplayedInPlainText() {
        String fieldType = loginPage.password.getAttribute("type");
        Assert.assertEquals("Expected the password field type to be 'text'.",
                "text", fieldType);
    }

    @Then("the user should see the {string} link")
    public void theUserShouldSeeTheLink(String expectedLinkText) {

        BrowserUtils.waitFor(5);

        Assert.assertTrue(loginPage.forgotPasswordLink.isDisplayed());
        Assert.assertEquals(expectedLinkText, loginPage.forgotPasswordLink.getText());
    }


    @When("the user clicks on the {string} link")
    public void theUserClicksOnTheLink(String linText) {
        loginPage.forgotPasswordLink.click();

    }

    @Then("the user should be redirected to the {string} page")
    public void theUserShouldBeRedirectedToThePage(String expectedPageTitle) {

        BrowserUtils.verifyTitle(expectedPageTitle);


    }

    @And("the user should see the {string} button")
    public void theUserShouldSeeTheButton(String buttonText) {
        BrowserUtils.waitFor(5);
        Assert.assertTrue(loginPage.resetPasswordBtn.isDisplayed());

    }


    @When("user should go back to login page")
    public void userShouldGoBackToLoginPage() {
        loginPage.loginBackBtn.click();

    }

    @Then("the username field should have the placeholder {string}")
    public void theUsernameFieldShouldHaveThePlaceholder(String expectedPlaceHolder) {

        String actualPlaceholder = loginPage.userName.getAttribute("placeholder");
        Assert.assertEquals("Username field placeholder does not match.", expectedPlaceHolder, actualPlaceholder);

    }

    @And("the password field should have the placeholder {string}")
    public void thePasswordFieldShouldHaveThePlaceholder(String expectedPlaceHolder) {

        String actualPlaceholder = loginPage.password.getAttribute("placeholder");
        Assert.assertEquals("Password field placeholder does not match.", expectedPlaceHolder, actualPlaceholder);

    }


}






package com.trycloud.step_definitions;


import com.trycloud.pages.BasePage;
import com.trycloud.pages.LoginPage;
import com.trycloud.utilities.BrowserUtils;
import com.trycloud.utilities.ConfigurationReader;
import com.trycloud.utilities.Driver;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefs {

    LoginPage loginPage = new LoginPage();
    BasePage basePage = new BasePage();

    @Given("User enter username and password")
    public void userEnterUsernameAndPassword() {
        loginPage.login(ConfigurationReader.getProperty("username"),
                        ConfigurationReader.getProperty("password"));
    }
    @When("User click login button")
    public void user_click_login_button() {
        loginPage.loginBtn.click();
    }
    @Then("User should land to the homepage")
    public void user_should_land_to_the_homepage() {
        BrowserUtils.verifyTitleContains("Trycloud");
    }

    // Veyan
    @Given("user is logged in with valid credentials")
    public void user_is_logged_with_valid_credentials() {
        loginPage.loginWithClick(ConfigurationReader.getProperty("username"),
                ConfigurationReader.getProperty("password"));
    }
    @When("user clicks the user icon at the top right")
    public void user_clicks_the_user_icon_at_the_top_right() {
        basePage.userIcon_Button.click();
    }
    @When("user views the dropdown menu and selects Log out")
    public void user_views_the_dropdown_menu_and_selects_log_out() {
        BrowserUtils.sleep(3);
        basePage.logout_Button.click();
    }
    @Then("user sees login page is displayed")
    public void user_sees_login_page_is_displayed() {
        BrowserUtils.verifyURLContains("login");
    }

    @Given("user clicks the user icon at the top right and selects Logout")
    public void user_clicks_the_user_icon_at_the_top_right_and_selects_logout() {
        basePage.click_on_logout();
    }
    @Then("user sees the login page is displayed")
    public void user_sees_the_login_page_is_displayed() {
        BrowserUtils.verifyURLContains("login");
    }
    @But("verify if user remains on login page after clicking back button")
    public void verifyIfUserRemainsOnLoginPageAfterClickingBackButton() {
        Driver.getDriver().navigate().back();
        BrowserUtils.sleep(3);
        BrowserUtils.verifyURLContains("login");
        BrowserUtils.sleep(3);
    }

    @When("user remains AFK for three minutes")
    public void userGoesRemainsAFKForThreeMinutes() {
        BrowserUtils.sleep(3);
    }
    @Then("verify if user is back on the login page")
    public void verifyIfUserIsBackOnTheLoginPage() {
        BrowserUtils.verifyURLContains("login");
    }



}







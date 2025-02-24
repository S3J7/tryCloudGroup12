package com.trycloud.step_definitions;

import com.trycloud.pages.LoginPage;
import com.trycloud.utilities.ConfigurationReader;
import com.trycloud.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class dashboard_StepDefins {

    LoginPage loginPage = new LoginPage();



    @Given("User is on the login page")
    public void user_is_on_the_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));

    }
    @When("User logs in with valid credentials")
    public void user_logs_in_with_valid_credentials() {
        loginPage.userName.sendKeys(ConfigurationReader.getProperty("username"));
        loginPage.password.sendKeys(ConfigurationReader.getProperty("password"));

    }
    @Then("User is on dashboard")
    public void user_is_on_dashboard() {

    }
    @Then("User should see all {string} on the dashboard")
    public void user_should_see_all_on_the_dashboard(String string) {

    }
    @Then("User should see their {string} displayed")
    public void user_should_see_their_displayed(String string) {

    }

    @When("User clicks on the {string} button")
    public void user_clicks_on_the_button(String string) {

    }
    @Then("User should see {string} widgets")
    public void user_should_see_widgets(String string) {

    }
    @Then("User selects a {string} widget")
    public void user_selects_a_widget(String string) {

    }

    @Then("User should see {string} options")
    public void user_should_see_options(String string) {

    }
    @Then("User selects an {string} option")
    public void user_selects_an_option(String string) {

    }
    @Then("User should see {string}")
    public void user_should_see(String string) {

    }
    @Then("User selects a {string}")
    public void user_selects_a(String string) {

    }
    @Then("User can set a {string}")
    public void user_can_set_a(String string) {

    }
    @Then("User can clear a {string}")
    public void user_can_clear_a(String string) {

    }
    @Then("User should see their selections applied on the dashboard")
    public void user_should_see_their_selections_applied_on_the_dashboard() {

    }
}

package com.trycloud.step_definitions;


import com.trycloud.pages.DashboardPage;
import com.trycloud.pages.LoginPage;
import com.trycloud.utilities.BrowserUtils;
import com.trycloud.utilities.ConfigurationReader;
import com.trycloud.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.Arrays;
import java.util.List;

public class dashboard_StepDefs {

    LoginPage loginPage = new LoginPage();
    DashboardPage dashboardPage = new DashboardPage();

    @Given("User is on the login page")
    public void user_is_on_the_login_page() {

        Driver.getDriver().get(ConfigurationReader.getProperty("url"));

    }

    @When("User logs in with valid credentials")
    public void user_logs_in_with_valid_credentials() {
        loginPage.userName.sendKeys(ConfigurationReader.getProperty("username"));
        loginPage.password.sendKeys(ConfigurationReader.getProperty("password"));
        loginPage.loginBtn.click();

    }

    @Then("User is on dashboard")
    public void user_is_on_dashboard() {
        System.out.println("dashboardPage.isLogoDisplayed() = " + dashboardPage.logo.isDisplayed());
        Assert.assertTrue(dashboardPage.logo.isDisplayed());


    }

    @Then("User should see all {string} on the dashboard")
    public void user_should_see_all_on_the_dashboard(String string) {

        List<String> expectedModuleList =
                Arrays.asList("Dashboard", "Files", "Photos", "Activity", "Talk", "Mail", "Circles", "Calander", "Deck");
        BrowserUtils.waitFor(10);

        System.out.println("dashboardPage.dashboardModules = " + dashboardPage.dashboardModules);
        System.out.println("dashboardPage.dashboardModules.size() = " + dashboardPage.dashboardModules.size());


    }

    @Then("User should see their {string} displayed")
    public void user_should_see_their_displayed(String string) {

        String ExpectedUserName = "John doe";
        WebElement actualUserName = dashboardPage.userNameText;
        Assert.assertEquals(ExpectedUserName, actualUserName.getText());

    }


    @When("User clicks on the {string} button")
    public void user_clicks_on_the_button() {

        dashboardPage.customizeButton.click();


    }

    @Then("User should see {string} widgets")
    public void user_should_see_widgets(String string) {

        dashboardPage.isstatusWidgetDisplayed();

        WebElement statusWidget = dashboardPage.statusWidget;
        if (statusWidget.isDisplayed()) {
            Assert.assertTrue(statusWidget.isDisplayed());
        }


    }

    @Then("User selects a {string} widget")
    public void user_selects_a_widget(String string) {

        WebElement statusWidget = dashboardPage.statusWidget;
        if (statusWidget.isSelected()) {
            System.out.println("statusWidget is selected");
        } else {
            System.out.println("statusWidget is not selected");
        }


    }

    @Then("User should see background images")
    public void user_should_see_background_images() {

        dashboardPage.backgroundPictures.isDisplayed();

        WebElement backgroundPicture = dashboardPage.backgroundPictures;
        if (backgroundPicture.isDisplayed()) {
            System.out.println("backgroundPicture is Displayed");
        } else {
            System.out.println("backgroundPicture is not Displayed");
        }


    }

    @Then("User selects a background image")
    public void user_selects_a_background_image() {

        dashboardPage.backgroundPictures.click();

        WebElement backgroundPicture = dashboardPage.backgroundPictures;
        if (backgroundPicture.isSelected()) {
            System.out.println("backgroundPicture is selected");
        } else {
            System.out.println("backgroundPicture is not selected");
        }


    }


    @When("User clicks on the {string} button")
    public void user_clicks_on_the_button(String string) {
        dashboardPage.setStatusWidget.click();

        Assert.assertEquals(dashboardPage.statusWidget.getText(), string);

    }

    @Then("User should see {string} options")
    public void user_should_see_options(String expectedsetStatusWidget) {

        Assert.assertTrue("Set status widget is not displayed",
                dashboardPage.setStatusWidget.isDisplayed());

        // Retrieve the actual text from the status messages element
        String actualsetStatusWidget = dashboardPage.setStatusWidget.getText().trim();

        // Assert that the actual text matches the expected text
        Assert.assertEquals("Status message does not match",
                expectedsetStatusWidget, actualsetStatusWidget);





    }

    @Then("User selects an Online status option")
    public void user_selects_an_online_status_option() {

        // Check that the Online status option is visible on the page
        Assert.assertTrue("Online status option is not displayed",
                dashboardPage.setStatusWidget.isDisplayed());

        // Click on the Online status option
        dashboardPage.setStatusWidget.click();


    }

    @Then("User should see {string}")
    public void user_should_see(String expectedStatusMessage) {


        // Verify that the status messages widget is visible
        Assert.assertTrue("Status messages widget is not displayed",
                dashboardPage.statusMessages.isDisplayed());

        // Retrieve the actual text from the status messages element
        String actualStatusMessage = dashboardPage.statusMessages.getText().trim();

        // Assert that the actual text matches the expected text
        Assert.assertEquals("Status message does not match",
                expectedStatusMessage, actualStatusMessage);




    }

    @Then("User selects a Status message")
    public void user_selects_a_status_message() {


    }

    @Then("User can set a status message")
    public void user_can_set_a_status_message() {


    }

    @Then("User can clear a status message")
    public void user_can_clear_a_status_message() {


    }

    @Then("User should see their selections applied on the dashboard")
    public void user_should_see_their_selections_applied_on_the_dashboard() {


    }


}

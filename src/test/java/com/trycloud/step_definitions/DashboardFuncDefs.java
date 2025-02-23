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

import java.util.List;


public class DashboardFuncDefs extends LoginPage {

    LoginPage loginPage = new LoginPage();
    DashboardPage dashboardPage = new DashboardPage();

    @Given("User is on login page")
    public void user_is_on_login_page() {
        Driver.getDriver().get("https://qa.trycloud.net/");

    }

    @When("User enters valid credentials")
    public void user_enters_valid_credentials() {
        loginPage.login(ConfigurationReader.getProperty("login"),
                ConfigurationReader.getProperty("password"));

    }

    @Then("User should see the dashboard with modules and username")
    public void user_should_see_the_dashboard_with_modules_and_username
            (List<WebElement> dashboardModules) {

        for (WebElement dashboardModule : dashboardModules) {
            System.out.println("dashboardModule = " + dashboardModule);
        }



        String expectedUserName = "Employee12";

        dashboardPage.userName.getText();
        System.out.println("dashboardPage.userName = " + dashboardPage.userName);

        Assert.assertEquals(dashboardPage.userName, expectedUserName);


    }


    @Given("User is on dashboard page")
    public void user_is_on_dashboard_page() {

        Driver.getDriver().get("https://qa.trycloud.net/");

    }

    @When("User clicks Customize button")
    public void user_clicks_customize_button() {


    }

    @When("User selects a status widget")
    public void user_selects_a_status_widget() {


    }

    @When("User selects a background image")
    public void user_selects_a_background_image() {


    }

    @Then("The dashboard should reflect the selections")
    public void the_dashboard_should_reflect_the_selections() {


    }


    @Given("User is on dashboard page")
    public void user_is_tc_on_dashboard_page() {


    }

    @When("User clicks Set Status button")
    public void user_clicks_set_status_button() {

    }

    @When("User selects an online status")
    public void user_selects_an_online_status() {

    }

    @When("User selects a status message")
    public void user_selects_a_status_message() {


    }

    @Then("The dashboard should display the selected status")
    public void the_dashboard_should_display_the_selected_status() {


    }
}

package com.trycloud.step_definitions;


import com.trycloud.pages.LoginPage;
import com.trycloud.utilities.BrowserUtils;
import com.trycloud.utilities.ConfigurationReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefs {

LoginPage loginPage = new LoginPage();

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


}







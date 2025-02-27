package com.trycloud.step_definitions;

import com.trycloud.pages.LoginPage;
import com.trycloud.pages.SearchPage;
import com.trycloud.utilities.ConfigurationReader;
import com.trycloud.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Search_StepDefinitions {

    LoginPage loginPage = new LoginPage();
    SearchPage searchPage = new SearchPage();

    @Given("user is on the trycloud homepage")
    public void user_is_on_the_trycloud_homepage() {

        loginPage.loginWithClick(ConfigurationReader.getProperty("username"),ConfigurationReader.getProperty("password"));


    }
    @When("user can click on the magnifying glass icon")
    public void user_can_click_on_the_magnifying_glass_icon() {
        searchPage.searchButton.click();

    }
    @When("user types file name in the search box and click on it")
    public void user_types_file_name_in_the_search_box_and_click_on_it() {

        searchPage.searchBox.sendKeys("talk");
        searchPage.searchResult.click();

    }
    @Then("user sees the details side page of the file when clicked on it.")
    public void user_sees_the_details_side_page_of_the_file_when_clicked_on_it() {
        searchPage.detailsBar.isDisplayed();
    }
}

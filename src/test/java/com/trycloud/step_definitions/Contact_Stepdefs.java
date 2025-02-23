package com.trycloud.step_definitions;

import com.trycloud.pages.BasePage;
import com.trycloud.pages.ContactPage;
import com.trycloud.pages.LoginPage;
import com.trycloud.utilities.ConfigurationReader;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Contact_Stepdefs {

    LoginPage loginPage = new LoginPage();
    BasePage basePage = new BasePage();
    ContactPage contactPage = new ContactPage();

    @Given("User enters username and password")
    public void userEntersUsernameAndPassword() {

        loginPage.loginWithClick("userNameStr", "passwordStr");

    }

    @When("User clicks login button")
    public void userClicksLoginButton() {

        loginPage.loginBtn.click();

    }

    @Given("User click the contact button")
    public void userClickTheContactButton() {

        basePage.contactBtn.click();

    }

    @When("User click on new contact button")
    public void userClickOnNewContactButton() {

        contactPage.newContactBtn.click();
    }

    @And("user enter fullName {string}")
    public void userEnterFullName(String fullname) {
        contactPage.contactFullName.sendKeys(fullname);
    }

    @And("user enters company {string}")
    public void userEntersCompany(String company) {
        contactPage.contactCompany.sendKeys(company);
    }

    @And("user enters title {string}")
    public void userEntersTitle(String title) {
        contactPage.contactTitle.sendKeys(title);
    }

    @And("user enters phone {string}")
    public void userEntersPhone(String phone) {
        contactPage.phoneNumber.sendKeys(phone);
    }

    @And("user enters email {string}")
    public void userEntersEmail(String email) {
        contactPage.email.equals(email);
    }

    @And("user enters address {string}")
    public void userEntersAddress(String address) {
        contactPage.address.sendKeys(address);
    }

    @And("user enters zip {string}")
    public void userEntersZip(String zip) {
        contactPage.zip.sendKeys(zip);
    }

    @And("user enters city {string}")
    public void userEntersCity(String city) {
        contactPage.city.sendKeys(city);
    }

    @And("user enters state {string}")
    public void userEntersState(String state) {
        contactPage.state.sendKeys(state);
    }

    @And("user enters country {string}")
    public void userEntersCountry(String country) {
        contactPage.country.sendKeys(country);
    }

    @And("user should see {string} in the first row of the web table")
    public void userShouldSeeInTheFirstRowOfTheWebTable(String expectedName) {

    }

    @And("User can see all the contacts as a list inside the middle column")
    public void userCanSeeAllTheContactsAsAListInsideTheMiddleColumn() {
    }

    @Then("User see the total number of the contacts near the “All Contacts” tab")
    public void userSeeTheTotalNumberOfTheContactsNearTheAllContactsTab() {
    }
}

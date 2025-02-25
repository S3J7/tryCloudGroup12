package com.trycloud.step_definitions;

import com.trycloud.pages.BasePage;
import com.trycloud.pages.ContactPage;
import com.trycloud.pages.LoginPage;
import com.trycloud.utilities.BrowserUtils;
import com.trycloud.utilities.ConfigurationReader;
import com.trycloud.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class Contact_Stepdefs {

    LoginPage loginPage = new LoginPage();
    ContactPage contactPage = new ContactPage();

    @Given("User enters username and password")
    public void userEntersUsernameAndPassword() {

        loginPage.loginWithClick(ConfigurationReader.getProperty("username"),
                                ConfigurationReader.getProperty( "password"));

    }

//    @When("User clicks login button")
//    public void userClicksLoginButton() {

//        loginPage.loginBtn.click();

//    }

    @Given("User click the contact button")
    public void userClickTheContactButton() {

        BrowserUtils.waitFor(2);
        contactPage.contactBtn.click();

    }

    @When("User click on new contact button")
    public void userClickOnNewContactButton() {

        BrowserUtils.waitFor(2);
        contactPage.newContactBtn.click();
    }

    @And("user enter fullName {string}")
    public void userEnterFullName(String fullname) {

        contactPage.contactFullName.clear();

        contactPage.contactFullName.sendKeys(fullname);
    }

    @And("user enters company {string}")
    public void userEntersCompany(String company) {

        BrowserUtils.waitFor(2);

        contactPage.contactCompany.sendKeys(company);
    }

    @And("user enters title {string}")
    public void userEntersTitle(String title) {

        BrowserUtils.waitFor(2);

        contactPage.contactTitle.sendKeys(title);

    }
    @And("user enters phone {string}")
    public void userEntersPhone(String phone) {

        BrowserUtils.waitFor(2);
        contactPage.phoneNumber.sendKeys(phone);

    }

    @And("user enters email {string}")
    public void userEntersEmail(String email) {

        contactPage.email.sendKeys(email);
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


    ContactPage contacts = new ContactPage();

    @Then("user should see {string} inside the middle column")
    public void userShouldSeeInsideTheMiddleColumn(String expectedList) {

        BrowserUtils.verifyElementDisplayed(contactPage.contactLists);

    }

    @Then("User see the total number of the contacts near the “All Contacts” tab")
    public void userSeeTheTotalNumberOfTheContactsNearTheAllContactsTab() {

        contactPage.totalContacts.isDisplayed();
    }


    @When("User click any contact")
    public void userClickAnyContact() {
        contactPage.jackson.click();
        BrowserUtils.waitFor(4);
    }

    @And("User click on the three dots icon on the right by contact name")
    public void userClickOnTheThreeDotsIconOnTheRightByContactName() {
        contactPage.threeDotButtons.click();

    }

    @And("User click delete")
    public void userClickDelete() {
        contactPage.deleteBtn.click();
    }


    @Then("User should see the total number of the contacts")
    public void userShouldSeeTheTotalNumberOfTheContacts() {

        BrowserUtils.verifyElementDisplayed(contactPage.totalContacts);

    }

    @And("User click Susan")
    public void userClickSusan() {

        contactPage.jackson.click();
    }

    @And("User click the photo icon at the John Doe")
    public void userClickThePhotoIconAtTheJohnDoe() {
        contactPage.photoIcon.click();
    }

    @And("User click choose from files")
    public void userClickChooseFromFiles() {
        contactPage.chooseFromFileBtn.click();

    }

    @And("User choose the picture from file")
    public void userChooseThePictureFromFile() {

        contactPage.ghostPicture.click();

        BrowserUtils.waitFor(3);
    }

    @And("User click choose button")
    public void userClickChooseButton() {

        contactPage.chooseBtn.click();

    }
}

//If need to test for another contact with picture, do we need to locate the new profile picture

//go back to delete picture. It didn't delete (bug)

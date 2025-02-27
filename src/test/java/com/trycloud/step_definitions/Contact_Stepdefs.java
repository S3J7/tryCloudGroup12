package com.trycloud.step_definitions;

import com.trycloud.pages.ContactPage;
import com.trycloud.pages.LoginPage;
import com.trycloud.utilities.BrowserUtils;
import com.trycloud.utilities.ConfigurationReader;
import com.trycloud.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import com.github.javafaker.Faker;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Contact_Stepdefs {

    LoginPage loginPage = new LoginPage();
    ContactPage contactPage = new ContactPage();
    Faker faker = new Faker();


    @Given("User enters username and password")
    public void userEntersUsernameAndPassword() {

        loginPage.loginWithClick(ConfigurationReader.getProperty("username"),
                                ConfigurationReader.getProperty( "password"));

    }

    @Given("User click the contact button")
    public void userClickTheContactButton() {

        BrowserUtils.waitFor(2);
        contactPage.contactBtn.click();

    }

    @When("User click on new contact button")
    public void userClickOnNewContactButton() {


        contactPage.newContactBtn.click();

        BrowserUtils.waitFor(3);
    }


    @And("user enter fullName")
    public void userEnterFullName() {

        contactPage.contactFullName.clear();

        contactPage.contactFullName.sendKeys(faker.name().fullName());


    }

    @And("user enters company")
    public void userEntersCompany() {


        contactPage.contactCompany.sendKeys(faker.company().industry());
    }

    @And("user enters title")
    public void userEntersTitle() {


        contactPage.contactTitle.sendKeys("Tester");
    }

    @And("user enters phone")
    public void userEntersPhone() {


        contactPage.phoneNumber.sendKeys(faker.numerify("###-###-####"));
    }

    @And("user enters email")
    public void userEntersEmail() {


        contactPage.email.sendKeys("abc@gmail.com");
    }

    @And("user enters address")
    public void userEntersAddress() {

        BrowserUtils.waitFor(3);
        contactPage.contactFullName.clear();
        contactPage.address.sendKeys(faker.address().streetAddress());
    }

    @And("user enters zip")
    public void userEntersZip() {

        contactPage.contactFullName.clear();
        contactPage.zip.sendKeys(faker.address().zipCode());
    }

    @And("user enters city")
    public void userEntersCity() {

        contactPage.contactFullName.clear();
        contactPage.city.sendKeys(faker.address().city());

    }

    @And("user enters state")
    public void userEntersState() {

        contactPage.contactFullName.clear();
        contactPage.state.sendKeys(faker.address().state());
    }

    @And("user enters country")
    public void userEntersCountry() {

        contactPage.contactFullName.clear();
        contactPage.country.sendKeys(faker.address().country());
    }

    @Then("user should see expectedName inside the middle column")
    public void userShouldSeeExpectedNameInsideTheMiddleColumn() {

        WebElement middleColumn = Driver.getDriver().findElement(By.xpath("//div[@id='contacts-list']/div"));

        String expectedContact = faker.name().fullName();

        String actualContact = middleColumn.getText();

        Assert.assertEquals(expectedContact, actualContact);
    }



//     @And("user enter fullName {string}")
//    public void userEnterFullName(String fullname) {
//
//        contactPage.contactFullName.clear();
//
//        contactPage.contactFullName.sendKeys(faker.name().firstName());
//    }

//    @And("user enters company {string}")
//    public void userEntersCompany(String company) {
//
//        BrowserUtils.waitFor(2);
//
//        contactPage.contactCompany.sendKeys(company);
//    }
//
//    @And("user enters title {string}")
//    public void userEntersTitle(String title) {
//
//        BrowserUtils.waitFor(2);
//
//        contactPage.contactTitle.sendKeys(title);
//
//    }
//    @And("user enters phone {string}")
//    public void userEntersPhone(String phone) {
//
//        BrowserUtils.waitFor(2);
//        contactPage.phoneNumber.sendKeys(phone);
//
//    }
//
//    @And("user enters email {string}")
//    public void userEntersEmail(String email) {
//
//        contactPage.email.sendKeys(email);
//    }
//
//
//    @And("user enters address {string}")
//    public void userEntersAddress(String address) {
//
//        contactPage.address.sendKeys(address);
//    }
//
//
//    @And("user enters zip")
//    public void userEntersZip() {
//
//        contactPage.zip.sendKeys(faker.address().zipCode());
//    }
//
//    @And("user enters city {string}")
//    public void userEntersCity(String city) {
//
//        contactPage.city.sendKeys(city);
//    }
//
//    @And("user enters state {string}")
//    public void userEntersState(String state) {
//
//        contactPage.state.sendKeys(state);
//    }
//
//    @And("user enters country {string}")
//    public void userEntersCountry(String country) {
//
//        contactPage.country.sendKeys(country);
//    }

//    @Then("user should see {string} inside the middle column")
//    public void userShouldSeeInsideTheMiddleColumn(String contactLists) {
//
//        WebElement middleColumn = Driver.getDriver().findElement(By.xpath("//div[@id='contacts-list']/div"));
//
//        String expectedContact = faker.name().fullName();
//
//        String actualContact = middleColumn.getText();
//
//        Assert.assertEquals(expectedContact, actualContact);
//    }

    @Then("User see the total number of the contacts near the “All Contacts” tab")
    public void userSeeTheTotalNumberOfTheContactsNearTheAllContactsTab() {

        contactPage.totalContactNumbers.isDisplayed();
    }



    @When("User click any contact")
    public void userClickAnyContact() {

        List<WebElement> contacts = Driver.getDriver().findElements(By.xpath("//div[@id='contacts-list']/div"));

        if (!contacts.isEmpty()) {
            contacts.get(0).click();
        } else {
            System.out.println("No contacts found!");
        }

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

        BrowserUtils.verifyElementDisplayed(contactPage.totalContactNumbers);

    }



    @And("User click the photo icon at any contact")
    public void userClickThePhotoIconAtAnyContact() {

        List<WebElement> contacts = Driver.getDriver().findElements(By.xpath("//div[@id='contacts-list']/div"));

        if (!contacts.isEmpty()) {

            WebElement firstContact = contacts.get(0);


            WebElement photoIcon = firstContact.findElement(By.xpath("//div[contains(@aria-describedby,'popover')]//button[@aria-controls='menu-kytrg']"));

            photoIcon.click();

            System.out.println("Photo icon clicked for the first contact.");

        } else {

            System.out.println("No contacts found!");
        }


    }

//    @And("User click the photo icon at the John Doe")
//    public void userClickThePhotoIconAtTheJohnDoe() {
//        contactPage.photoIcon.click();
//    }

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

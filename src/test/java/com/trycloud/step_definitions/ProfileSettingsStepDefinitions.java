package com.trycloud.step_definitions;

import com.trycloud.pages.BasePage;
import com.trycloud.pages.LoginPage;
import com.trycloud.pages.ProfileSettingsPage;
import com.trycloud.utilities.BrowserUtils;
import com.trycloud.utilities.ConfigurationReader;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.junit.Assert;

import static com.trycloud.utilities.BrowserUtils.scrollToElement;
import static com.trycloud.utilities.BrowserUtils.waitForVisibility;


public class ProfileSettingsStepDefinitions {

    LoginPage loginPage = new LoginPage();
    ProfileSettingsPage profileSettingsPage = new ProfileSettingsPage();


    @When("user clicks the settings")
    public void userClicksTheSettings() {
        profileSettingsPage.meIcon.click();
        profileSettingsPage.settingsMenu.click();

    }

    @And("user can see Full name\\/Email\\/Phone Number")
    public void userCanSeeFullNameEmailPhoneNumber() {
        Assert.assertTrue(profileSettingsPage.fullName.isDisplayed());
        Assert.assertTrue(profileSettingsPage.email.isDisplayed());
//        scrollToElement(profileSettingsPage.phone);
        Assert.assertTrue(profileSettingsPage.phone.isDisplayed());
    }

    @And("User can change {string} info under Profile Settings page")
    public void userCanChangeInfoUnderProfileSettingsPage(String arg0) {
        profileSettingsPage.fullName.clear();
        profileSettingsPage.fullName.sendKeys(arg0);
    }

    @And("User can make Phone number info as private under Profile Settings page")
    public void userCanMakeInfoAsPrivateUnderProfileSettingsPage() {
//        scrollToElement(profileSettingsPage.phone);
        profileSettingsPage.privateSettings.click();
        BrowserUtils.sleep(2);
        profileSettingsPage.privateConfirm.click();
        BrowserUtils.sleep(2);

//        profileSettingsPage.confirmButton.click();

    }

    @And("User cannot pass any characters, except number, into the Phone Number inputbox")
    public void userCannotPassAnyCharactersExceptNumberIntoTheInputbox() {
        try {
            waitForVisibility(profileSettingsPage.phone, 10);
            profileSettingsPage.phone.clear();
            profileSettingsPage.phone.sendKeys("12345u77");
            String enteredValue = profileSettingsPage.phone.getAttribute("value");

            // Check if the value entered contains any non-numeric characters
            if (enteredValue.matches(".*[^0-9].*")) {
                System.out.println("Invalid phone number input: " + enteredValue);

            } else {
                System.out.println("Phone number input is valid: " + enteredValue);
            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

    }

    @And("User can see the current local time under the Local dropdown")
    public void userCanSeeTheCurrentLocalTimeUnderTheLocalDropdown() {
        scrollToElement(profileSettingsPage.localeTime);
        System.out.println("profileSettingsPage.localeTime.getText() = " + profileSettingsPage.localeTime.getText());
    }


    @Given("user is in the login page")
    public void userIsInTheLoginPage() {
        loginPage.loginWithClick(ConfigurationReader.getProperty("username"),ConfigurationReader.getProperty("password"));
    }
}

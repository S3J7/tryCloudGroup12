package com.trycloud.step_definitions;

import com.trycloud.pages.FolderViewPage;
import com.trycloud.pages.LoginPage;
import com.trycloud.utilities.BrowserUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

public class FolderView_StepDefinitions {

    LoginPage loginPage = new LoginPage();
    FolderViewPage folderViewPage = new FolderViewPage();

    // first scenario NAME

    @Given("user is logged in with valid credentials and user clicks on loginbutton")
    public void userIsLoggedInWithValidCredentialsAndUserClicksOnLoginbutton() {
        loginPage.loginWithClick("Employee12", "Employee123");
    }


    @When("user clicks on folder files icon")
    public void user_clicks_on_folder_files_icon() {
        folderViewPage.folderImage.click();
        BrowserUtils.waitFor(5);
    }

    @Given("user clicks on Name icon")
    public void user_clicks_on_name_icon() {
        folderViewPage.nameClick.click();

    }

    @Then("user should be able to see list of folders based of their names")
    public void user_should_be_able_to_see_list_of_folders_based_of_their_names() {

        Assert.assertFalse("No folders found", folderViewPage.folders.isEmpty());

        for (WebElement folder : folderViewPage.folders) {

            String folderName = folder.getText();

            Assert.assertFalse("Folder name is empty", folderName.isEmpty());
            Assert.assertTrue("Folder is not visible", folder.isDisplayed());

        }
    }

    // Second scenario SIZE

    @When("user clicks on Size icon")
    public void user_clicks_on_size_icon() {
        folderViewPage.sizeClick.click();

    }

    @Then("user should be able to see list of folders based of their sizes")
    public void user_should_be_able_to_see_list_of_folders_based_of_their_sizes() {
        Assert.assertFalse("No folders found", folderViewPage.folderSize.isEmpty());

        for (WebElement folder : folderViewPage.folderSize) {

            String folderName = folder.getText();

            Assert.assertFalse("Folder name is empty", folderName.isEmpty());
            Assert.assertTrue("Folder is not visible", folder.isDisplayed());

        }
    }


    @When("user clicks on Modified icon")
    public void userClicksOnModifiedIcon() {
        folderViewPage.modifiedClick.click();

    }

    @Then("user should be able to see list of folders based of their Modified dates")
    public void userShouldBeAbleToSeeListOfFoldersBasedOfTheirModifiedDates() {


        Assert.assertFalse("No folders found", folderViewPage.folderModifed.isEmpty());

        for (WebElement folder : folderViewPage.folderModifed) {

            String folderName = folder.getText();

            Assert.assertFalse("Folder name is empty", folderName.isEmpty());
            Assert.assertTrue("Folder is not visible", folder.isDisplayed());

        }
    }


    @When("user clicks on the toggle-view button at the right corner of all files tab screen")
    public void userClicksOnTheToggleViewButtonAtTheRightCornerOfAllFilesTabScreen() {
        folderViewPage.toggleView.click();
    }


    @Then("user should be able to see a list in a view of larger icons")
    public void userShouldBeAbleToSeeAListInAViewOfLargerIcons() {

        Assert.assertFalse("No folders found", folderViewPage.toggleList.isEmpty());

        for (WebElement folder : folderViewPage.toggleList) {

            String folderName = folder.getText();

            Assert.assertFalse("Folder name is empty", folderName.isEmpty());
            Assert.assertTrue("Folder is not visible", folder.isDisplayed());

        }
    }


    @When("user clicks on the select all checkbox at the left top corner of the list")
    public void userClicksOnTheSelectAllCheckboxAtTheLeftTopCornerOfTheList() {
        folderViewPage.checkBox.click();
    }

    @Then("user should be able to see that all checkboxes are checked  and total values of folders and files are displayed correctly")
    public void userShouldBeAbleToSeeThatAllCheckboxesAreCheckedAndTotalValuesOfFoldersAndFilesAreDisplayedCorrectly() {

        Assert.assertTrue("No folders found", folderViewPage.message.isDisplayed());

        for (WebElement checkBox : folderViewPage.checked) {

            boolean isChecked = checkBox.isSelected();
            Assert.assertTrue("The checkbox is not checked", isChecked);
        }
    }


}
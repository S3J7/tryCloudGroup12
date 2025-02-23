package com.trycloud.step_definitions;

import com.trycloud.pages.LoginPage;
import com.trycloud.pages.RecommendedFilePage;
import com.trycloud.utilities.ConfigurationReader;
import com.trycloud.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class FileUploadDeleteStepDefinitions {
    LoginPage loginPage = new LoginPage();
    RecommendedFilePage recommendedFilePage = new RecommendedFilePage();

    @Given("user is on the home pages")
    public void userIsOnTheHomePages() {
        loginPage.loginWithClick(ConfigurationReader.getProperty("username"), ConfigurationReader.getProperty("password"));

    }

    @When("user clicks the new folder menu, they goes to a new page")
    public void userClicksTheNewFolderMenuTheyGoesToANewPage() {
        recommendedFilePage.newFolderMenu.click();
    }

    @And("user clicks the add icon")
    public void userClicksTheAddIcon() {
        recommendedFilePage.addIcon.click();
    }

    @And("choose upload file and upload a file")
    public void chooseUploadFileAndUploadAFile() {

        try {
            WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));

            // Wait for the file upload element to be clickable
            WebElement uploadInput = recommendedFilePage.uploadFile;
            wait.until(ExpectedConditions.elementToBeClickable(uploadInput));

            // Check if the element is enabled and visible before uploading
            if (uploadInput.isEnabled() && uploadInput.isDisplayed()) {
                uploadInput.sendKeys("/Users/osmanjanomar/Desktop/Screen Shot 2025-02-19 at 12.10.20 PM.png");
            } else {
                Assert.fail("File input is not enabled or visible");
            }
        } catch (Exception e) {
            System.err.println("Error while uploading the file: " + e.getMessage());
            Assert.fail("File upload failed: " + e.getMessage());
        }
    }

    @Then("user sees the newly updated file")
    public void userSeesTheNewlyUpdatedFile() {
        System.out.println("recommendedFilePage.uploadedFileName.getText() = " + recommendedFilePage.uploadedFileName.getText());
    }

    @And("user clicks the new folder")
    public void userClicksTheNewFolder() {
        recommendedFilePage.newFolder.click();
    }

    @And("user enters the name of the new folder")
    public void userEntersTheNameOfTheNewFolder() {
        recommendedFilePage.newFolderName.sendKeys("newFolder2");
    }

    @And("click the submit icon")
    public void clickTheSubmitIcon() {
        recommendedFilePage.submitIcon.click();

    }

    @Then("user could see the newly added folder")
    public void userCouldSeeTheNewlyAddedFolder() {
        Assert.assertTrue(recommendedFilePage.uploadResultMessage.getText().contains(recommendedFilePage.uploadedFileName.getText()));
    }

    @Then("user could see the total number of the files and folders")
    public void userCouldSeeTheTotalNumberOfTheFilesAndFolders() {
//        Driver.getDriver().switchTo().frame(recommendedFilePage.filesAndFoldersNumber);
//       System.out.println("filesAndFoldersNumber Displayed: " + recommendedFilePage.filesAndFoldersNumber.isDisplayed());
//        System.out.println("recommendedFilePage.filesAndFoldersNumber.getText() = " + recommendedFilePage.filesAndFoldersNumber.getText());

        System.out.println("recommendedFilePage.fileInfo.getText() = " + recommendedFilePage.fileInfo.getText());
        System.out.println("recommendedFilePage.folderInfo.getText() = " + recommendedFilePage.folderInfo.getText());

//        recommendedFilePage.filesCheckbox.click();

//       Driver.getDriver().switchTo().defaultContent();

    }

    @And("user clicks the three dot to manipulate the file or folder")
    public void userClicksTheThreeDotToManipulateTheFileOrFolder() {
        recommendedFilePage.actionButton.click();
    }

    @And("user select the move or copy option")
    public void userSelectTheMoveOrCopyOption() {
        recommendedFilePage.moveOrCopyButton.click();
    }

    @And("user select a folder to move the item")
    public void userSelectAFolderToMoveTheItem() {
        recommendedFilePage.fileNameThatItemShouldBeAdded.click();
    }

    @And("user clicks the move to new folder button")
    public void userClicksTheMoveToNewFolderButton() {
        recommendedFilePage.moveButton.click();
    }

    @And("user clicks the folder that item has been moved")
    public void userClicksTheFolderThatItemHasBeenMoved() {
        recommendedFilePage.fileNameThatItemShouldBeAdded.click();
    }

    @Then("user could see the item in the folder")
    public void userCouldSeeTheItemInTheFolder() {
        Assert.assertTrue(recommendedFilePage.filesCheckbox.isDisplayed());
    }

    @And("user select a folder to copy the item")
    public void userSelectAFolderToCopyTheItem() {
    }

    @And("user clicks the copy to new folder button")
    public void userClicksTheCopyToNewFolderButton() {
    }

    @And("user clicks the folder that item has been copied")
    public void userClicksTheFolderThatItemHasBeenCopied() {
    }

    @Then("user should see the item in the folder")
    public void userShouldSeeTheItemInTheFolder() {
    }

    @And("user clicks the delete button")
    public void userClicksTheDeleteButton() {
    }
}

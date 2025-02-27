package com.trycloud.step_definitions;

import com.trycloud.pages.LoginPage;
import com.trycloud.pages.RecommendedFilePage;
import com.trycloud.utilities.BrowserUtils;
import com.trycloud.utilities.ConfigurationReader;
import com.trycloud.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import static com.trycloud.utilities.BrowserUtils.scrollToElement;

public class FileUploadDeleteStepDefinitions {
    LoginPage loginPage = new LoginPage();
    RecommendedFilePage recommendedFilePage = new RecommendedFilePage();

    @Given("user is on the home pages")
    public void userIsOnTheHomePages() {
        loginPage.loginWithClick(ConfigurationReader.getProperty("username"), ConfigurationReader.getProperty("password"));

    }

    @When("user clicks the new folder menu, they goes to a new page")
    public void userClicksTheNewFolderMenuTheyGoesToANewPage() {
        recommendedFilePage.filesMenu.click();
    }

    @And("user clicks the add icon")
    public void userClicksTheAddIcon() {
        recommendedFilePage.addIcon.click();
    }

    @And("choose upload file and upload a file")
    public void chooseUploadFileAndUploadAFile() {
//        recommendedFilePage.uploadFile.sendKeys("/Users/osmanjanomar/Desktop/Screen Shot 2025-02-19 at 12.10.20 PM.png");

//        try {
//            WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
//
//            // Wait for the file upload element to be clickable
//            WebElement uploadInput = recommendedFilePage.uploadFile;
//            wait.until(ExpectedConditions.elementToBeClickable(uploadInput));
//
//            // Check if the element is enabled and visible before uploading
//            if (uploadInput.isEnabled() && uploadInput.isDisplayed()) {
//                uploadInput.sendKeys("/Users/osmanjanomar/Desktop/Screen Shot 2025-02-19 at 12.10.20 PM.png");
//            } else {
//                Assert.fail("File input is not enabled or visible");
//            }
//        } catch (Exception e) {
//            System.err.println("Error while uploading the file: " + e.getMessage());
//            Assert.fail("File upload failed: " + e.getMessage());
//        }

        String path = System.getProperty("user.dir") + "/src/test/resources/uploadedFiles/While_-_DoWhile.webp";

        recommendedFilePage.uploadFile.sendKeys(path);
    }

    @Then("user sees the newly updated file")
    public void userSeesTheNewlyUpdatedFile() {
        System.out.println("recommendedFilePage.uploadedFileName.getText() = " + recommendedFilePage.uploadedFileName.getText());
    }

    @And("user clicks the new folder")
    public void userClicksTheNewFolder() {
        recommendedFilePage.addNewFolder.click();
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
        System.out.println("recommendedFilePage.uploadResultMessage.getText() = " + recommendedFilePage.uploadResultMessage.getText());
    }

    @And("user clicks the three dot to manipulate the file or folder")
    public void userClicksTheThreeDotToManipulateTheFileOrFolder() {
        recommendedFilePage.actionButton.click();
    }

    @And("user select the move or copy option")
    public void userSelectTheMoveOrCopyOption() {
        scrollToElement(recommendedFilePage.moveOrCopyButton);
        BrowserUtils.sleep(2);
        recommendedFilePage.moveOrCopyButton.click();
    }

    @And("user select a folder to move the item")
    public void userSelectAFolderToMoveTheItem() {
        recommendedFilePage.fileNameThatItemShouldBeAdded.click();
    }

    @And("user clicks the move to new folder button")
    public void userClicksTheMoveToNewFolderButton() {
        recommendedFilePage.moveToNewFolderButton.click();

    }

    @And("user clicks the folder that item has been moved")
    public void userClicksTheFolderThatItemHasBeenMoved() {
        BrowserUtils.sleep(2);
        recommendedFilePage.fileNameThatItemHasBeenMoved.click();
    }

    @Then("user could see the item in the folder")
    public void userCouldSeeTheItemInTheFolder() {
       Assert.assertTrue(recommendedFilePage.firstFile.isDisplayed());
    }

    @And("user select a folder to copy the item")
    public void userSelectAFolderToCopyTheItem() {
        recommendedFilePage.fileThatItemShouldCopyTo.click();

    }

    @And("user clicks the copy to new folder button")
    public void userClicksTheCopyToNewFolderButton() {
        recommendedFilePage.copyToNewFolderButton.click();
    }

    @And("user clicks the folder that item has been copied")
    public void userClicksTheFolderThatItemHasBeenCopied() {
        BrowserUtils.sleep(2);
        recommendedFilePage.fileNameThatItemHasBeenCopied.click();
    }

    @Then("user should see the item in the folder")
    public void userShouldSeeTheItemInTheFolder() {
        BrowserUtils.sleep(2);
        Assert.assertTrue(recommendedFilePage.firstFile.isDisplayed());
        System.out.println("recommendedFilePage.firstFile.isDisplayed() = " + recommendedFilePage.firstFile.isDisplayed());
    }

    @And("user clicks the three dot to delete the folder")
    public void userClicksTheThreeDotToDeleteTheFolder() {
recommendedFilePage.toBeDeleted.click();
    }

    @And("user clicks the delete button")
    public void userClicksTheDeleteButton() {
        recommendedFilePage.deleteButton.click();
    }



    @Then("user could see the total number of the files and folders")
    public void userCouldSeeTheTotalNumberOfTheFilesAndFolders() {
        BrowserUtils.sleep(2);
//        Driver.getDriver().switchTo().frame(recommendedFilePage.filesAndFoldersNumber);
//       System.out.println("filesAndFoldersNumber Displayed: " + recommendedFilePage.filesAndFoldersNumber.isDisplayed());
//        System.out.println("recommendedFilePage.filesAndFoldersNumber.getText() = " + recommendedFilePage.filesAndFoldersNumber.getText());

//        System.out.println("recommendedFilePage.filesInfo.getText() = " + recommendedFilePage.filesInfo.getText());
        System.out.println("recommendedFilePage.onlyFile.getText() = " + recommendedFilePage.onlyFile.getText());
        System.out.println("recommendedFilePage.connector.getText() = " + recommendedFilePage.connector.getText());
        System.out.println("recommendedFilePage.folderInfo.getText() = " + recommendedFilePage.folderInfo.getText());
//       Driver.getDriver().switchTo().defaultContent();

    }



}

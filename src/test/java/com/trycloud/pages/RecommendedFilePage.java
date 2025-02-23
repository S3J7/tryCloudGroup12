package com.trycloud.pages;

import com.trycloud.utilities.Driver;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;


public class RecommendedFilePage {

    public RecommendedFilePage() {
        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy(xpath = "//div[@id='recommendations']//span[text()='New folder']")
    public WebElement newFolderMenu;

    @FindBy(xpath = "//*[@id=\"controls\"]/div[2]/a")
    public WebElement addIcon;


    @FindBy(xpath = "//*[@id=\"controls\"]/div[2]/div[2]/ul/li[1]/label/span[2]")
    public WebElement uploadFile;


    @FindBy(xpath = "//*[@id=\"controls\"]/div[2]/div[2]/ul/li[2]/a/span[2]")
    public WebElement newFolder;


    @FindBy(xpath = "//td[@class='filename ui-draggable ui-draggable-handle'][1]")
    public WebElement uploadedFileName;


    @FindBy(xpath = "//div[@class='activitysubject']")
    public WebElement uploadResultMessage;


    @FindBy(xpath = "//*[@id=\"fileList\"]/tr[1]/td[1]/label")
    public WebElement firstCheckBox;


    @FindBy(id="//input[@id='select-files-165323']")
    public WebElement filesCheckbox;


    @FindBy(xpath = "//span[@class='nametext']")
    public List<WebElement> filesList;



    @FindBy(xpath = "//*[@id=\"fileList\"]/tr[1]/td[2]/a/span[2]/a[2]/span[1]")
    public WebElement actionButton;


    @FindBy(xpath = "//*[@id=\"selectedActionsList\"]/div/ul/li[4]/a/span[2]")
    public WebElement deleteButton;


    @FindBy(xpath = "//*[@id=\"fileList\"]/tr[1]/td[2]/div/ul/li[6]/a/span[2]")
    public WebElement moveOrCopyButton;


    @FindBy(xpath = "//*[@id=\"body-user\"]/div[11]/div[2]/button[1]")
    public WebElement copyButton;


    @FindBy(xpath = "//button[@class='primary']")
    public WebElement moveButton;


    @FindBy(xpath = "//td[@class='filesummary']")
    public WebElement filesAndFoldersNumber;


    @FindBy(xpath = "//span[@class='fileinfo']")
    public WebElement fileInfo;


    @FindBy(xpath = "//span[@class='dirinfo']")
    public WebElement folderInfo;


    @FindBy(id = "view13-input-folder")
    public WebElement newFolderName;
    // clear and send key to name it;


    @FindBy(xpath = "//input[@class='icon-confirm']")
    public WebElement submitIcon;


    @FindBy(xpath = "//span[@class='filename-parts']")
    public WebElement fileNameThatItemShouldBeAdded;

    @FindBy(xpath = "//button[@class='primary']")
    public WebElement moveToNewFolderButton;



    public void clickMenu(WebElement element) {
        newFolderMenu.click();
    }

    public void uploadFile() {
        uploadFile.sendKeys("/Users/osmanjanomar/Desktop/While_-_DoWhile.webp");
    }
}

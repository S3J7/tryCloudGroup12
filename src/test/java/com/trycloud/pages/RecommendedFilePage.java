package com.trycloud.pages;

import com.trycloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;


public class RecommendedFilePage {

    public RecommendedFilePage() {
        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy(xpath = "//a[@aria-label='Files']")
    public WebElement filesMenu;

    @FindBy(xpath = "//a[@class='button new']")
    public WebElement addIcon;


    @FindBy(css= "#file_upload_start")
    public WebElement uploadFile;


    @FindBy(css = "#recommendations > ul > li:nth-child(4) > a > div.details > div.file-name > span")
    public WebElement newFolderMenu;


    @FindBy(xpath = "//td[@class='filename ui-draggable ui-draggable-handle'][1]")
    public WebElement uploadedFileName;


    @FindBy(xpath = "//div[@class='activitysubject']")
    public WebElement uploadResultMessage;


    @FindBy(xpath = "//*[@id=\"controls\"]/div[2]/div[2]/ul/li[2]/a/span[2]")
    public WebElement addNewFolder;


    @FindBy(xpath = "//*[@id=\"fileList\"]/tr[1]/td[1]/label")
    public WebElement firstCheckBox;


    @FindBy(xpath="//tr[@data-file='Readme.md']")
    public WebElement firstFile;


    @FindBy(xpath = "//span[@class='nametext']")
    public List<WebElement> filesList;



    @FindBy(xpath = "//tr[@data-file='Readme.md']//span[@class='icon icon-more']")
    public WebElement actionButton;


    @FindBy(xpath = "//li[@class=' action-delete-container']//a//span['text()=Delete file']")
    public WebElement deleteButton;


    @FindBy(xpath = "//li[@class=' action-movecopy-container']//span[text()='Move or copy']")
    public WebElement moveOrCopyButton;


    @FindBy(xpath = "//*[@id=\"body-user\"]/div[11]/div[2]/button[1]")
    public WebElement copyButton;


    @FindBy(xpath = "//button[@class='primary']")
    public WebElement moveButton;


    @FindBy(xpath = "//td[@class='filesummary']")
    public WebElement filesAndFoldersNumber;


    @FindBy(xpath = "//td[@class='filesummary']//span[@class='info']")
    public WebElement filesInfo;


    @FindBy(xpath = "//span[@class='dirinfo']")
    public WebElement folderInfo;


    @FindBy(xpath = "//span[@class='fileinfo']")
    public  WebElement onlyFile;


    @FindBy(xpath = "//span[@class='connector']")
    public WebElement connector;


    @FindBy(id = "view13-input-folder")
    public WebElement newFolderName;
    // clear and send key to name it;


    @FindBy(xpath = "//input[@class='icon-confirm']")
    public WebElement submitIcon;


    @FindBy(xpath = "//tr[@data-entryname='New folder']")
    public WebElement fileNameThatItemShouldBeAdded;

    @FindBy(xpath = "//button[@class='primary']")
    public WebElement moveToNewFolderButton;

    @FindBy(xpath ="//a[@class='name']//span[text()='New folder']")
    public WebElement fileNameThatItemHasBeenMoved;


    @FindBy(xpath = "//tr[@data-entryname='3']")
    public  WebElement fileThatItemShouldCopyTo;


    @FindBy(xpath = "//button[text()='Copy to 3']")
    public WebElement copyToNewFolderButton;


    @FindBy(xpath = "//span[@class='nametext']//span[.='3']/..")
    public WebElement fileNameThatItemHasBeenCopied;


    @FindBy(xpath = "//tr[@data-file='newFolder2']//span[@class='icon icon-more']")
    public WebElement toBeDeleted;



    public void clickMenu(WebElement element) {
        newFolderMenu.click();
    }

    public void uploadFile() {
        uploadFile.sendKeys("/Users/osmanjanomar/Desktop/While_-_DoWhile.webp");
    }
}

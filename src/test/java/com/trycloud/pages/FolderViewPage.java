package com.trycloud.pages;

import com.trycloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class FolderViewPage {

    public FolderViewPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
//Locators
    @FindBy(xpath = "(//a[contains(.,'Files')])[1]")
    public WebElement folderImage;

    @FindBy(xpath = "(//a[contains(.,'Name')])[1]")
    public WebElement nameClick;

    @FindBy(xpath = "(//a[contains(.,'Size')])[1]")
    public WebElement sizeClick;

    @FindBy(xpath = "(//a[contains(.,'Modified')])[1]")
    public WebElement modifiedClick;

    @FindBy(xpath = "//label[@id='view-toggle']")
    public WebElement toggleView;

    @FindBy(xpath = "//table[@id='filestable']/thead/tr[1]/th[1]")
    public WebElement checkBox;

    @FindBy(xpath = "//tbody[@id='fileList']//tr/td[@class='filename ui-draggable ui-draggable-handle']")
    public List<WebElement> folders;

    @FindBy(xpath = "//td[@class='filesize']")
    public List<WebElement> folderSize;

    @FindBy(xpath = "//span[@class='modified live-relative-timestamp']")
    public List<WebElement> folderModifed;

    @FindBy(xpath = "//tbody[@id='fileList']//tr")
    public List<WebElement> toggleList;

    @FindBy(xpath = "//a[contains(.,'3 folders and 2 file')]")
    public WebElement message;

    @FindBy(xpath = "//input[@class='selectCheckBox checkbox']")
    public List<WebElement> checked;





}

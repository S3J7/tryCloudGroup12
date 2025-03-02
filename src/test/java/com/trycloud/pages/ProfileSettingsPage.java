package com.trycloud.pages;

import com.trycloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProfileSettingsPage {

    public ProfileSettingsPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "//div[@class='avatardiv avatardiv-shown']")
    public WebElement meIcon;


    @FindBy(xpath = "//li[@data-id='settings']")
    public WebElement settingsMenu;


    @FindBy(xpath = "//input[@id='displayname']")
    public WebElement fullName;


    @FindBy(xpath = "//input[@id='email']")
    public WebElement email;


    @FindBy(xpath = "//input[@id='phone']")
    public WebElement phone;


    @FindBy(xpath = "//span[@class='icon-federation-menu icon-password']")
    public WebElement privateSettings;



    @FindBy(xpath = "//*[@id=\"phoneform\"]/h3/div/div/ul/li[1]/a/span")
    public WebElement privateConfirm;


    @FindBy(xpath = "//input[@placeholder='Password']")
    public WebElement passwordConfirm;


    @FindBy(xpath = "//button[text()='Confirm']")
    public WebElement confirmButton;

    @FindBy(id="localeexample")
    public WebElement localeTime;
}

package com.trycloud.pages;

import com.trycloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactPage {

    public ContactPage() {

        PageFactory.initElements(Driver.getDriver(), this);
    }

    //contact name

    @FindBy(id = "OTZmY2U5OWQtYmI0YS00Y2ZkLTliNzYtYmYxYzRjOTFjZDdkfmNvbnRhY3")
    public WebElement john;


    //Buttons

    @FindBy(id = "new-contact-button")
    public WebElement newContactBtn;

    @FindBy(xpath = "//span[@class='app-navigation-entry__title']")
    public WebElement allContactsBtn;

    @FindBy(xpath = "//span[@title='Not grouped']")
    public WebElement notGroupBtn;

    @FindBy(xpath = "//span[@title='+ New group']")
    public WebElement newGroup;

    @FindBy(xpath = "//input[@class='action-input__input focusable']")
    public WebElement placeHolder;

    @FindBy(xpath = "//button[@class='primary']")
    public WebElement addContactToGroup;

    @FindBy(xpath = "//span[@title='school']")
    public WebElement schoolGroup;

    @FindBy(xpath = "//div[contains(text(),'1')]")
    public WebElement groupTotalMembers;

//Form Web elements

    @FindBy(id = "contact-fullName")
    public WebElement contactFullName;

    @FindBy(id = "contact-org")
    public WebElement contactCompany;

    @FindBy(id = "contact-title")
    public WebElement contactTitle;

    @FindBy(xpath = "//input[@inputmode='tel']")
    public WebElement phoneNumber;

    @FindBy(xpath = "//input[@inputmode='email']")
    public WebElement email;


//Address

    @FindBy(xpath = "//input[@fdprocessedid='r536ok']")
    public WebElement POBox;

    @FindBy(xpath = "//input[@fdprocessedid='hl8z6']")
    public WebElement address;

    @FindBy(xpath = "//input[@fdprocessedid='iwuvae']")
    public WebElement zip;

    @FindBy(xpath = "//input[@fdprocessedid='x2a3n']")
    public WebElement city;

    @FindBy(xpath = "//input[@fdprocessedid='16wiv']")
    public WebElement state;

    @FindBy(xpath = "//input[@fdprocessedid='gg4rv']")
    public WebElement country;


}




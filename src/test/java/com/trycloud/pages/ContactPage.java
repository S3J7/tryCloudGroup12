package com.trycloud.pages;

import com.trycloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactPage {

    public ContactPage() {

        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//li[@data-id='contacts']")
    public WebElement contactBtn;


    //FILES
    @FindBy(xpath = "//span[.='ghost.jpg']")
    public WebElement ghostPicture;

    //contact name


    @FindBy(xpath = "//div[contains(text(), 'Jackson Floyd')]")
    public WebElement jackson;


    @FindBy(id = "contacts-list")
    public WebElement contactLists;



    //Buttons

    @FindBy(xpath = "//button[@id='new-contact-button']")
    public WebElement newContactBtn;


    @FindBy(xpath = "//div[@class='app-navigation-entry__utils']")
    public WebElement totalContacts;

    @FindBy(xpath = "(//div[@class='trigger'])[8]")
    public WebElement threeDotButtons;

    @FindBy(xpath = "(//button[@class='action-button focusable'])[6]")
    public WebElement deleteBtn;

    @FindBy(xpath = "(//button[@aria-label='Actions'])[7]")
    public WebElement photoIcon;

    @FindBy(xpath = " (//button[@class='action-button focusable'])[6]")
    public WebElement chooseFromFileBtn;

    @FindBy (xpath = "//button[.='Choose']")
    public WebElement chooseBtn;


//Form Web elements

    @FindBy(xpath = "//input[@id='contact-fullname']")
    public WebElement contactFullName;

    @FindBy(id = "contact-org")
    public WebElement contactCompany;

    @FindBy(id = "contact-title")
    public WebElement contactTitle;

    @FindBy(xpath = "//input[@inputmode='tel']")
    public WebElement phoneNumber;

    @FindBy(xpath = "(//input[@type='text'])[8]")
    public WebElement email;


//Address

    @FindBy(xpath = "(//input[@type='text'])[10]")
    public WebElement POBox;

    @FindBy(xpath = "(//input[@type='text'])[11]")
    public WebElement address;

    @FindBy(xpath = "(//input[@type='text'])[13]")
    public WebElement zip;

    @FindBy(xpath = "(//input[@type='text'])[14]")
    public WebElement city;

    @FindBy(xpath = "(//input[@type='text'])[15]")
    public WebElement state;

    @FindBy(xpath = "(//input[@type='text'])[16]")
    public WebElement country;

}




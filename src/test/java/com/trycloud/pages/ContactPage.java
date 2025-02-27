package com.trycloud.pages;

import com.trycloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ContactPage {

    public ContactPage() {

        PageFactory.initElements(Driver.getDriver(), this);
    }




    //FILES

    @FindBy(xpath = "//span[.='ghost.jpg']")
    public WebElement ghostPicture;



    //contact name / lists


    @FindBy(xpath = "//div[@id='contacts-list']/div")

    public List<WebElement> middleColumn;




    //Buttons

    @FindBy(xpath = "//li[@data-id='contacts']")
    public WebElement contactBtn;

    @FindBy(xpath = "//button[@id='new-contact-button']")
    public WebElement newContactBtn;


    @FindBy(xpath = "//div[@class='app-navigation-entry__utils']")
    public WebElement totalContactNumbers;

    @FindBy(xpath = "//div[contains(@class, 'header-menu')]//button[@aria-label='Actions' and @aria-haspopup='true']")
                          //div[contains(@class, 'property__label') and normalize-space(text())='Address']/following-sibling::input[@type='text']
    public WebElement threeDotButtons;

    @FindBy(xpath = "(//div[@class='popover__wrapper'])//span[text()='Delete']")
    public WebElement deleteBtn;

    @FindBy(xpath = "//div[contains(@class, 'contact-header-avatar__menu')]//button[@aria-label='Actions']")
    public WebElement photoIcon;

    @FindBy(xpath = "//ul//li[contains(@class, 'action')]//button//span[text()='Choose from Files']")
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

    @FindBy(xpath = "//input[@inputmode='email']")
    public WebElement email;


//Address


    @FindBy(xpath = "//div[@class='property__label' and normalize-space()='Address']/following-sibling::input[@type='text' and @class='property__value']")
    public WebElement address;

    @FindBy(xpath = "//div[@class='property__label' and normalize-space()='Postal code']/following-sibling::input[@type='text' and @class='property__value']")
    public WebElement zip;

    @FindBy(xpath = "//div[@class='property__label' and normalize-space()='City']/following-sibling::input[@type='text' and @class='property__value']")
    public WebElement city;

    @FindBy(xpath = "//div[@class='property__label' and normalize-space()='State or province']/following-sibling::input[@type='text' and @class='property__value']")
    public WebElement state;

    @FindBy(xpath = "//div[@class='property__label' and normalize-space()='Country']/following-sibling::input[@type='text' and @class='property__value']")
    public WebElement country;


}




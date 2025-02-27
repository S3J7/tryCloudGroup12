package com.trycloud.pages;


import com.trycloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.json.JsonOutput;
import org.openqa.selenium.support.FindBy;

import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DashboardPage {

    public DashboardPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    //locating the dashboard page logo with xpath
    @FindBy(xpath = "//div[@class='logo logo-icon']")
    public WebElement logo;

    public boolean isLogoDisplayed() {
        return logo.isDisplayed();
    }

    //Locating username with xpath
    @FindBy(xpath = "//div[@class='John doe']")
    public WebElement userNameText;

    public boolean isUserNameDisplayed() {
        return userNameText.isDisplayed();
    }







    //Locating dashboard modules in List.
    @FindBy(xpath = "//ul[@id='appmenu']")
    public List<WebElement> dashboardModules;

    public static List<String>getElementsText(List<WebElement> list){

        List<String> elementsText = new ArrayList<>();
        for(WebElement element : list){
            elementsText.add(element.getText().trim());
        }
        return elementsText;
    }

    //Locating customize button with xpath
    @FindBy(xpath = "//a[.='Customize']")
    public WebElement customizeButton;

    //Locating status widget with xpath
    @FindBy(xpath = "//label[@class='icon-user-status-online']")
    public WebElement statusWidget;

    public boolean isstatusWidgetDisplayed() {
        return statusWidget.isDisplayed();
    }



    //Locating background pictures with xpath
    @FindBy(xpath = "//div[@class='background-selector']/button")
    public WebElement backgroundPictures;


    @FindBy(xpath = "//div[@class='background-selector']/button[2]")
    public WebElement selectBackgroundPicture;


    //Locating set status widget with xpath
    @FindBy(xpath = "//button[@class='user-status-menu-item__toggle user-status-menu-item__toggle--inline']")
    public WebElement setStatusWidget;

    //Locating online status option with xpath
    @FindBy(xpath = "//label[@for='user-status-online-status-online']")
    public WebElement statusOnline;

    //Locating Status messages with xpath
    @FindBy(xpath = "//div[@class='predefined-statuses-list']")
   public WebElement statusMessages;







}



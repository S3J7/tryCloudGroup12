package com.trycloud.pages;


import com.trycloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class DashboardPage {

    public DashboardPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    //locating the dashboard page logo with xpath
    @FindBy(xpath = "//div[@class='logo logo-icon']")
    public WebElement logo;


    //Locating username  with xpath

    @FindBy(xpath = "//span[@title='Employee12']")
    public WebElement userNameText;

    }

    //Locating dashboard modules in List.
    @FindBy(xpath = "//ul[@id='appmenu']/li")
    public List<WebElement> dashboardModules;




    //Locating customize button with xpath
    @FindBy(xpath = "//a[.='Customize']")
    public WebElement customizeButton;



    //Locating status widget with xpath
    @FindBy(xpath = "//label[@class='icon-user-status-online']")
    public WebElement statusWidget;



    //Locating background pictures with xpath
    @FindBy(xpath = "//div[@class='background-selector']/button")
    public WebElement backgroundPictures;

    @FindBy(xpath = "//div[@class='background-selector']/button[2]")
    public WebElement selectBackgroundPicture;

    //Locating set status widget with xpath
    @FindBy(xpath = "//button[@class='user-status-menu-item__" +
            "toggle user-status-menu-item__toggle--inline']")
    public WebElement setStatusWidget;

    @FindBy(xpath = "//label[@for='user-status-online-status-online']")
    public WebElement statusOnline;


}




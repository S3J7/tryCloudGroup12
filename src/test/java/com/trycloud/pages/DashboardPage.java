package com.trycloud.pages;


import com.trycloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class DashboardPage extends LoginPage {



    public class dashboardPage {


        @FindBy(xpath = "//span[@title='Employee12']") // User name locator by xpath.
        WebElement userNameElement;

        @FindBy(xpath = "//ul[@id='appmenu']") //  dashboard modules locator by xpath.
        List<WebElement> dashboardModules;



        public String getUsername() {
            return userNameElement.getText();
        }

        public String ModulesAreDisplayed() {
            return ModulesAreDisplayed().toString();
        }

    }

}




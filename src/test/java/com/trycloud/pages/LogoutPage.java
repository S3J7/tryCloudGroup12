package com.trycloud.pages;

import com.trycloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogoutPage {

    public LogoutPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "(//div[@role='button'])[3]")
    public WebElement userIcon_Button;

    @FindBy(xpath = "//li[@data-id='logout']")
    public WebElement logout_Button;

    public void click_on_logout(){
        userIcon_Button.click();
        logout_Button.click();
    }

}

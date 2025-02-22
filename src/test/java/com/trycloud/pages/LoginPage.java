package com.trycloud.pages;


import com.trycloud.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPage {

    public LoginPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "user")
    public WebElement userName;

    @FindBy(id = "password")
    public WebElement password;

    @FindBy(id = "submit-form")
    public WebElement loginBtn;

    @FindBy(xpath = "//p[@class='warning wrongPasswordMsg']")
    public WebElement WrongMessage;

    @FindBy(xpath = "//img[@src='/core/img/actions/toggle.svg']")
    public WebElement iconBtn;

    @FindBy(id = "lost-password")
    public WebElement forgotPasswordLink;

    @FindBy(id = "reset-password-submit")
    public WebElement resetPasswordBtn;

    @FindBy(css = "a[href='#']")
    public WebElement loginBackBtn;

    public void loginWithClick(String userNameStr, String passwordStr) {
        userName.sendKeys(userNameStr);
        password.sendKeys(passwordStr);
        loginBtn.click();
    }
}
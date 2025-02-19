package com.trycloud.pages;

import com.trycloud.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;


public abstract class BasePage {

    public BasePage(){
        PageFactory.initElements(Driver.getDriver(), this);

    }

    public void contactMenu(String text){
        String locator = "(//span[.='"+text+"'])[1]";
        Driver.getDriver().findElement(By.xpath(locator));


    }

}

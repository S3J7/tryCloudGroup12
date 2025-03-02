package com.trycloud.pages;

import com.trycloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DeckPage {

    public DeckPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//ul[@id='appmenu']//li[10]")
    public WebElement deckButton;

    @FindBy(xpath = "//*[@id=\"app-navigation-vue\"]/a")
    public WebElement openDeckButton;

    @FindBy(xpath = "//div[@class='app-navigation-entry-icon icon-add']")
    public WebElement createDeckButton;

    @FindBy(xpath = "//*[@placeholder='Board name']")
    public WebElement deckInputBox;

    @FindBy(xpath = "//span[@title='New Board 2']")
    public WebElement newCreatedDeck;





}

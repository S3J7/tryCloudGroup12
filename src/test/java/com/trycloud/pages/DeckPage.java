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

    @FindBy(xpath = "//input[@class='no-close']")
    public WebElement createListBox;

    @FindBy(xpath = "//*[contains(text(), 'List 1')]")
    public WebElement newCreatedList;

    @FindBy(xpath = "//span[@title='New Board 2']//parent::a//following-sibling::div")
    public WebElement deckOptionsList;

    @FindBy(xpath = "//span[.='Delete board']")
    public WebElement deleteBoardOption;

    @FindBy(xpath = "//button[@class='error primary']")
    public WebElement deleteButton;

    @FindBy(css = "#app-content-vue > div > div.board > div > div > div > div.stack__header > div > div > div > button")
    public WebElement addCardButton;

    @FindBy(xpath = "//input[@id='new-stack-input-main']")
    public WebElement cardInputBox;

    @FindBy(xpath = "//div[@class='card-upper']")
    public WebElement newCard;

    @FindBy(xpath = "//button[@aria-controls='menu-hxhus']")
    public WebElement card3dots;

    @FindBy(xpath = "//span[normalize-space()='Assign to me']")
    public WebElement assignToMeOption;

    @FindBy(xpath = "//div[@class='avatardiv popovermenu-wrapper has-tooltip']//img")
    public WebElement assignToMe;

    @FindBy(xpath = "//span[normalize-space()='Move card']")
    public WebElement moveCardOption;

    @FindBy(xpath = "//input[@placeholder='Select a board']")
    public WebElement selectABoardOption;

    @FindBy(xpath = "//span[@class='name-parts__first'][normalize-space()='New Board']")
    public WebElement newBoardOption;

    @FindBy(xpath = "//input[@placeholder='Select a list']")
    public WebElement selectListOption;

    @FindBy(xpath = "//div[@class='multiselect multiselect--active multiselect--single']//span[@class='multiselect__option multiselect__option--highlight']")
    public WebElement newListOption;

    @FindBy(xpath = "//button[@class='primary']")
    public WebElement moveCardButton;

    @FindBy(xpath = "//li[@class='app-navigation-entry router-link-exact-active active']//a[@class='app-navigation-entry-link']")
    public WebElement newBoardLink;


//    @FindBy(xpath = "//input[@placeholder='Select a list']")
//    public WebElement selectListOption;
//    @FindBy(xpath = "//input[@placeholder='Select a list']")
//    public WebElement selectListOption;







}

package com.trycloud.pages;

import com.trycloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class TalkPage {


    public TalkPage() {

        PageFactory.initElements(Driver.getDriver(), this);
    }
    //1 Scenario
    @FindBy(xpath = "(//a[contains(.,'Talk')])[1]")
    public WebElement Talkbtn;

    @FindBy(xpath = "//button[@aria-label='Create a new group conversation']")
    public WebElement Plusicon;


    @FindBy(xpath = "//input[@placeholder='Conversation name']")
    public WebElement ConversationList;

    @FindBy(xpath ="//button[@class='navigation__button navigation__button-right primary']")
    public WebElement AddConversation;

    @FindBy(xpath= "//input[@placeholder='Search participants']")
    public WebElement Searchbox;



    @FindBy(xpath = "//div[@class=\"participants-search-results scrollable\"]//ul//li[4]")
    public WebElement addcontact;

    @FindBy(xpath = "//button[@class='navigation__button navigation__button-right primary']")
    public WebElement Createconversation;
//2 Scenario
    @FindBy(xpath = "//a[@id='conversation_adadbndk']")
    public WebElement AnyConversation;

    @FindBy(xpath = "//button[@rel='noreferrer noopener']")
    public WebElement userSettings;

    @FindBy(xpath = "//a[@id='participants']")
    public WebElement participants;
    @FindBy(xpath = "//input[@placeholder='Add participants to the conversation']")
    public WebElement addParticipantbox;

    @FindBy(xpath = "(//a[contains(.,\"Cydeo1\")])[1]")
    public WebElement participantname;


//3 Scenario //user is able to see displayed list under talk module


    @FindBy(xpath = "//ul[@class='app-navigation__list']")
    public  WebElement getConversationList;
    ////ul[contains(@class,'conversations')]

    //4 Scenario
    @FindBy(xpath = "//a[@id='conversation_adadbndk']")
    public WebElement conversation;

    @FindBy(xpath = "//button[@class='top-bar__button top-bar__button primary']")
    public WebElement Startcallbtn;

    @FindBy(xpath = "//button[@class='top-bar__button error top-bar__button']")
    public WebElement Leavecallbtn;
    //5 Scenario
    @FindBy(xpath ="//div[@class='trigger'][1]")
    public WebElement threeDots;

    @FindBy(xpath = "//span[.='Delete conversation']")
    public WebElement deleteconversation;
    @FindBy(xpath = "//button[@class='primary']")
    public WebElement YesBtn;


}



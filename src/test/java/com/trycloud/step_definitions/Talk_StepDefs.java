package com.trycloud.step_definitions;

import com.trycloud.pages.LoginPage;
import com.trycloud.pages.TalkPage;
import com.trycloud.utilities.BrowserUtils;
import com.trycloud.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Talk_StepDefs {

    LoginPage loginPage = new LoginPage();
    TalkPage talkPage = new TalkPage();

// 1 Scenario user is able to create new conversation
    @Given("User is logged in with valid credentials")
    public void userIsLoggedInWithValidCredentials() {
        loginPage.loginWithClick("Employee12", "Employee123");
    }

    @When("User click on talk module")
    public void userClickOnTalkModule() {
        talkPage.Talkbtn.click();
    }

    @And("User click on + icon")
    public void userClickOnIcon() {
        talkPage.Plusicon.click();
    }

    @And("User gives a name the conversation")
    public void userGivesANameTheConversation() {

        talkPage.ConversationList.sendKeys("CYDEO");
        BrowserUtils.sleep(3);


    }

    @And("User clicks on Add Participants")
    public void userClicksOnAddParticipants() {
        BrowserUtils.sleep(5);
        talkPage.AddConversation.click();



    }

    @And("User clicks on search box")
    public void userClicksOnSearchBox() {
      BrowserUtils.sleep(2);
        talkPage.Searchbox.click();
    }

    @And("user adds the new contact")
    public void userAddsTheNewContact() {
        BrowserUtils.sleep(2);
        talkPage.addcontact.click();

    }


    @Then("User clicks on create conversation")
    public void userClicksOnCreateConversation () {
        talkPage.Createconversation.click();
    }

  //2 scenario User adds any contact to any conversation
    @And("User clicks on any conversation")
    public void userClicksOnAnyConversation() {
        talkPage.AnyConversation.click();
    }

    @And("User clicks on user settings on top on right of conversation")
    public void userClicksOnUserSettingsOnTopOnRightOfConversation() {
       // talkPage.userSettings.click();
        BrowserUtils.sleep(2);
    }
    @And("User clicks on Participants")
    public void userClicksOnParticipants()  {
        talkPage.participants.click();
        BrowserUtils.sleep(2);

    }

    @And("User clicks on Add Participants box")
    public void userClicksOnAddParticipantsBox() {;

        talkPage.addParticipantbox.click();
        BrowserUtils.sleep(1);
        talkPage.addParticipantbox.sendKeys("c");


    }

    @Then("User clicks on name")
    public void userClicksOnName() {
        talkPage.participantname.click();

    }
//3 Scenario user is able to see al conversation list displayed under talk module

    @Then("User should see all conversation list displayed under TalkModule")
    public void userShouldSeeAllConversationListDisplayedUnderTalkModule () {
        BrowserUtils.verifyElementDisplayed(talkPage.getConversationList);
    }

    @And("User click on conversation")
    public void userClickOnConversation () {
        talkPage.conversation.click();
    }
    //4 Scenario user is able to start an call and leave the call

    @And("User clicks on Start call button")
    public void userClicksOnStartCallButton () {

// Click the start call button
        BrowserUtils.sleep(3);
        talkPage.Startcallbtn.click();

    }

    @Then("User Clicks on Leave call button")
    public void userClicksOnLeaveCallButton () {
        BrowserUtils.sleep(3);
        talkPage.Leavecallbtn.click();
    }
//5 Scenario user is able to delete any conversation
    @And("User clicks on three dots button in right corner of conversation")
    public void userClicksOnThreeDotsButtonInRightCornerOfConversation () {
        BrowserUtils.sleep(3);
        talkPage.threeDots.click();


    }


    @Then("user clicks on Delete Conversation")
    public void userClicksOnDeleteConversation () {
        BrowserUtils.sleep(3);
        talkPage.deleteconversation.click();
    }

    @Then("User clicks on Yes button on displayed message")
    public void userClicksOnYesButtonOnDisplayedMessage () {
        BrowserUtils.sleep(3);
        talkPage.YesBtn.click();
    }



}

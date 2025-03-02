package com.trycloud.step_definitions;
import com.trycloud.pages.DeckPage;
import com.trycloud.utilities.BrowserUtils;
import com.trycloud.utilities.ConfigurationReader;
import com.trycloud.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class DeckStepDefs {

    DeckPage deckPage = new DeckPage();


    @When("The user clicks on the deck icon")
    public void the_user_clicks_on_the_deck_icon() {
        deckPage.deckButton.click();
    }

    @When("User clicks to expand")
    public void user_clicks_to_expand() {
        deckPage.openDeckButton.click();

    }
    @When("User clicks Add board")
    public void user_clicks_add_board() {
       deckPage.createDeckButton.click();

    }
    @When("User types in {string} and hits enter")
    public void user_types_in_and_hits_enter(String str) {
        deckPage.deckInputBox.sendKeys(str);
        deckPage.deckInputBox.sendKeys(Keys.ENTER);

    }
    @Then("New board should be created")
    public void new_board_should_be_created() {
        Assert.assertTrue(deckPage.newCreatedDeck.isDisplayed());

    }
    @When("User clicks on created board")
    public void user_clicks_on_created_board() {
        deckPage.newCreatedDeck.click();
    }
    @When("User types in list {string} and hits enter")
    public void user_types_in_list_and_hits_enter(String string) {
        deckPage.createListBox.sendKeys(string);
        deckPage.createListBox.sendKeys(Keys.ENTER);
    }
    @Then("New list should be created")
    public void new_list_should_be_created() {
        Assert.assertTrue(deckPage.newCreatedList.isDisplayed());
    }

}

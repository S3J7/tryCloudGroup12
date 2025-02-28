package com.trycloud.step_definitions;

import com.trycloud.pages.CalendarPage;
import com.trycloud.pages.LoginPage;
import com.trycloud.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.support.PageFactory;



public class CalendarSteps {
    LoginPage loginPage = new LoginPage();
    CalendarPage  calendarPage = new CalendarPage();

    public CalendarSteps() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @Given("User enters username and password valid")
    public void userEntersUsernameAndPasswordValid() {

        loginPage.loginWithClick("Employee12", "Employee123");}

    @And("the user clicks on the calendar button")
    public void theUserClicksOnTheCalendarButton() {
        calendarPage.calendarBtn.click();

    }
    @And("the user clicks on the choose button")
    public void theUserClicksOnTheChooseButton() {
        calendarPage.btnChoose.click();
    }
    @Then("the user clicks on the day button")
    public void theUserClicksOnTheDayButton() {
        calendarPage.getBtnDay.click();
    }
    @Then("the user clicks on the month button")
    public void theUserClicksOnTheMonthButton() {
        calendarPage.getBtnMonth.click();
    }
    @Then("the user clicks on the week button")
    public void theUserClicksOnTheWeekButton() {
        calendarPage.getBtnWeek.click();

    }

    @And("the user clicks on the new event")
    public void theUserClicksOnTheNewEvent() {
        calendarPage.getBtnNew.click();
    }

    @And("insert your name event")
    public void inserYourNameEvent() {
        calendarPage.getBtnEventTitle.sendKeys("holidays01");
    }

    @And("insert your date start")
    public void insertYourDateStart() {
        calendarPage.getBtnEventDateStart.sendKeys("from 12/28/2025 at 5:30 PM");
    }

    @And("the user clicks on save")
    public void theUserClicksOnSave() {
        calendarPage.getBtnSave.click();
    }

    @And("choose one event")
    public void chooseOneEvent() {
        calendarPage.getGetBtnEvent.click();
    }

    @And("the user clicks on the more button")
    public void theUserClicksOnTheMoreButton() {
        calendarPage.getbtnMore.click();
    }

    @And("the user clicks on the three button")
    public void theUserClicksOnTheThreeButton() {
        calendarPage.getbtnThree.click();
    }

    @And("the user clicks on the delete button")
    public void theUserClicksOnTheDeleteButton() {
        calendarPage.getbtnDelete.click();
    }
}

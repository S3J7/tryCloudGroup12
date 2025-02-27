package com.trycloud.pages;

import com.trycloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CalendarPage {

    public CalendarPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }


    //Issam
    @FindBy(xpath = "//ul[@id='appmenu']/li[@data-id='calendar']")
    public WebElement calendarBtn;
    @FindBy(xpath = "//*[@id=\"app-navigation-vue\"]/header/div[2]/div/div/div/button")
    public WebElement btnChoose;
    @FindBy(xpath = "//li[contains(@class, 'action')]/button[span[contains(text(), 'Day')]]")
    public WebElement getBtnDay;
    @FindBy(xpath = "//li[contains(@class, 'action')]/button[span[contains(text(), 'Week')]]")
    public WebElement getBtnWeek;
    @FindBy(xpath = "//li[contains(@class, 'action')]/button[span[contains(text(), 'Month')]]")
    public WebElement getBtnMonth;
    @FindBy(xpath = "//button[@class='button primary new-event']")
    public WebElement getBtnNew;
    @FindBy(xpath = " //input[@placeholder='Event title']")
    public WebElement getBtnEventTitle;
    @FindBy(xpath = "     //*[@id=\"popover_vqfjuhsdcq\"]/div/div[1]/div[1]/div[4]/div[1]/div[1]/div[1]/input//div[2]")
    public WebElement getBtnEventDateStart;
    @FindBy(xpath = "     //button[@class='primary']")
    public WebElement getBtnSave;
    @FindBy(xpath = "         //div[@class='fc-event-title' and text()='holidays4']")
    public WebElement getGetBtnEvent;
    @FindBy(xpath = "       //div[@class='event-popover__buttons']//button[1]")
    public WebElement getbtnMore;
    @FindBy(xpath = "           //*[@id=\"app-sidebar-vue\"]/header/div[1]/div[2]/div[2]/div/div/button")
    public WebElement getbtnThree;
    @FindBy(xpath = "              //span[text()='Delete']")
    public WebElement getbtnDelete;






}

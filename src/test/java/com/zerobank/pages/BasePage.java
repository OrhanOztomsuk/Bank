package com.zerobank.pages;

import com.zerobank.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {

    public BasePage(){

        PageFactory.initElements(Driver.get(),this);
    }

    @FindBy(xpath = "//strong[text()='Home']")
    public WebElement homeButton;

    @FindBy(xpath = "//a[text()='Zero Bank']")
    public WebElement ZeroBankButton;

    @FindBy(xpath = "//strong[text()='Online Banking']")
    public WebElement OnlineBankingButton;

    @FindBy(xpath = "//strong[text()='Feedback']")
    public WebElement FeedbackButton;

    @FindBy(id = "searchTerm")
    public WebElement SearchBox;

    @FindBy(xpath= "//span[@id='account_activity_link']")
    public WebElement CheckingAccountActivityLink;

    @FindBy(xpath= "//span[@id='transfer_funds_link']")
    public WebElement TransferFundsLink;

    @FindBy(xpath= "//span[@id='money_map_link']")
    public WebElement MoneyMapLink;



















}

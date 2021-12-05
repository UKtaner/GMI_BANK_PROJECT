package gmibank.pages;

import gmibank.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CustomerCreationPageByEmployee {

        public CustomerCreationPageByEmployee(){PageFactory.initElements(Driver.getDriver(), this);

        }
    //taner==>start
    @FindBy(id = "search-ssn")
    public WebElement ssnTextBox;

    @FindBy(xpath = "//*[.='Search']")
    public WebElement SearchButton;

    @FindBy(name="middleInitial")
    public WebElement middleNameTextBox;

    @FindBy(name="phoneNumber")
    public WebElement phoneNumberTextBox;

    @FindBy(name="zipCode")
    public WebElement zipCodeTextBox;

    @FindBy(name="city")
    public WebElement cityTextBox;

    @FindBy(name="createDate")
    public WebElement createDateTextBox;

    @FindBy(xpath="//*[@value='2021-08-15T00:00']")
    public WebElement timeOccurence;

    @FindBy(name="country.id")
    public WebElement countryIdDropDown;

    @FindBy(name="state")
    public WebElement stateTextBox;

    @FindBy(name="user.id")
    public WebElement userIdDropDown;

    @FindBy(id = "tp-customer-account")
    public WebElement accountTypeTextBox;

    @FindBy(xpath = "//*[@value='3976']")
    public WebElement accountType;

    @FindBy(id = "tp-customer-zelleEnrolled")
    public WebElement zelleEnrolledButton;

    @FindBy(id = "save-entity")
    public WebElement saveButton;

    @FindBy(xpath = "//*[contains(text(),'translation-not-found')]")
    public WebElement successpopUp;
    //taner==>end



    //Osman-stars
    @FindBy(name = "firstName")
    public WebElement firstNameBox;

    @FindBy(name = "lastName")
    public WebElement lastNameBox;

    @FindBy(name = "email")
    public WebElement emailBox;

    @FindBy(name = "address")
    public WebElement address;

    @FindBy(name = "mobilePhoneNumber")
    public WebElement mobilePhoneNumber;

    @FindBy(name = "address")
    public WebElement addressBox;


    //Murat Account Creation

    @FindBy(xpath ="//*[@id='entity-menu']/div/a[2]" )
    public WebElement manageAccounts;
    @FindBy(xpath ="//*[contains(text(),'Create a new Account')]" )
    public WebElement createAccount;

@FindBy(xpath = "//*[@id='tp-account-description']")
    public  WebElement descriptionBox;
    @FindBy(xpath = "//*[@id='tp-account-balance']")
    public  WebElement balanceBox;
    @FindBy (xpath = "//*[@id='tp-account-accountType']/option[1]")
    public WebElement accountCheckingAccount;
    @FindBy (xpath = "//*[@id='tp-account-accountType']/option[2]")
    public WebElement accountSavingAccount;
    @FindBy (xpath = "//*[@id='tp-account-accountType']/option[3]")
    public WebElement accountCreditCardAccount;
    @FindBy (xpath = "//*[@id='tp-account-accountType']/option[4]")
    public WebElement accountInvestingAccount;
    @FindBy(xpath = "//*[@id='tp-account-createDate']")
    public WebElement createDate;
@FindBy (xpath = "//*[@name='closedDate']")
public WebElement closedDate;
@FindBy (xpath = "//*[@id='app-view-container']/div[1]/div/div/div/div/dl")
public WebElement accountSuccess;
@FindBy(xpath ="//input[@name='firstName']" )
public WebElement customerFirstName;
    @FindBy(xpath ="//*[@id='tp-customer-lastName']" )
    public WebElement customerLastName;
}

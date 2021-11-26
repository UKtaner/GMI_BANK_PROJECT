package gmibank.pages;

import gmibank.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EditCustomerPage {

    public EditCustomerPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//span[.='Create or edit a Customer']")
    public WebElement editCustomerHeader;

    @FindBy(id = "tp-customer-id")
    public WebElement idBar;

    @FindBy(id = "save-entity")
    public WebElement saveButton;

    @FindBy(id = "tp-customer-firstName")
    public WebElement firstName;

    @FindBy(id = "tp-customer-lastName")
    public WebElement lastName;

    @FindBy(id = "tp-customer-middleInitial")
    public WebElement middleName;

    @FindBy(id = "tp-customer-email")
    public WebElement email;

    @FindBy(id = "tp-customer-mobilePhoneNumber")
    public WebElement mobileNumber;

    @FindBy(id = "tp-customer-phoneNumber")
    public WebElement phoneNumber;

    @FindBy(id = "tp-customer-zipCode")
    public WebElement zipCode;

    @FindBy(id = "tp-customer-address")
    public WebElement address;

    @FindBy(id = "tp-customer-city")
    public WebElement city;

    @FindBy(id = "tp-customer-ssn")
    public WebElement ssn;

    @FindBy(id = "tp-customer-createDate")
    public WebElement createDate;

    @FindBy(id = "tp-customer-country")
    public WebElement country;

    @FindBy(id = "tp-customer-state")
    public WebElement state;

    @FindBy(id = "tp-customer-user")
    public WebElement user;

    @FindBy(id = "tp-customer-account")
    public WebElement account;

    @FindBy(id = "tp-customer-zelleEnrolled")
    public WebElement zelleEnrolled;

    @FindBy(xpath = "//span[.='Back']")
    public WebElement backButton;

    @FindBy(className = "Toastify__toast-container Toastify__toast-container--top-left toastify-container")
    public WebElement confirmationPopUp;

}

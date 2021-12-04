package gmibank.pages;

//  ==>   My Operations > Manage Customers

import gmibank.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CustomersPage {

    public CustomersPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[.='Customers']")
    public WebElement customersHeader;

    @FindBy(xpath = "(//span[.='View'])[2]")
    public WebElement viewButton;

    @FindBy(xpath = "(//span[.='Edit'])[2]")
    public WebElement editButton;

    @FindBy(xpath = "(//span[.='Delete'])[2]")
    public WebElement deleteButton;

    @FindBy(id = "jh-create-entity")
    public WebElement createANewCustomerButton;

    @FindBy(xpath = "//div[.='translation-not-found[gmiBankBackendApp.tPCustomer.updated]']")
    public WebElement confirmationPopUp;

    @FindBy(xpath = "//h5")
    public WebElement deleteMessage;

    @FindBy(id = "jhi-confirm-delete-tPCustomer")
    public WebElement deletePopUp;

    @FindBy(xpath = "//th[2]//span[1]")
    public WebElement firstName;

    @FindBy(xpath = "//th[3]//span[1]")
    public WebElement lastName;

    @FindBy(xpath = "//th[4]//span[1]")
    public WebElement middleInitial;

    @FindBy(xpath = "//th[5]//span[1]")
    public WebElement email;

    @FindBy(xpath = "//th[6]//span[1]")
    public WebElement mobilePhoneNumber;

    @FindBy(xpath = "//th[7]//span[1]")
    public WebElement phoneNumber;

    @FindBy(xpath = "//th[8]//span[1]")
    public WebElement address;

    @FindBy(xpath = "//th[9]//span[1]")
    public WebElement createDate;

}

//
//        Verify Customers                     ==>      //*[.='Customers']
//        View Button                          ==>      (//span[.='View'])[2]
//        Edit Button                          ==>      (//span[.='Edit'])[2]
//        Delete Button                        ==>      (//span[.='Delete'])[2]
//        Verify delete message                ==>      Confirm delete operation ( getText.contains…) --- //span[.='Confirm delete operation']
//        Create user info                     ==>      tp-customer-id (By ID) (is disabled)  ???
//        Update user info                     ==>      save-entity (By ID) (Save Button is clickable)  ???

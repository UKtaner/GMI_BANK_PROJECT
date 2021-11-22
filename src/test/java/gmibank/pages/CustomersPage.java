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

}

//
//        Verify Customers                     ==>      //*[.='Customers']
//        View Button                          ==>      (//span[.='View'])[2]
//        Edit Button                          ==>      (//span[.='Edit'])[2]
//        Delete Button                        ==>      (//span[.='Delete'])[2]
//        Verify delete message                ==>      Confirm delete operation ( getText.contains…) --- //span[.='Confirm delete operation']
//        Create user info                     ==>      tp-customer-id (By ID) (is disabled)  ???
//        Update user info                     ==>      save-entity (By ID) (Save Button is clickable)  ???

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

    @FindBy(xpath = "//input[@name='middleInitial']")
    public WebElement middleNameTextBox;

    @FindBy(xpath = "//input[@name='phoneNumber']")
    public WebElement phoneNumberTextBox;

    @FindBy(xpath = "//input[@name='zipCode']")
    public WebElement zipCodeTextBox;

    @FindBy(xpath = "//input[@name='city']")
    public WebElement cityTextBox;

    @FindBy(xpath = "//input[@name='createDate']")
    public WebElement createDateTextBox;

    @FindBy(xpath="//*[@value='2021-11-25T00:00']")
    public WebElement timeOccurence;

    @FindBy(xpath = "//select[@name='country.id']")
    public WebElement countryIdDropDown;

    @FindBy(xpath = "//input[@name='state']")
    public WebElement stateTextBox;

    @FindBy(xpath = "//select[@name='user.id']")
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

}

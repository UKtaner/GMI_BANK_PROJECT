package gmibank.pages;

import gmibank.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CustomerCreationPageByEmployee {

        public CustomerCreationPageByEmployee(){PageFactory.initElements(Driver.getDriver(), this);

        }
    //taner==>start
    //SSN:234-56-7890
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

    @FindBy(xpath = "//select[@name='country.id']")
    public WebElement countryIdDropDown;

    @FindBy(xpath = "//input[@name='state']")
    public WebElement stateTextBox;

    @FindBy(xpath = "//select[@name='user.id']")
    public WebElement userIdDropDown;

    @FindBy(id = "tp-customer-account")
    public WebElement accountTypeTextBox;

    @FindBy(id = "tp-customer-zelleEnrolled")
    public WebElement zelleEnrolledButton;

    @FindBy(id = "save-entity")
    public WebElement saveButton;

    //taner==>end





}

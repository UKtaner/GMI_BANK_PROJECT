package gmibank.pages;

import gmibank.utilities.Driver;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CustomerAccounts {
    public CustomerAccounts(){

        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//tbody/tr/td[1]")
    public WebElement row1Cell1;

    @FindBy(xpath = "//tbody/tr/td[2]")
    public WebElement row1Cell2;

    @FindBy(xpath = "(//button[.='View Transaction'])[1]")
    public WebElement firstViewTransactionButton;

    @FindBy(xpath = "//span[.='ID']")
    public WebElement idHeader;

    //Murat
@FindBy (xpath = "//table/tbody/tr[2]/td[1]" )

    public WebElement selectID;

@FindBy (xpath = "//span[.='Account']")
    public WebElement accountPage;
@FindBy (xpath = "//*[@id='app-view-container']/div[1]/div/div/div/div/dl/dd[1]")
    public WebElement description;
    @FindBy (xpath = "//*[@id='app-view-container']/div[1]/div/div/div/div/dl/dd[2]")
    public WebElement balance;
    @FindBy (xpath = "//span[@id='accountType']")
    public WebElement accounType;
    @FindBy (xpath = "//*[@id='app-view-container']/div[1]/div/div/div/div/dl/dd[4]")
    public WebElement accountStatus;
    @FindBy (xpath = "//*[@id='app-view-container']/div[1]/div/div/div/div/dl/dd[5]")
    public WebElement accountCreateDate;
    @FindBy (xpath = " //*[@id='app-view-container']/div[1]/div/div/div/div/h2/b")
    public WebElement accountID;
@FindBy(xpath = "//*[@id='app-view-container']/div[1]/div/div/div/div[1]/div/table/tbody/tr[4]/td[1]")
    public WebElement customerID;
@FindBy(xpath = "//span[.='Edit']")
    public WebElement editButton;

@FindBy(xpath = "//input[@name='zelleEnrolled']")
    public WebElement zelleEnrolled;
@FindBy(xpath = "//span[.='Save']")
    public WebElement saveCustomer;

@FindBy(xpath = "//*[@id='entity-menu']/div[1]/a[1]")
    public WebElement myAccounts;
    @FindBy(xpath = "//*[@id='entity-menu']/div/a[2]")
    public WebElement transferMoney;

   @FindBy (xpath = "//*[@id='app-view-container']/div[1]/div/div/div/div[1]/div/table")
    public WebElement customerAccountsTable;

    @FindBy(xpath = "//tbody/tr[2]/td[1]")
    public WebElement  row2Cell1;
    @FindBy(xpath = "//tbody/tr[2]/td[2]")
    public WebElement row2Cell2;

    @FindBy (xpath = "//*[@id='fromAccountId']/option[2]")
    public WebElement savingDropdownAccount;
    @FindBy (xpath = "//*[@id='fromAccountId']/option[4]")
    public WebElement checkingDropdownAccount;
@FindBy(xpath = "//*[@id='toAccountId']/option[3]")
    public WebElement sendToAccount;
@FindBy (xpath = "//*[@id='balance']")
    public WebElement balanceSent;
@FindBy (xpath = "//*[@id='balancecent']")
    public WebElement balanceCent;

@FindBy (xpath = "//*[@id='make-transfer']")
    public  WebElement makeTransfer;
@FindBy(xpath = "//*[@id='description']")
    public WebElement transferDescription;

    @FindBy(xpath = "//div[@class='Toastify__toast-body']")
public WebElement popUpMessage;
}

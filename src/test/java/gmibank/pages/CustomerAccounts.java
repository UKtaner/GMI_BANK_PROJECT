package gmibank.pages;

import gmibank.utilities.Driver;
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



}

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
}

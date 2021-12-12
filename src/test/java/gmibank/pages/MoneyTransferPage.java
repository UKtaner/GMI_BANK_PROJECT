package gmibank.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MoneyTransferPage {


    @FindBy(xpath = "  //*[@id='entity-menu']/div/a[1]")
    public WebElement myAccounts;
    @FindBy(xpath = "  //*[@id='entity-menu']/div/a[2]")
    public WebElement transferMoney;

}

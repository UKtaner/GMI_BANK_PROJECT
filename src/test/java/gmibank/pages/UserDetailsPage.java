package gmibank.pages;

import gmibank.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserDetailsPage {
    public UserDetailsPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//body//dd[2]")
    public WebElement FirstName;

    @FindBy(xpath = "//body//dd[3]")
    public WebElement LastName;

    @FindBy(xpath = "//body//dd[4]")
    public WebElement Email;

    @FindBy(xpath = "//div[@id='app-view-container']//div//div//div//div//div//dl//dd//ul//li//span")
    public WebElement Profile;
}

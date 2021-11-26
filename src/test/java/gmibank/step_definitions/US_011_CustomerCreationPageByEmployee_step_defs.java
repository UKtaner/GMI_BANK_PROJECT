package gmibank.step_definitions;

import gmibank.pages.CustomerCreationPageByEmployee;
import gmibank.pages.CustomersPage;
import gmibank.pages.LoginPage;
import gmibank.utilities.ExcelUtil;
import gmibank.utilities.ReusableMethods;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Map;

public class US_011_CustomerCreationPageByEmployee_step_defs {

CustomerCreationPageByEmployee customerCreationPageByEmployee=new CustomerCreationPageByEmployee();
    ExcelUtil excelUtil;
    //DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
   // DateTimeFormatter currentDate = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
    DateTimeFormatter currentYear = DateTimeFormatter.ofPattern("yyyy");
    DateTimeFormatter currentMonth = DateTimeFormatter.ofPattern("MM");
    DateTimeFormatter currentDay = DateTimeFormatter.ofPattern("dd");
    LocalDateTime now = LocalDateTime.now();


    @When("user enters the date respectively")
    public void user_enters_the_date_respectively(DataTable dateTable) {
        List<String> testData = dateTable.row(1);
        System.out.println(testData);
    }
    @Then("Than user verifies current time is displayed")
    public void than_user_verifies_current_time_is_displayed() {
    Assert.assertTrue(customerCreationPageByEmployee.timeOccurence.isDisplayed());
    }
    @Then("take the screenshot")
    public void take_the_screenshot() throws IOException {
        ReusableMethods.waitFor(4);
        ReusableMethods.getScreenshot("TC_1101_PASS");
    }

    @When("user enters {string} in the future")
    public void user_enters_in_the_future(String year) throws InterruptedException {
    customerCreationPageByEmployee.createDateTextBox.sendKeys("26/11/2023");
    }
    @Then("user should see  an error {string} message")
    public void user_should_see_an_error_message(String errorMessage) throws IOException, InterruptedException {
        DateTimeFormatter currentDate = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDateTime now = LocalDateTime.now();
        String expectedYear="26/11/2023";
        Assert.assertEquals(expectedYear,(currentDate.format(now)));
        ReusableMethods.waitFor(4);
        ReusableMethods.getScreenshot("TC_1102_year_error_FAILED");
    }
    @When("user enters {string} in the past")
    public void user_enters_in_the_past(String year) throws IOException {
        DateTimeFormatter currentDate = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        customerCreationPageByEmployee.createDateTextBox.sendKeys("26/11/2000");
        LocalDateTime now = LocalDateTime.now();
        String expectedYear="26/11/2000";
        Assert.assertEquals(expectedYear,(currentDate.format(now)));
        ReusableMethods.waitFor(4);
        ReusableMethods.getScreenshot("TC_1103_year_error_FAILED");
    }
//    @When("user provides month,day,year,hour and minute from excel respectively.")
//    public void user_provides_month_day_year_hour_and_minute_from_excel_respectively() {
//        String path ="testdata/date_info.xlsx";
//        String sheetName="date_info";
//        excelUtil= new ExcelUtil(path,sheetName);
//        List<Map<String, String>>  exceltestData;
//        exceltestData=excelUtil.getDataList();
//        System.out.println(exceltestData);
//
//        for(Map<String,String> eachData : exceltestData ){
//            customerCreationPageByEmployee.createDateTextBox.sendKeys(eachData.get("date_data_test"));

//        }

//    @When("user provides the date as month,day,year,hour and minute respectively.")
//    public void user_provides_the_date_as_day_month_year_hour_and_minute_respectively() throws IOException {
//        DateTimeFormatter completeDateFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy");
//        LocalDateTime now = LocalDateTime.now();
//    customerCreationPageByEmployee.createDateTextBox.sendKeys("26/12/2021");
//    String actualText= customerCreationPageByEmployee.createDateTextBox.getText();
//        System.out.println(actualText);
//        String expectedDate="26/11/2021";
//        Assert.assertEquals(expectedDate,(completeDateFormat.format(now)));
//        ReusableMethods.waitFor(4);
//        ReusableMethods.getScreenshot("TC_1104_date_order_error_FAILED");
//
//    }

    @When("user provides the date as day,month,year,hour and minute respectively.")
    public void user_provides_the_date_as_day_month_year_hour_and_minute_respectively() {



        
    }

    @When("user provides date as month,day,year,hour and minute respectively.")
    public void user_provides_date_as_month_day_year_hour_and_minute_respectively() throws IOException {
        customerCreationPageByEmployee.createDateTextBox.sendKeys("12/20/2021 12:00");
        ReusableMethods.waitFor(4);
        ReusableMethods.getScreenshot("TC_1105_date_order_error_FAILED");
    }
    @When("user clicks on the user dropdown and select a user")
    public void user_clicks_on_the_user_dropdown_and_select_a_user() throws InterruptedException, IOException {
        customerCreationPageByEmployee = new CustomerCreationPageByEmployee();
        Select select = new Select(customerCreationPageByEmployee.userIdDropDown);
        select.selectByIndex(5);
        String selectedText = select.getFirstSelectedOption().getText();
        System.out.println("UserId:"+selectedText);
    }
    @Then("verify a user is selected")
    public void verify_a_user_is_selected() throws IOException {
        Select select = new Select(customerCreationPageByEmployee.userIdDropDown);
        String selectedText = select.getFirstSelectedOption().getText();
        Assert.assertTrue(selectedText.contains("team3customer team 3"));
        ReusableMethods.waitFor(4);
        ReusableMethods.getScreenshot("TC_1106_user_not_clickable_FAILED");
    }
    @When("user clicks on the account dropdown and select an account")
    public void user_clicks_on_the_account_dropdown_and_select_an_account() {
//       Select select = new Select( customerCreationPageByEmployee.accountTypeTextBox);
//        select.selectByValue("Saving");
//        String selectedText = select.getFirstSelectedOption().getText();
//        System.out.println(selectedText);
        customerCreationPageByEmployee.accountType.click();
        String actualText=customerCreationPageByEmployee.accountType.getText();
        String expectedText="Test Account";
        Assert.assertEquals(expectedText,actualText);

    }
    @When("user is able to click on the Zelle Enrolled button")
    public void user_is_able_to_click_on_the_zelle_enrolled_button() {
    customerCreationPageByEmployee.zelleEnrolledButton.click();
    }
    @Then("verify the user is able to click on Save button successfully")
    public void verify_the_user_is_able_to_click_on_save_button_successfully() {
    customerCreationPageByEmployee.saveButton.click();
    }
    @When("user should not click on the Zelle Enrolled button")
    public void user_should_not_click_on_the_zelle_enrolled_button() {
    customerCreationPageByEmployee.saveButton.click();
    customerCreationPageByEmployee.successpopUp.isDisplayed();
    }


}


















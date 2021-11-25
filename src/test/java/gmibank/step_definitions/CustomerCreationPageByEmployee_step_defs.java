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

import java.io.IOException;
import java.util.List;
import java.util.Map;

public class CustomerCreationPageByEmployee_step_defs {


CustomerCreationPageByEmployee customerCreationPageByEmployee=new CustomerCreationPageByEmployee();
    ExcelUtil excelUtil;

    @When("user enters the date respectively")
    public void user_enters_the_date_respectively(DataTable dateTable) {
        List<String> testData = dateTable.row(1);
        System.out.println(testData);

    }
    @Then("Than user verifies current time is displayed")
    public void than_user_verifies_current_time_is_displayed() {
    customerCreationPageByEmployee.timeOccurence.isDisplayed();

    }
    @Then("take the screenshot")
    public void take_the_screenshot() throws IOException {
        ReusableMethods.getScreenshot("TC_1101_PASS");
    }

    @When("user enters {string} in the future")
    public void user_enters_in_the_future(String year) {
    customerCreationPageByEmployee.createDateTextBox.sendKeys("17/05/2023 12:00");

    }
    @Then("user should see  an error {string} message")
    public void user_should_see_an_error_message(String errorMessage) throws IOException {
        customerCreationPageByEmployee.dateCreateError.isDisplayed();
        ReusableMethods.getScreenshot("TC_1102_year_error_FAILED");
    }
    @When("user enters {string} in the past")
    public void user_enters_in_the_past(String year) throws IOException {
        customerCreationPageByEmployee.createDateTextBox.sendKeys("17/05/2000 12:00");
        customerCreationPageByEmployee.dateCreateError.isDisplayed();
        ReusableMethods.getScreenshot("TC_1103_year_error_FAILED");
    }
    @When("user provides month,day,year,hour and minute from excel respectively.")
    public void user_provides_month_day_year_hour_and_minute_from_excel_respectively() {
        String path =".src/test/resources/testdata/date_info.xlsx";
        String sheetName="date_info";
        excelUtil= new ExcelUtil(path,sheetName);
        List<Map<String, String>>  exceltestData;
        exceltestData=excelUtil.getDataList();
        System.out.println(exceltestData);

        for(Map<String,String> eachData : exceltestData ){
            customerCreationPageByEmployee.createDateTextBox.sendKeys(eachData.get("date_data_test"));

        }

    }
    @Then("user verify Create Date Box should not give any error message.")
    public void user_verify_create_date_box_should_not_give_any_error_message() {

    }



}


















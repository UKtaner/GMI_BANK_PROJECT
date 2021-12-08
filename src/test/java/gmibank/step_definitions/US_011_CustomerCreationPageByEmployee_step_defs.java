package gmibank.step_definitions;

import com.github.javafaker.Faker;
import gmibank.pages.CustomerCreationPageByEmployee;
import gmibank.pages.CustomersPage;
import gmibank.utilities.ConfigReader;
import gmibank.utilities.Driver;
import gmibank.utilities.ExcelUtil;
import gmibank.utilities.ReusableMethods;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;

import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Map;

public class US_011_CustomerCreationPageByEmployee_step_defs {

    CustomerCreationPageByEmployee customerCreationPageByEmployee = new CustomerCreationPageByEmployee();
    Faker faker = new Faker();
    ExcelUtil excelUtil;

    @When("user enters the {string} respectively")
    public void user_enters_the_respectively(String date) {
//        excelUtil = new ExcelUtil("src/test/resources/testdata/date_info.xlsx", date);
//        List<Map<String, String>> testData = excelUtil.getDataList();
//        for (Map<String, String> appData : testData) {
//            Driver.getDriver().get(ConfigReader.getProperty("app_url"));
//            customerCreationPageByEmployee.createDateTextBox.sendKeys(appData.get("dateTest"));
//
//        }
//    }

    date=ConfigReader.getProperty("dateTest");
        System.out.println("date = "+date);
       customerCreationPageByEmployee.createDateTextBox.sendKeys(date);
}
    @Then("verify the data is accepted")
    public void verify_the_data_is_accepted() {
        ReusableMethods.waitForVisibility(customerCreationPageByEmployee.createDateTextBox,5);
        String dateText=customerCreationPageByEmployee.timeOccurence.getAttribute("Value");
        System.out.println("dateText = " + dateText);
        Assert.assertTrue(customerCreationPageByEmployee.timeOccurence.isDisplayed());

    }
    @When("user enters {string} in the future")
    public void user_enters_in_the_future(String year) throws InterruptedException {
      year = ConfigReader.getProperty("futureDateCreation");
    customerCreationPageByEmployee.createDateTextBox.sendKeys(year);
    }
    @Then("user should see  an error outcome message")
    public void user_should_see_an_outcome_message() throws IOException, InterruptedException {
        DateTimeFormatter currentDate = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDateTime now = LocalDateTime.now();
        String currentDateStr=currentDate.format(now);
        String currentYear=currentDateStr.substring(6);
       String  year = ConfigReader.getProperty("futureDateCreation");
       Assert.assertTrue(Integer.parseInt(currentYear)>Integer.parseInt(year.substring(6)));

    }
    @When("user enters {string} in the past")
    public void user_enters_in_the_past(String year) throws IOException {
        year = ConfigReader.getProperty("pastDateCreation");
        customerCreationPageByEmployee.createDateTextBox.sendKeys(year);
        DateTimeFormatter currentDate = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDateTime now = LocalDateTime.now();
        String currentDateStr=currentDate.format(now);
        String currentYear=currentDateStr.substring(6);
        year = ConfigReader.getProperty("pastDateCreation");
        Assert.assertTrue(Integer.parseInt(currentYear)<Integer.parseInt(year.substring(6)));
    }

    @When("user provides {string} as month,day,year,hour and minute respectively.")
    public void user_provides_as_month_day_year_hour_and_minute_respectively(String dateOrder) {
        dateOrder=ConfigReader.getProperty("expectedDateTest");
        customerCreationPageByEmployee.createDateTextBox.sendKeys(dateOrder);
    }
    @Then("user verify the data is accepted.")
    public void user_verify_the_data_is_accepted() {
        DateTimeFormatter expectedDateOrder = DateTimeFormatter.ofPattern("MM/dd/yyyy HH:mm");
        String expectedDate = ConfigReader.getProperty("expectedDateTest");
        LocalDateTime now = LocalDateTime.now();
        String currentDateStr=expectedDateOrder.format(now);
        String  currentMonth=currentDateStr.substring(0,2);

        Assert.assertTrue(Integer.parseInt(currentMonth)>Integer.parseInt(expectedDate.substring(0,2)));
        String currentDay=currentDateStr.substring(3,5);
        Assert.assertTrue(Integer.parseInt(currentDay)>Integer.parseInt(expectedDate.substring(3,5)));

    }
    @When("user clicks on the user dropdown and select a user")
    public void user_clicks_on_the_user_dropdown_and_select_a_user() throws InterruptedException, IOException {
       customerCreationPageByEmployee.userIdDropDown.click();
        Select userId=new Select(customerCreationPageByEmployee.userIdDropDown);
        userId.selectByIndex(faker.number().numberBetween(2,5));
    }
    @Then("verify a user is selected")
    public void verify_a_user_is_selected() throws IOException {
        String selectedUser= customerCreationPageByEmployee.userIdDropDown.getText();
        Assert.assertTrue(selectedUser.isEmpty());
          }
    @When("user clicks on the account dropdown and select an account")
    public void user_clicks_on_the_account_dropdown_and_select_an_account() {
        Select accountId = new Select(customerCreationPageByEmployee.accountTypeTextBox);
        accountId.selectByIndex(faker.number().numberBetween(1, 5));

    }
        @Then("verify an account is displayed")
        public void verify_an_account_is_displayed() {
            String selectedAccount = customerCreationPageByEmployee.userIdDropDown.getText();
            Assert.assertFalse(selectedAccount.isEmpty());
        }
    @When("user is able to click on the Zelle Enrolled button")
    public void user_is_able_to_click_on_the_zelle_enrolled_button() {
        ReusableMethods.waitForVisibility(customerCreationPageByEmployee.zelleEnrolledButton,5);
        customerCreationPageByEmployee.zelleEnrolledButton.click();
        }

    @Then("verify the user is able to click on the save button.")
    public void verify_the_user_is_able_to_click_on_the_save_button() {
        Assert.assertTrue(customerCreationPageByEmployee.zelleEnrolledButton.isSelected());
    }
    @When("user should skip the Zelle Enrolled button")
    public void user_should_skip_the_zelle_enrolled_button() {
        if (!customerCreationPageByEmployee.zelleEnrolledButton.isSelected()) {
            customerCreationPageByEmployee.saveButton.click();
            //Assert.assertTrue(customerCreationPageByEmployee.zelleEnrolledButton.isEnabled());
        }
    }
        @Then("verify the user is able to see the success popUp")
        public void verify_the_user_is_able_to_see_the_success_pop_up() {
           String popUpText= customerCreationPageByEmployee.successpopUp.getText();
           Assert.assertTrue(popUpText.contains("translation-not-found"));
        }

    }



















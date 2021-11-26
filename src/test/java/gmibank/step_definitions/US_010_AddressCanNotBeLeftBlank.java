package gmibank.step_definitions;

import gmibank.pages.CustomerCreationPageByEmployee;
import gmibank.utilities.ConfigReader;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.stream.Collectors;

public class US_010_AddressCanNotBeLeftBlank {
    CustomerCreationPageByEmployee customerCreationPageByEmployee;
    @Then("verify address box is not blank")
    public void verify_address_box_is_not_blank() {
        customerCreationPageByEmployee = new CustomerCreationPageByEmployee();
    String address = customerCreationPageByEmployee.address.getAttribute("value");
    Assert.assertTrue(address.length()>0);
    }

    @Then("verify address box has letters and digits")
    public void verify_address_box_has_letters_and_digits() {
        customerCreationPageByEmployee = new CustomerCreationPageByEmployee();
    String address = customerCreationPageByEmployee.address.getAttribute("value").trim();
        System.out.println("address = " + address);
        Assert.assertTrue((hasDigit(address)&& hasLetter(address)));
    }

    @Then("verify city box is not blank")
    public void verify_city_box_is_not_blank() {
      customerCreationPageByEmployee = new CustomerCreationPageByEmployee();
      customerCreationPageByEmployee.cityTextBox.sendKeys(ConfigReader.getProperty("city"));
      String cityBoxText = customerCreationPageByEmployee.cityTextBox.getAttribute("value").trim();
      Assert.assertTrue(cityBoxText.length()>0);
    }
    @Then("verify country box is not blank")
    public void verify_country_box_is_not_blank() {
    customerCreationPageByEmployee = new CustomerCreationPageByEmployee();
        Select select = new Select(customerCreationPageByEmployee.countryIdDropDown);
        select.selectByIndex(3);
        String selected = select.getFirstSelectedOption().getText();
       Assert.assertTrue(selected.length()>0);
    }

    @Then("verify state box is not blank")
    public void verify_state_box_is_not_blank() {
        customerCreationPageByEmployee = new CustomerCreationPageByEmployee();
      customerCreationPageByEmployee.stateTextBox.sendKeys("Texas");
      Assert.assertTrue(customerCreationPageByEmployee.stateTextBox.getAttribute("value").trim().length()>0);
    }

    @Then("verify state box is provided as US state")
    public void verify_state_box_is_provided_as_us_state(DataTable states) {
        List<String > listOfStates = states.row(0);
        customerCreationPageByEmployee = new CustomerCreationPageByEmployee();
        String state = customerCreationPageByEmployee.stateTextBox.getAttribute("value").trim();
        boolean isUsState = false;
        for (String each:listOfStates) {
            if(each.contains(state)){
                isUsState=true;
                break;
            }
        }
        Assert.assertTrue(isUsState);
    }

    public boolean hasDigit(String str){
        char [] strArr = str.toCharArray();
        for (char each:strArr) {
            if(Character.isDigit(each)){
                return true;
            }
        }
        return false;
    }
    public boolean hasLetter(String str){
        char [] strArr = str.toCharArray();
        for (char each:strArr) {
            if((each>='A'&& each<='Z')||(each>='a'&& each<='z')){
                return true;
            }
        }
        return false;
    }
}

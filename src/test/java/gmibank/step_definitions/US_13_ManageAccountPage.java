package gmibank.step_definitions;

import gmibank.pages.ManageAccountPage;
import gmibank.utilities.ReusableMethods;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class US_13_ManageAccountPage {
    ManageAccountPage manageAccountPage = new ManageAccountPage();

    @Given("user Sign in with user credentials")
    public void user_sign_in_with_user_credentials() {

    }
    @Given("user click “My Operations” and select “Manage Accounts”")
    public void user_click_my_operations_and_select_manage_accounts() {
        ReusableMethods.waitFor(2);
        manageAccountPage.myOperationsMenu.click();
        ReusableMethods.waitFor(2);
        manageAccountPage.manageAccountsMenu.click();

    }
    @Given("user Click “+Create a new Account” button")
    public void user_click_create_a_new_account_button() {
        ReusableMethods.waitFor(2);
        manageAccountPage.createNewAccountButton.click();

    }
    @When("User should not fill “description” area.")
    public void user_should_not_fill_description_area() {
        manageAccountPage.descriptionBox.click();

    }
    @When("user enter {int} in “Balance” box")
    public void user_enter_in_balance_box(Integer int1) {

    }
    @When("User click “Save” button.")
    public void user_click_save_button() {

    }
    @Then("user verifies “This field is required.” message should show up under the Description box")
    public void user_verifies_this_field_is_required_message_should_show_up_under_the_description_box() {

    }

    @When("User should fill “description” area.")
    public void user_should_fill_description_area() {

    }
    @Then("User verifies successfull pop up message on the page")
    public void user_verifies_successfull_pop_up_message_on_the_page() {

    }

    @When("user should not enter any value in “Balance” box")
    public void user_should_not_enter_any_value_in_balance_box() {

    }
    @Then("user verifies “This field is required.” message should show up under the “Balance” box")
    public void user_verifies_this_field_is_required_message_should_show_up_under_the_balance_box() {

    }


    @When("user should enter {int} in “Balance” box")
    public void user_should_enter_in_balance_box(Integer int1) {

    }


    @When("User select account type as a “SAVING” from “account type” box")
    public void user_select_account_type_as_a_saving_from_account_type_box() {

    }



    @When("User select  as “SUSPENDED” from “account status type” box")
    public void user_select_as_suspended_from_account_status_type_box() {

    }

    @When("User select  as “ACTIVE” from “account status type” box")
    public void user_select_as_active_from_account_status_type_box() {

    }
    @When("user click and select an employee from “Employee”dropdown")
    public void user_click_and_select_an_employee_from_employee_dropdown() {

    }


}

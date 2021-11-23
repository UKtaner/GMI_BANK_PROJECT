package gmibank.step_definitions;

import gmibank.pages.CustomerCreationPageByEmployee;
import gmibank.utilities.ConfigReader;
import gmibank.utilities.Driver;

public class LoginPage_step_defs {
    CustomerCreationPageByEmployee customerCreationPageByEmployee=new CustomerCreationPageByEmployee();
 //Driver.getDriver().get(ConfigReader.getProperty("app_url"));
}

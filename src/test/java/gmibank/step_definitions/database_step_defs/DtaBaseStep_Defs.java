package gmibank.step_definitions.database_step_defs;

import gmibank.utilities.DBUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import java.util.List;

public class DtaBaseStep_Defs {

        @Given("user connects to the database")
        public void user_connects_to_the_database() {

            DBUtils.createConnection();

        }
        @Given("user reads all users' info.")
        public void user_reads_all_users_info() {
            String query="SELECT * FROM public.tp_customer";
            List<Object>list=DBUtils.getColumnData(query,"email");

            for (Object w :list){
                System.out.println(w.toString());
            }
        }
    @Then("validate  all users")
    public void validate_all_users() {

    }
    @Given("read all countries's info.")
    public void read_all_countries_s_info() {

    }
    @Then("validate all countries")
    public void validate_all_countries() {

    }
    @Given("read all USA state's info.")
    public void read_all_usa_state_s_info() {

    }
    @Then("validate all states related to USA")
    public void validate_all_states_related_to_usa() {

    }
}


package IPASS;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * Created by sriramangajala on 04/02/17.
 */
public class StepDefs {

    HomePage homePage = new HomePage();

    @Given("^a registered user logged into the dashboard$")
    public void a_registered_user_logged_into_the_dashboard() throws Throwable {
        homePage.login();

    }

    @When("^he search for a course with title \"([^\"]*)\"$")
    public void he_search_for_a_course_with_title(String arg1) throws Throwable {

        homePage.search();
    }

    @When("^select the university \"([^\"]*)\" and navigate to the course \"([^\"]*)\"$")
    public void select_the_university_and_navigate_to_the_course(String arg1, String arg2) throws Throwable {

    }

    @When("^intended to apply for that course and selected apply course$")
    public void intended_to_apply_for_that_course_and_selected_apply_course() throws Throwable {

    }

    @Then("^the applied course \"([^\"]*)\" from univesity \"([^\"]*)\" should be added to his My Universities list$")
    public void the_applied_course_from_univesity_should_be_added_to_his_My_Universities_list(String arg1, String arg2) throws Throwable {
    }
}

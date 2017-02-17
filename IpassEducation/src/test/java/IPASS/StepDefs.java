package IPASS;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.apache.xpath.SourceTree;
import org.junit.Assert;
import org.openqa.selenium.By;
import utils.BrowserFactory;
import utils.WebDriverUtil;

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

    //Shiyas
    UniversityHomePage universityHomePage = new UniversityHomePage();
    StudentPage studentPage = new StudentPage();

    @Given("^user is in university home page of \"([^\"]*)\"$")
    public void userIsInUniversityHomePageOf(String university) {
        universityHomePage.searchUniversity(university);

    }

    @Then("^he should see title \"([^\"]*)\"$")
    public void heShouldSeeTitle(String title) {
        Assert.assertTrue(WebDriverUtil.isTextPresent(title));
    }

    @And("^navigates to \"([^\"]*)\"$")
    public void navigatesTo(String SocialStudies) {
        universityHomePage.selectViewCourse_SocialMedia();
    }

    @When("^he select \"([^\"]*)\"$")
    public void heSelect(String course) {
        WebDriverUtil.selectByLinkText(By.linkText(course));
    }

    @Then("^he should see \"([^\"]*)\" button$")
    public void heShouldSeeButton(String website) {
        Assert.assertTrue(BrowserFactory.getDriver().findElement(By.cssSelector("#view_website.btn.btn-primary.active")).isDisplayed());
    }

    @Then("^he should land on \"([^\"]*)\" page$")
    public void heShouldLandOnPage(String arg0) {
        WebDriverUtil.sleep(10);
        String Pagetitle = BrowserFactory.getDriver().getTitle();
        System.out.println(Pagetitle);
        Assert.assertTrue(Pagetitle.contains(" Welcome to the University of Salford | University of Salford, Manchester"));
    }

    @When("^he selects on \"([^\"]*)\" button$")
    public void heSelectsOnButton(String arg0) {

        universityHomePage.selectViewWebsite();
    }

    @Then("^he should see list of courses with titles \"([^\"]*)\"$")
    public void heShouldSeeListOfCoursesWithTitles(String ArtsAndComm) {
//        Assert.assertTrue(WebDriverUtil.isTextPresent(ArtsAndComm));
    }

    @When("^user selects view all courses$")
    public void userSelectsViewAllCourses() {
        universityHomePage.selectViewAllCourse();
    }

    @When("^he selects \"([^\"]*)\"$")
    public void heSelects(String ViewMap) {
        universityHomePage.selectMap();

    }


    @Then("^he should land on google maps$")
    public void heShouldLandOnGoogleMaps() {
        WebDriverUtil.sleep(10);
        Assert.assertTrue(BrowserFactory.getDriver().getTitle().contains("University of Salford - Google Maps"));
    }

    @And("^address \"([^\"]*)\"$")
    public void address(String address) {
        Assert.assertTrue(WebDriverUtil.isTextPresent(address));
    }

    @And("^phone number \"([^\"]*)\"$")
    public void phoneNumber(String PhoneNo) {
        Assert.assertTrue(WebDriverUtil.isTextPresent(PhoneNo));
    }

    @And("^should see the Courses with title \"([^\"]*)\",\"([^\"]*)\"$")
    public void shouldSeeTheCoursesWithTitle(String SocialStudies, String BusinessManagment) {
        Assert.assertTrue(WebDriverUtil.isTextPresent(SocialStudies));
        Assert.assertTrue(WebDriverUtil.isTextPresent(BusinessManagment));
    }

    @And("^select the \"([^\"]*)\" he is interested in$")
    public void selectTheHeIsInterestedIn(String course) {
        WebDriverUtil.selectByLinkText(By.linkText(course));
    }


    @Then("^the \"([^\"]*)\" must be displayed$")
    public void theMustBeDisplayed(String courseInfo) {
        Assert.assertTrue(WebDriverUtil.isTextPresent(courseInfo));
    }

    @And("^should see the section \"([^\"]*)\"$")
    public void shouldSeeTheSection(String text) {
        Assert.assertTrue(WebDriverUtil.isTextPresent(text));
    }

    @And("^interested universities \"([^\"]*)\"$")
    public void interestedUniversites(String Institute) {
        Assert.assertTrue(WebDriverUtil.isTextPresent(Institute));
    }

    @And("^selects Apply now$")
    public void selectsApplyNow() {
        universityHomePage.selectApplyNow();
    }

    @Then("^user should be prompted to login$")
    public void userShouldBePromptedToLogin() {
        Assert.assertTrue(WebDriverUtil.isTextPresent("Sign in"));
    }

    @And("^select \"([^\"]*)\"$")
    public void select(String course) {
        universityHomePage.selectCourse(course);
    }

    @Then("^the \"([^\"]*)\" is added to his profile$")
    public void theIsAddedToHisProfile(String course) {
        studentPage.select_UniversityMenu();
        Assert.assertTrue(WebDriverUtil.isTextPresent(course));
    }

    @Then("^the applied \"([^\"]*)\" is added to his profile$")
    public void theAppliedIsAddedToHisProfile(String course) {
        studentPage.select_UniversityMenu();
        Assert.assertTrue(WebDriverUtil.isTextPresent(course));
    }

    @Then("^he should see \"([^\"]*)\" button in university Page$")
    public void heShouldSeeButtonInUniversityPage(String ViewWebsite) {
        Assert.assertTrue(BrowserFactory.getDriver().findElement(By.cssSelector("#contact_adv.btn.btn-warning.active")).isDisplayed());
    }

    @When("^he selects on \"([^\"]*)\" button in university Page$")
    public void heSelectsOnButtonInUniversityPage(String arg0) {
        universityHomePage.selectVisitWebsite();

    }
}


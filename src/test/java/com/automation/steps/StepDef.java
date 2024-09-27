package com.automation.steps;

import com.automation.pages.HomePage;
import com.automation.pages.LoginPage;
import com.automation.test.BaseTest;
import com.automation.utils.ConfigReader;
import com.automation.utils.DriverManager;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import com.automation.pages.*;

public class StepDef  {
   LoginPage loginPage;
   HomePage homePage;
    @Given("user open website")
    public void user_open_website() {
      loginPage=new LoginPage();
      homePage=new HomePage();
      loginPage.openWebsite();

    }

    @Then("verify user is on login page")
    public void verify_user_is_on_login_page() {
    }

    @When("user login with valid credentials")
    public void user_login_with_valid_credentials() {
    }

    @Then("verify user is on home page")
    public void verify_user_is_on_home_page() {
    }

    @When("user click on burger icon")
    public void userClickOnBurgerIcon() {

    }

    @And("click on logout link")
    public void clickOnLogoutLink() {
    }

    @When("user login with username {string} and password {string}")
    public void userLoginWithUsernameAndPassword(String username, String password) {
    }

    @Then("verify invalid login error message is displayed")
    public void verifyInvalidLoginErrorMessageIsDisplayed() {

    }

    @Given("user opens website")
    public void userOpensWebsite() {

    }

    @Then("verify user is on homepage")
    public void verifyUserIsOnHomepage() {


    }

    @When("user click on user icon")
    public void userClickOnUserIcon() {


    }

    @When("login with username {string} and password {string}")
    public void loginWithUsernameAndPassword(String arg0, String arg1) {
    }

    @Then("verify invalid user error message is displayed")
    public void verifyInvalidUserErrorMessageIsDisplayed() {
    }

    @When("user click on admin")
    public void userClickOnAdmin() {
    }

    @And("select user role as admin")
    public void selectUserRoleAsAdmin() {
    }

    @And("click on search button")
    public void clickOnSearchButton() {
    }

    @Then("validate the list of users are greater than or equal one")
    public void validateTheListOfUsersAreGreaterThanOrEqualOne() {
    }

    @When("user click on leave menu")
    public void userClickOnLeaveMenu() {
    }

    @Then("verify user is on leave page")
    public void verifyUserIsOnLeavePage() {
    }

    @When("click on apply button")
    public void clickOnApplyButton() {
    }

    @Then("leave application form is displayed")
    public void leaveApplicationFormIsDisplayed() {
    }

    @And("select random leave type")
    public void selectRandomLeaveType() {
    }

    @And("enter leave date")
    public void enterLeaveDate() {
    }

    @And("select partial days to all days")
    public void selectPartialDaysToAllDays() {
    }

    @And("duration half day morning")
    public void durationHalfDayMorning() {
    }

    @Then("verify the success message is displayed")
    public void verifyTheSuccessMessageIsDisplayed() {
    }

    @And("click on my leave")
    public void clickOnMyLeave() {
    }

    @Then("verify date entry with date displayed")
    public void verifyDateEntryWithDateDisplayed() {
    }
}

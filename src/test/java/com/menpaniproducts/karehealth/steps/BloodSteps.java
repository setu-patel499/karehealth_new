package com.menpaniproducts.karehealth.steps;

import com.menpaniproducts.karehealth.pages.BloodGroupPage;
import com.menpaniproducts.karehealth.pages.DashBoardPage;
import com.menpaniproducts.karehealth.pages.LoginPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.junit.Assert;

public class BloodSteps {
    @Given("^I am on loginpage$")
    public void iAmOnLoginpage() {
    }

    @And("^I click on username and enter \"([^\"]*)\"$")
    public void iClickOnUsernameAndEnter(String username)  {
        new LoginPage().enterUsername(username);
    }

    @And("^I click on password and enter \"([^\"]*)\"$")
    public void iClickOnPasswordAndEnter(String password)  {
        new LoginPage().enterPassword(password);
    }

    @Then("^I click on login button$")
    public void iClickOnLoginButton() {
        new LoginPage().clickOnLoginBtn();
    }

    @And("^I am on dashboard page$")
    public void iAmOnDashboardPage() {
    }

    @And("^I mouse hover and click on blood group tab$")
    public void iMouseHoverAndClickOnBloodGroupTab() {
        new DashBoardPage().clickOnBloodGroupBtn();
    }

    @Then("^I should navigated to the blood group page$")
    public void iShouldNavigatedToTheBloodGroupPage() {
    }

    @And("^I should be able to click on vertical ellipsis link under the action tab$")
    public void iShouldBeAbleToClickOnVerticalEllipsisLinkUnderTheActionTab() {
        new BloodGroupPage().clickOnVerticalEllipsis();
    }

    @And("^I mouse hover and click on edit button$")
    public void iMouseHoverAndClickOnEditButton() {
        new BloodGroupPage().clickOnEditLink();
    }


    @Then("^I mouse hover and click on Submit button$")
    public void iMouseHoverAndClickOnSubmitButton() {
        new BloodGroupPage().clickOnSubmitBtn();
    }


    @And("^I should see the error message \"([^\"]*)\"$")
    public void iShouldSeeTheErrorMessage(String arg0) {
        String expectedMessage = "Permission denied";
        String actualMessage = new BloodGroupPage().getVerifyText();
        Assert.assertEquals("text not displayed", expectedMessage, actualMessage);
    }



}


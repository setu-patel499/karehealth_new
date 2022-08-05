Feature: Blood Group
  As a user I want to login and edit blood group
@Regression
  Scenario:User Should able to click on Login link SuccessFully and navigate to dashboard page
    Given I am on loginpage
    And I click on username and enter "admin"
    And I click on password and enter "admin"
    Then I click on login button
    And I am on dashboard page
    And I mouse hover and click on blood group tab
    Then I should navigated to the blood group page
And I should be able to click on vertical ellipsis link under the action tab
  And I mouse hover and click on edit button
  Then I mouse hover and click on Submit button
  And I should see the error message "Permission denied"







Feature: Leave Functionality  Test

#  @Smoke        //grouping
  Scenario: User applies for leave
    Given user open website
    Then verify user is on login page
    When user login with valid credentials
    Then verify user is on home page
    When user click on leave menu


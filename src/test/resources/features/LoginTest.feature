#Feature: As a user,I want to login into the application
##        Validate login functionality
#
#  Scenario: Verify user can login with valid credentials
#    Given user open website
#    Then verify user is on login page
#    When user login with username "test" and password "test123"
#    Then verify user is on home page
#
#
#  Scenario: Verify user can logout of the application
#    Given user open website
#    Then verify user is on login page
#    When user login with username "test" and password "test123"
#    Then verify user is on home page
#    When user click on burger icon
#    And click on logout link
#    Then verify user is on login page
#
#  @WIP
#  Scenario Outline: Verify error message for invalid login credentials
#    When user login with username "<username>" and password "<password>"
#    Then verify invalid login error message is displayed
#    Examples:
#      | username |password |
#      | test     | test123 |
#      | hello    | hello12 |
#      | java     | java123 |

Feature: Validate login functionality

  Background:
    Given user open website
    Then verify user is on login page

  @Smoke
  Scenario: Verify user can login with valid credentials
    When user login with valid credentials
    Then verify user is on homepage


  Scenario: Verify user can logout of the application
    When user login with username "admin" and password "admin123"
    Then verify user is on homepage
    When user click on user icon
    And click on logout link
    Then verify user is on login page


  @WIP
  Scenario Outline: Verify error message for invalid login credentials
    When login with username "<username>" and password "<password>"
    Then verify invalid user error message is displayed

    Examples:
      | username |password |
      | test     | test123 |
      | hello    | hello12 |
      | java     | java123 |



  Scenario: Verify at least one admin user is present in user list
    When user login with valid credentials
    Then verify user is on homepage
    When user click on admin
    And select user role as admin
    And click on search button
    Then validate the list of users are greater than or equal one


  Scenario: Verify user can apply for the leave
    When user login with valid credentials
    Then verify user is on homepage
    When user click on leave menu
    Then verify user is on leave page
    When click on apply button
    Then leave application form is displayed
    And select random leave type
    And enter leave date
    And select partial days to all days
    And duration half day morning
    When click on apply button
    Then verify the success message is displayed
    And click on my leave
    Then verify date entry with date displayed






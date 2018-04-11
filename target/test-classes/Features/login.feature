Feature: open the browser and open gmail
  Scenario: open the browser and open gmail for a specific user
    Given the user is on landing page
    Then type "search" on the search page

  Scenario: Sign up a new user
    Given the user is on landing page
    When she chooses to sign up
    And she provides the first name as "Sukesh"
    And she provides the last name as "Kumar"
    And she provides the email as "validemail@aq.com"
    And she provides the password as "password"
    And she provides the confirm password again as password
    And she signs-up
    Then she should be logged in to the application
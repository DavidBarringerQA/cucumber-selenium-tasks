@selenium
Feature: Register and login

  Background: Registered
    Given I am at http://thedemosite.co.uk
    And I am registering
    And I input username Jimothy
    And I input password pass123
    When I click submit
    Then I am registered
    And my username is Jimothy
    And my password is pass123

	  Scenario: Login
      Given I am at http://thedemosite.co.uk
      And I am logging in
	    And I input username Jimothy
	    And I input password pass123
	    When I click submit
	    Then the login is successful

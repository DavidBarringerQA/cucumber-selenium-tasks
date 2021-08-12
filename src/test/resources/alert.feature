@selenium
Feature: Alert input
  Background: On website
    Given I am at http://way2automation.com/way2auto_jquery/alert.php#load_box
    And I go to input alert
    And I am on frame 1
  
    Scenario: Input alert
      When I input "TEST NAME"
      Then I see "Hello TEST NAME! How are you today?"

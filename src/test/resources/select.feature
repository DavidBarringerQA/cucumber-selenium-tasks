@selenium
Feature: Select

  Background: On website
    Given I am at http://way2automation.com/way2auto_jquery/selectable.php#load_box
    And I am on frame 0
	
	  Scenario: Element selected
	    When I click item 2
	    Then "Item 2" is highlighted

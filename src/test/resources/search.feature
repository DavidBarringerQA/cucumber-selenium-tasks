@selenium
Feature: Search
  Using bing to searc

  As a user, when I search, then I get results for what I searched for

  Background: Browser is open to search engine
     Given at a search engine
	
	  Scenario: Search for item
	    When I search for "doge"
	    Then the title is "doge - Bing"


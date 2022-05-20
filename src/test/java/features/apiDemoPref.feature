Feature: Checking the Preference Dependency on API Demos APP



@smokeTest
Scenario Outline: Navigating Preference Dependency and check the WiFi settings
	Given Server is started and the API Demos APP is opened
	And Navigate to Preferences Tab
	And Click on Preference Dependencies Sub-Tabs
	And Click on WiFi Checkbox
	When Click on WiFi settings
	Then Enter configs <data> in WiFi Input
	And  Click on OK Button
	And Stop the Server
	
	
	Examples:
	|data |
    |12345|
    |&^%%%|
    

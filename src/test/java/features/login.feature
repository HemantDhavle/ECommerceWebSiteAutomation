Feature: Validate login page functionality

@RegTest
Scenario Outline: To check user logged in successfully
Given User is on login page
When User enters <username> and <password>
When clicks on login button
Then User should be logged in successfully

Examples:
|username|password|
|hemant|12345|
|navya|12323|

@SmokeTest @RegTest
Scenario: To check user signed up successfully
Given User is on login page
When Enter following details
|hemant|dhavle|khandwa|32|AutomationTester|
When Clicks on Sign Up button
Then User should be signed up successfully






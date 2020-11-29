Feature: Leaftab login functionality

#Background:
#Given Launch the chrome Browser
#And Load the application URL

@regression
Scenario Outline: test the login function with positive credential
Given Enter the username as <username>
And Enter the password as <password>
When Click on Login button
Then Homepage should be display

Examples:
|username|password|
|demosalesmanager|crmsfa|
|democsr|crmsfa|


@smoke @regression
Scenario: test the login function with negative credential
Given Enter the username as demosalesmanger
And Enter the password as crmsfa123
When Click on Login button
Then Homepage should be display
But Error message should be display

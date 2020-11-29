Feature: Leaftab login functionality
Scenario: test create lead with mandatory fields
#Given Launch the chrome Browser
#And Load the application URL
Given Enter the username as demosalesmanager
And Enter the password as crmsfa
When Click on Login button
Then Homepage should be display
When click on crmsfa link
And click leads option
And Click FindLead option
When Click phone option in findby section
And Enter phone number as 77
And Click findleads button in findby section
And Select the particular lead ID and click it
And Click delete button in left side
And Click FindLead option
And enter the deleted lead ID in LeadID text field
And Click findleads button in findby section
Then deleted lead should not present 

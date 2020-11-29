Feature: Create the new lead functionality

@functional
Scenario Outline: test create lead with mandatory fields
#Given Launch the chrome Browser
#And Load the application URL
Given Enter the username as demosalesmanager
And Enter the password as crmsfa
When Click on Login button
Then Homepage should be display
When click on crmsfa link
And click leads option
And Click createlead option
And Enter the companyname as <Companyname>
And Enter the firstname as <Firstname>
And Enter the lastname as <Lastname>
And Click Createlead Button
Then ViewLead page shouldbe appeared

Examples:
|Companyname|Firstname|LastName|
|Hermatic|jaya|Praksh|
|Vernalis|Jayaprakash|jp|
|Exela|Jp|devaraj|



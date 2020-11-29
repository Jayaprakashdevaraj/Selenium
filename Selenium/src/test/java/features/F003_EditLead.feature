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
And Click lead in result section
And Click Edit button in leftside
And change compant name as Vernalis
And Click Update Button
Then ViewLead page shouldbe appeared

Feature: Testing orangehrm
Scenario: To test the login page of orangehrm
Given The user should be in the login page
When Enter the username "Admin"
And Enter the password "admin123" 
And Click on login button
Then The page title should be "OrangeHRM"
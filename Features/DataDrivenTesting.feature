Feature: DataDrivenTesting



Scenario Outline: Verify DataDriven Testing
Given user launch chrome Browser
Then User browse application URL "http://demowebshop.tricentis.com/"
Then Login Link should display
When user clicks on Login  link
Given User Enters the credentials
Then User enters email as "<username>" and password as "<password>"
And  User click on login button
Then User clicks on logout button
And  Close Browser
Examples:
    |username|password|
    |test@kuna.com|test@123|
    |test@champi.com|test@123|
    |gabu@tabu.com|test@123|
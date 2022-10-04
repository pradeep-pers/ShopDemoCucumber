Feature:  Login 

Scenario: Verify User able to login with Valid Credentials
Given user launch chrome Browser
Then User browse application URL "http://demowebshop.tricentis.com/"
Then Login Link should display
When user clicks on Login  link
Then User enters email as "test@kuna.com" and password as "test@123"
And  User click on login button
And Home page title should be "Demo Web Shop "
And  Close Browser
Feature:  Login 

Background: User is Logged In
Given user launch chrome Browser
Then User browse application URL "http://demowebshop.tricentis.com/"
Then Login Link should display
When user clicks on Login  link

Scenario: Verify User able to login with Valid Credentials
Then User enters email as "test@kuna.com" and password as "test@123"
And  User click on login button
And Home page title should be "Demo Web Shop "
And  Close Browser


Scenario: Verify User able to logout

Then User enters email as "test@kuna.com" and password as "test@123"
And  User click on login button
And Home page title should be "Demo Web Shop "
Then User clicks on logout button
And  Close Browser

Scenario: Verify User LoginName should display correctly

Then User enters email as "test@kuna.com" and password as "test@123"
And  User click on login button
Then  page should display correct username as per the login
And  Close Browser

Scenario: Verify LoginTab Values

Then User enters email as "test@kuna.com" and password as "test@123"
And  User click on login button
Then  HeaderMenu Should display corrct values 
      |BOOKS| COMPUTERS| ELECTRONICS| APPAREL & SHOES| DIGITAL DOWNLOADS| JEWELRY| GIFT CARADS|
 And  Close Browser
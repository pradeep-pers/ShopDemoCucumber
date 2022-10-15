Feature:  HeaderText

Scenario: Header Text Should display correctly
Given user launch chrome Browser
Then User browse application URL "http://demowebshop.tricentis.com/"
Then  HeaderText Should display corrct values 
      |Register| Log in| Shopping cart(0)| Wishlist(0)|
 And  Close Browser
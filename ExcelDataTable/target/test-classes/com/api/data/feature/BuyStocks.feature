Feature: This is a part of stock market where user can place buy order for equity for the following transactions
Background: 
Given Test Data is in specified file "com/api/data/BuyAndSellStocksTestData.xlsx"

Scenario: Successful login with valid credentials
Given User is on Login Home page
And   User enters UserName and Password
And   Click on Login Now button
Then  Validate the login page


Scenario: Buy the stock in certain quantity at market or Limit price from different exchange
    Given User is logged in and on Virtual Stocks Home page 
    When  User clicks on Place Order link from left equity widget panel by default Cash Buy form gets open  
    Then  Select "<EquityPlaceOrderProduct>"
    And   Select "<ExchangeType>"
    And   Enter "<StockName>" Name
    And   Enter "<BuyQuantity>" and select "<OrderValidity>" 
    And   If "<OrderType>" Limit enter "<LimitPrice>" otherwise left blank
    When  Click on Buy Now button
    Then  Click on Proceed button
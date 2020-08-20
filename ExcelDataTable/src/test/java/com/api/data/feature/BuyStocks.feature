Feature: This is a part of stock market where user can place buy order for equity for the following transactions
Scenario: Successful login with valid credentials
Given User is on Login Home page
And   User enters UserName and Password
And   Click on Login Now button
Then  Validate the login page


Scenario Outline: Buy the stock in certain quantity at market or Limit price from different exchange
    Given User is logged in and on Virtual Stocks Home page 
    When  User clicks on Place Order link from left equity widget panel by default Cash Buy form gets open  
    Then  Select "<EquityPlaceOrderProduct>"
    And   Select "<ExchangeType>"
    And   Enter "<StockName>" Name
    And   Enter "<BuyQuantity>" and select "<OrderValidity>" 
    And   If "<OrderType>" Limit enter "<LimitPrice>" otherwise left blank
    When  Click on Buy Now button
    Then  Click on Proceed button
    
Examples:
      
      | EquityPlaceOrderProduct | ExchangeType | StockName | OrderValidity | SellQuantity | OrderType | LimitPrice | BuyQuantity |
      
      | Cash                    | NSE          | SBI       | Day           | 279.0        | LIMIT     | £55.05     | 931.0       |
      
      | Cash                    | BSE          | KEC       | Day           | 625.0        | MARKET    | £15.90     | 681.0       |
      
      | Cash                    | NSE          | INFOSYS   | Day           | 348.0        | LIMIT     | £51.44     | 489.0       |
      
      | Cash                    | BSE          | JP        | Day           | 468.0        | MARKET    | £59.34     | 508.0       |
      
      | Cash                    | NSE          | ACC       | Day           | 160.0        | LIMIT     | £89.10     | 468.0       |


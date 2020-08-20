Feature: Place Order

Background: 
    Given Use Valid data from the file "C:\Users\Revaan\Downloads\clq6l17k2ohu08v56jl25kvqlndataAug-11-2020 (6).xlsx"
Scenario: Fill the Form and place order in Cash buy Segment
Given User is on Equity place order page
And Select Product
And Select Exchange
And Enter Stock
And Enter Quantity
And Select Order Validity and Order Type
And Enter Limit Price  
Then Click on Buy Now button



package com.api.data.stepdfn;



import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.Transform;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.List;
import java.util.Map;

import com.api.data.transform.ExcelDataToDataTable;

public class buyStocksStepdfn {
	
	private static List<Map<String, String>> generatedTable;
	
	@Given("^Test Data is in specified file \"([^\"]*)\"$")
	public void test_Data_is_in_specified_file(@Transform(ExcelDataToDataTable.class) DataTable table) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //System.out.println(table.toString());
	    generatedTable = table.asMaps(String.class, String.class);
	    System.out.println(generatedTable.get(1));
	    
	
	}

	@Given("^User is on Login Home page$")
	public void user_is_on_Login_Home_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("User is on Login Home page");
	}

	@Given("^User enters UserName and Password$")
	public void user_enters_UserName_and_Password() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
        System.out.println("User enters username and password successfully");
	}

	@Given("^Click on Login Now button$")
	public void click_on_Login_Now_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("clicked on Login now button successfully");
	}

	@Then("^Validate the login page$")
	public void validate_the_login_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("Validation successfully");
	}
	
	@Given("^User is logged in and on Virtual Stocks Home page$")
	public void user_is_logged_in_and_on_Virtual_Stocks_Home_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("User is logged in and on Virtual Stocks Home page");
	}

	@When("^User clicks on Place Order link from left equity widget panel by default Cash Buy form gets open$")
	public void user_clicks_on_Place_Order_link_from_left_equity_widget_panel_by_default_Cash_Buy_form_gets_open() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("User clicks on Place Order link from left equity widget panel by default Cash Buy form gets open");
	}

	@Then("^User click on Cash Sell tab button$")
	public void user_click_on_Cash_Sell_tab_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("User click on Cash Sell tab button");
	}
	
	
	
	@Then("^Select \"([^\"]*)\"$")
	public void select(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println(generatedTable.get(1).get("EquityPlaceOrderProduct") + generatedTable.get(1).get("ExchangeType"));
	}

	
	@Then("^Enter \"([^\"]*)\" Name$")
	public void enter_Name(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println(generatedTable.get(1).get("StockName"));
		for(Map<String, String> data : generatedTable) {
			System.out.println(data.get("StockName"));
		}
	}

	@Then("^Enter \"([^\"]*)\" and select \"([^\"]*)\"$")
	public void enter_and_select(String arg1, String arg2) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println(generatedTable.get(1).get("BuyQuantity") + generatedTable.get(1).get("OrderValidity") + generatedTable.get(1).get("SellQuantity"));
	}

	@Then("^If \"([^\"]*)\" Limit enter \"([^\"]*)\" otherwise left blank$")
	public void if_Limit_enter_otherwise_left_blank(String arg1, String arg2) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println(generatedTable.get(1).get("OrderType") + generatedTable.get(1).get("LimitPrice"));
	}
	
	@Then("^If \"([^\"]*)\" Limit enter \"([^\"]*)\" Otherwise left blank$")
	public void if_Limit_enter_Otherwise_left_blank(String arg1, String arg2) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println(generatedTable.get(1).get("OrderType") + generatedTable.get(1).get("LimitPrice"));
	}

	@When("^Click on Sell Now button$")
	public void click_on_Sell_Now_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("Clicked on Sell Now button Successfully");
	}
	
	@Then("^Click on Proceed button$")
	public void click_on_Proceed_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("Clicked on Proceed button successfully");
	}


}

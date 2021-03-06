package com.api.data.stepdfn;



import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.Transform;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.api.data.transform.ExcelDataToDataTable;

public class buyStocksStepdfn {
	
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
	    System.out.println("Select EquityPlaceProduct");
	}

	
	@Then("^Enter \"([^\"]*)\" Name$")
	public void enter_Name(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("ExchangeType");
	}

	@Then("^Enter \"([^\"]*)\" and select \"([^\"]*)\"$")
	public void enter_and_select(String arg1, String arg2) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("StockName");
	}

	@Then("^If \"([^\"]*)\" Limit enter \"([^\"]*)\" otherwise left blank$")
	public void if_Limit_enter_otherwise_left_blank(String arg1, String arg2) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("StockName");
	}
	
	@Then("^If \"([^\"]*)\" Limit enter \"([^\"]*)\" Otherwise left blank$")
	public void if_Limit_enter_Otherwise_left_blank(String arg1, String arg2) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("StockName");
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

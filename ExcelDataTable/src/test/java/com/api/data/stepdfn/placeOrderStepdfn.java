package com.api.data.stepdfn;

import java.util.List;
import java.util.Map;

import com.api.data.transform.ExcelDataToDataTable;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.Transform;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import gherkin.formatter.model.DataTableRow;

public class placeOrderStepdfn {
	
	
	private static Map<String, String> generatedTable;
	
	@Given("^Use Valid data from the file \"([^\"]*)\"$")
	public void use_Valid_data_from_the_file(@Transform(ExcelDataToDataTable.class) DataTable table) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		//System.out.println(table.toString());
		generatedTable = (Map<String, String>) table.asMaps(String.class, String.class);
		    //System.out.println(generatedTable);
		for (Map<String, String> data : table.asMaps(String.class, String.class)) {
			 System.out.println(generatedTable.get("StartIn"));
			     //data.get("Password");
			     
			 }
	}
	
	@Given("^User is on Equity place order page$")
	public void user_is_on_Equity_place_order_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
	  
	}

	@Given("^Select Product$")
	public void select_Product() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		//System.out.println(generatedTable.get(0).get(0));
	}

	@Given("^Select Exchange$")
	public void select_Exchange() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		//System.out.println(generatedTable.get(0).get(1));
	}

	@Given("^Enter Stock$")
	public void enter_Stock() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		//System.out.println(generatedTable.get(0).get(2));
	}

	@Given("^Enter Quantity$")
	public void enter_Quantity() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		//System.out.println(generatedTable.get(0).get(3));
	}

	@Given("^Select Order Validity and Order Type$")
	public void select_Order_Validity_and_Order_Type() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		//System.out.println(generatedTable.get(0).get(4) + generatedTable.get(0).get(5));
	}

	@Given("^Enter Limit Price$")
	public void enter_Limit_Price() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		//System.out.println(generatedTable.get(0).get(6));
	}

	@Then("^Click on Buy Now button$")
	public void click_on_Buy_Now_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Button Clicked Successfully");
	}

}
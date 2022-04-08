package stepDefination;

import java.util.List;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class loginStepDefination 
{
	    @Given("^User is on login page$")
	    public void user_is_on_login_page() throws Throwable {
	        System.out.println("User is on login page");
	    }

	    @When("^User enters (.+) and (.+)$")
	    public void user_enters_and(String username, String password) throws Throwable {
	        System.out.println(username);
	        System.out.println(password);
	    }

	    @When("^clicks on login button$")
	    public void clicks_on_login_button() throws Throwable {
	        System.out.println("Clicks on login button");
	    }

	    @Then("^User should be logged in successfully$")
	    public void user_should_be_logged_in_successfully() throws Throwable {
	        System.out.println("User should be logged in successfully");
	    }
	   
		
	    @When("Enter following details")
	    public void enter_following_details(DataTable dataTable) 
	    {
	    	List<List<String>> object = dataTable.asLists();
	    	System.out.println(object.get(0).get(0));
	    	System.out.println(object.get(0).get(1));
	    	System.out.println(object.get(0).get(2));
	    	System.out.println(object.get(0).get(3));
	    	System.out.println(object.get(0).get(4));
	    }
	    @When("^Clicks on Sign Up button$")
	    public void clicks_on_sign_up_button() throws Throwable {
	        System.out.println("Clicks on SignUp button");
	    }

	    @Then("^User should be signed up successfully$")
		public void user_should_be_signed_up_successfully()
		{
			System.out.println("User should be signed up successfully");
		}
	
	
}

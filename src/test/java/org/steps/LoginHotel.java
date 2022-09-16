package org.steps;

import org.Base.BaseClass;
import org.pom.LoginPagepom;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginHotel extends BaseClass {
	
	
	@Given("User Launches the adactin url")
	public void user_Launches_the_adactin_url() {
		
		browserLaunch("http://adactinhotelapp.com/index.php");
		
	   
	}

	@When("user enters the username and password")
	public void user_enters_the_username_and_password() {
	    
		LoginPagepom a= new LoginPagepom();
		
		enterText(a.getUsername(),"AHAMEDNAWAZ");
		enterText(a.getPassword(),"Ahamed@123");
		
	}

	@And("User click the login button")
	public void user_click_the_login_button() {
		LoginPagepom a= new LoginPagepom();
		buttonClick(a.getLogin());
	   
	}

	@Then("User navigates to search  hotel page")
	public void user_navigates_to_search_hotel_page() {
	   
		 System.out.println("Successfully navigated to Search Hotel Page");
	}

}

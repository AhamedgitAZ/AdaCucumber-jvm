package org.steps;

import org.Base.BaseClass;
import org.openqa.selenium.WebElement;
import org.pom.SearchPagepom;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SearchHotel extends BaseClass{
	
	@Given("User enter all the mandatory fields")
	public void user_enter_all_the_mandatory_fields() {
		
		SearchPagepom a = new SearchPagepom();
		
		WebElement location = a.getLocation();
		selectByIndex(location,5);
		
		WebElement noRooms = a.getNoRooms();
		selectByIndex(noRooms,2);
		
		WebElement checkInDate = a.getCheckInDate();
		checkInDate.clear();
		enterDate(checkInDate," 13/09/2022");
		
		WebElement checkOutDate = a.getCheckOutDate();
		checkOutDate.clear();
		enterDate(checkOutDate," 15/09/2022");
		
		selectByIndex(a.getAdultPerRoom(), 2);
		
		
		
	   
	}

	

	@When("User enters other fields if required")
	public void user_enters_other_fields_if_required() {
		
		SearchPagepom a = new SearchPagepom();
		
		WebElement hotels = a.getHotels();
		selectByVisibleText(hotels,"Hotel Sunshine");
		
		WebElement roomType = a.getRoomType();
		selectByVisibleText(roomType,"Super Deluxe");
		
		WebElement childPerRoom = a.getChildPerRoom();
		selectByValue(childPerRoom,"4");
		
		
	   
	}

	@And("User cliks the search button")
	public void user_cliks_the_search_button() {
		
		SearchPagepom a = new SearchPagepom();
		
		buttonClick(a.getSubmitClick());
	    
	}

	@Then("User navigates to select Hotel page")
	public void user_navigates_to_select_Hotel_page() {
		
		System.out.println("Successfully navigated to Select Hotel Page");
	   
	}

}

package org.steps;

import org.Base.BaseClass;
import org.openqa.selenium.WebElement;
import org.pom.BookPagepom;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class BookHotel extends BaseClass {

	@Given("User enter all the fields mrked with asterix")
	public void user_enter_all_the_fields_mrked_with_asterix() throws InterruptedException {

		BookPagepom a = new BookPagepom();
		WebElement lastName = a.getLastName();
		enterText(lastName, "NAWAZ");
		WebElement firstName = a.getFirstName();

		enterText(firstName, "AHAMED");

		Thread.sleep(5000);

		enterText(a.getAddress(), "CHENNAI");
		enterText(a.getCreditCardNo(), "1234567891234567");
		// enterText(a.getCardNumber(), "1234567891234567");
		enterText(a.getCvvNumber(), "123");
		selectByValue(a.getCardType(), "VISA");
		selectByIndex(a.getExpiryMonth(), 2);
		selectByVisibleText(a.getExpiryYear(), "2022");

	}

	@And("User clicks book now button")
	public void user_clicks_book_now_button() {

		BookPagepom a = new BookPagepom();

		WebElement bookNow = a.getBookNow();
		buttonClick(bookNow);
	}

	@Then("User Navigates to Booking confirmation Page")
	public void user_Navigates_to_Booking_confirmation_Page() {

		System.out.println("Successfully navigated to Booking Confirmation Page");
	}

}

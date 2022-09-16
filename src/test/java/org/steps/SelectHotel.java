package org.steps;

import org.Base.BaseClass;
import org.openqa.selenium.WebElement;
import org.pom.SelectPagepom;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class SelectHotel extends BaseClass {

	@Given("User clicks select button")
	public void user_clicks_select_button() {

		SelectPagepom a = new SelectPagepom();

		WebElement selectButton = a.getRadioButton();
		buttonClick(selectButton);

	}

	@And("User clicks continue button")
	public void user_clicks_continue_button() {

		SelectPagepom a = new SelectPagepom();
		WebElement continueButton = a.getSelectcontinue();
		buttonClick(continueButton);
	}

	@Then("User navigate to Book a Hotel page")
	public void user_navigate_to_Book_a_Hotel_page() {

		System.out.println("Successfully navigated to Book A Hotel Page");
	}

}

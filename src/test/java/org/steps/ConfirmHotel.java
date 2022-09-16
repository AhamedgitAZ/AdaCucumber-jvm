package org.steps;

import org.Base.BaseClass;
import org.openqa.selenium.WebElement;
import org.pom.ConfirmPagepom;

import cucumber.api.java.en.Given;

public class ConfirmHotel extends BaseClass{
	
	@Given("User click the logout bbutton")
	public void user_click_the_logout_bbutton() {
	    
		
		ConfirmPagepom a = new ConfirmPagepom();
		
		//WebElement logout = a.getLogoutButton();
		buttonClick(a.getLogoutButton());
	}

}

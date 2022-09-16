package org.pom;

import org.Base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ConfirmPagepom extends BaseClass{
	
	
	public ConfirmPagepom() {
		
		PageFactory.initElements(driver, this);
	}

	
	public WebElement getLogoutButton() {
		return logoutButton;
	}


	@FindBy(xpath="//input[@value=\"Logout\"]")
	
	private WebElement logoutButton;
	
}


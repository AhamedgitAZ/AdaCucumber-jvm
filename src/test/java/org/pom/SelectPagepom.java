package org.pom;

import org.Base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectPagepom  extends BaseClass{
	
	public SelectPagepom() {
		
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//input[@name='radiobutton_0']")
	private WebElement radioButton;
	
	
	public WebElement getRadioButton() {
		return radioButton;
	}

	public WebElement getSelectcontinue() {
		return selectcontinue;
	}

	@FindBy(xpath="//input[@name='continue']")
	private WebElement selectcontinue;

}

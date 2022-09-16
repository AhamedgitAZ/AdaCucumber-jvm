package org.pom;

import org.Base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookPagepom extends BaseClass {

	public BookPagepom() {

		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@name='first_name']")
	private WebElement firstName;

	@FindBy(xpath = "//input[@name='last_name']")
	private WebElement lastName;

	@FindBy(id = "address")
	private WebElement address;
	
	@FindBy(xpath="//input[@name='cc_num']")
	private WebElement creditCardNo;

	@FindBy(xpath = "//select[@name='cc_type']")
	private WebElement cardType ;

	@FindBy(xpath="//select[@name='cc_exp_month']")
	private WebElement expiryMonth;

	public WebElement getAddress() {
		return address;
	}

	public WebElement getCreditCardNo() {
		return creditCardNo;
	}

	public WebElement getCardType() {
		return cardType;
	}

	public WebElement getExpiryMonth() {
		return expiryMonth;
	}

	public WebElement getExpiryYear() {
		return expiryYear;
	}

	public WebElement getCvvNumber() {
		return cvvNumber;
	}

	public WebElement getBookNow() {
		return bookNow;
	}

	@FindBy(xpath="//select[@name='cc_exp_year']")
	private WebElement expiryYear;


	@FindBy(xpath="//input[@name='cc_cvv']")
	private WebElement cvvNumber;
	
	@FindBy(xpath="//input[@id='book_now']")
	private WebElement bookNow;
	
	public WebElement getFirstName() {
		return firstName;
	}

	public WebElement getLastName() {
		return lastName;
	}

	

}

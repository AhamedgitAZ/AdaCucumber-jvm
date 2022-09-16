package org.pom;

import org.Base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPagepom extends BaseClass {

	public SearchPagepom() {

		PageFactory.initElements(driver, this);
		
	}

	@FindBy(xpath = "//select[@name='location']")
	private WebElement location;

	@FindBy(xpath = "//select[@id='hotels']")
	private WebElement hotels;

	@FindBy(xpath = "//select[@name='room_type']")
	private WebElement roomType;

	@FindBy(xpath = "//select[@name='room_nos']")
	private WebElement noRooms;

	public WebElement getSubmitClick() {
		return submitClick;
	}

	@FindBy(xpath = "//input[@name='datepick_in'] ")
	private WebElement checkInDate;

	
	@FindBy(xpath="//input[@type='submit'] ")
	private WebElement submitClick;
	
	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotels() {
		return hotels;
	}

	public WebElement getRoomType() {
		return roomType;
	}

	public WebElement getNoRooms() {
		return noRooms;
	}

	public WebElement getCheckInDate() {
		return checkInDate;
	}

	public WebElement getCheckOutDate() {
		return checkOutDate;
	}

	public WebElement getAdultPerRoom() {
		return adultPerRoom;
	}

	public WebElement getChildPerRoom() {
		return childPerRoom;
	}

	@FindBy(xpath = "//input[@name='datepick_out'] ")
	private WebElement checkOutDate;

	@FindBy(xpath = "//select[@name='adult_room'] ")
	private WebElement adultPerRoom;

	@FindBy(xpath = "//select[@name='child_room'] ")
	private WebElement childPerRoom;
}

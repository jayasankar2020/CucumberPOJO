package org.pages;

import org.base.LibGlobal;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchHotel extends LibGlobal{
	
	public SearchHotel() {
		PageFactory.initElements(driver, this);
			}
	@FindBy(id="location")
	private WebElement loction;
	@FindBy(id="hotels")
	private WebElement hotels;
	@FindBy(id="room_type")
	private WebElement roomType;
	@FindBy(id="room_nos")
	private WebElement roomNO;
	@FindBy(id="adult_room")
	private WebElement adultRoom;
	public WebElement getLoction() {
		return loction;
	}
	public WebElement getHotels() {
		return hotels;
	}
	public WebElement getRoomType() {
		return roomType;
	}
	public WebElement getRoomNO() {
		return roomNO;
	}
	public WebElement getAdultRoom() {
		return adultRoom;
	}
	public WebElement getChildRoom() {
		return childRoom;
	}
	public WebElement getSubmit() {
		return submit;
	}
	@FindBy(id="child_room")
	private WebElement childRoom;
    @FindBy(id="Submit")
	private WebElement submit;


	
	

}

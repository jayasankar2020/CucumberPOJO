package org.pages;

import org.base.LibGlobal;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ConfirmationPage extends LibGlobal {
	
	public ConfirmationPage() {
		PageFactory.initElements(driver, this);
		
	}
@FindBy(xpath="(//input[@type='text'])[16]")
private WebElement orderid;
@FindBy(xpath="//a[text()='Booked Itinerary']")
private WebElement booked;

@FindBy(xpath="(//input[@type='submit'])[2]")
private WebElement cancel;
public WebElement getBooked() {
	return booked;
}


public WebElement getCancel() {
	return cancel;
}


public WebElement getOrderid() {
	return orderid;
}

	
	
}

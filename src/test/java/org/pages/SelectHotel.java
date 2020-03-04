package org.pages;

import org.base.LibGlobal;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectHotel extends LibGlobal {

	public SelectHotel() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="radiobutton_0")
	private WebElement radio;
    @FindBy(id="continue")
	private WebElement enterContinue;
	public WebElement getRadio() {
		return radio;
	}
	public WebElement getEnterContinue() {
		return enterContinue;
	}

	
}

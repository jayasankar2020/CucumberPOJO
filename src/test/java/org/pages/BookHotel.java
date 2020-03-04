package org.pages;

import org.base.LibGlobal;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookHotel extends LibGlobal {
	
	public BookHotel() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="first_name")
	private WebElement fn;
	@FindBy(id="last_name")
	private WebElement ln;
	@FindBy(id="address")
	private WebElement ad;
	@FindBy(id="cc_num")
	private WebElement crdNum;
	@FindBy(id="cc_type")
	private WebElement crdType;
	@FindBy(id="cc_exp_month")
	private WebElement expMonth;
	@FindBy(id="cc_exp_year")
	private WebElement expYear;
	@FindBy(id="cc_cvv")
	private WebElement ccvNum;
    @FindBy(id="book_now")
	private WebElement bookBtn;
	public WebElement getFn() {
		return fn;
	}
	public WebElement getLn() {
		return ln;
	}
	public WebElement getAd() {
		return ad;
	}
	public WebElement getCrdNum() {
		return crdNum;
	}
	public WebElement getCrdType() {
		return crdType;
	}
	public WebElement getExpMonth() {
		return expMonth;
	}
	public WebElement getExpYear() {
		return expYear;
	}
	public WebElement getCcvNum() {
		return ccvNum;
	}
	public WebElement getBookBtn() {
		return bookBtn;
	}
    

	
	
	
}

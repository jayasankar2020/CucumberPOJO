package com.stepdefinition1;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.base.LibGlobal;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.pages.BookHotel;
import org.pages.ConfirmationPage;
import org.pages.LoginPage;
import org.pages.SearchHotel;
import org.pages.SelectHotel;

import com.managers.PageObjectManager;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginPageStAdactin extends LibGlobal {
	public WebDriver driver;
	PageObjectManager pageObjectManager;
	@Given("user is on adactin page")
	public void user_is_on_adactin_page() {
		driver = getDriver();
		loadUrl("https://adactin.com/HotelApp/");
	}
	@When("user enters details")
	public void user_enters_details(io.cucumber.datatable.DataTable data) throws InterruptedException, IOException {
		pageObjectManager = new PageObjectManager();
		List<Map<String, String>> emp = data.asMaps();
		String S1 = emp.get(1).get("userName");
		WebElement name = pageObjectManager.getLoginPage().getTxtUsername();
		type(name, S1);
		String S2 = emp.get(1).get("passWord");
		WebElement pass = pageObjectManager.getLoginPage().getTxtPassWord();
		type(pass, S2);
		WebElement btnLogin = pageObjectManager.getLoginPage().getBtnLogin();
		btnLogin.click();
		ScreensShot();
	}

	@When("User should verify the message")
	public void user_should_verify_the_message() {
		System.out.println("verify message");
	}

	@When("user should search Hotels")
	public void user_should_search_Hotels(io.cucumber.datatable.DataTable data) throws IOException {
		pageObjectManager = new PageObjectManager();
		List<Map<String, String>> emp = data.asMaps();
		String s3 = emp.get(0).get("location");
		WebElement loction = pageObjectManager.getSearchHotel().getLoction();
		type(loction, s3);
		String s4 = emp.get(0).get("Hotels");
		WebElement hotels = pageObjectManager.getSearchHotel().getHotels();
		type(hotels, s4);
		String s5 = emp.get(0).get("roomType");
		WebElement roomType = pageObjectManager.getSearchHotel().getRoomType();
		type(roomType, s5);
		String s6 = emp.get(0).get("numberOfRooms");
		WebElement roomNO = pageObjectManager.getSearchHotel().getRoomNO();
		type(roomNO, s6);
		String s7 = emp.get(0).get("adultsPerRoom");
		WebElement adultRoom = pageObjectManager.getSearchHotel().getAdultRoom();
		type(adultRoom, s7);
		String s8 = emp.get(0).get("childrenPerRoom");
		WebElement childRoom = pageObjectManager.getSearchHotel().getChildRoom();
		type(childRoom, s8);
		ScreensShot();
	}

	@When("user should enter search button")
	public void user_should_enter_search_button() throws IOException {
		WebElement submit = pageObjectManager.getSearchHotel().getSubmit();
		btnClick(submit);
		ScreensShot();
	}

	@When("user should click radio button")
	public void user_should_click_radio_button() {
		
		WebElement radio = pageObjectManager.getSelectHotel().getRadio();
		btnClick(radio);
		WebElement enterContinue = pageObjectManager.getSelectHotel().getEnterContinue();
		btnClick(enterContinue);
	}

	@When("user should payment")
	public void user_should_payment(io.cucumber.datatable.DataTable data) throws IOException, InterruptedException {


		List<Map<String, String>> emp = data.asMaps();
		String s9 = emp.get(0).get("firstName");
		WebElement fn = pageObjectManager.getBookHotel().getFn();
		type(fn, s9);
		String s10 = emp.get(0).get("lastName");
		WebElement ln = pageObjectManager.getBookHotel().getLn();
		type(ln, s10);
		String s11 = emp.get(0).get("billingAddress");
		WebElement ad = pageObjectManager.getBookHotel().getAd();
		type(ad, s11);
		String s12 = emp.get(0).get("creditCardNumber");
		WebElement crdNum = pageObjectManager.getBookHotel().getCrdNum();
		type(crdNum, s12);
		String s13 = emp.get(0).get("creditCardType");
		WebElement crdType = pageObjectManager.getBookHotel().getCrdType();
		type(crdType, s13);
		String s14 = emp.get(0).get("expiryMonth");
		WebElement expMonth = pageObjectManager.getBookHotel().getExpMonth();
		type(expMonth, s14);
		String s15 = emp.get(0).get("year");
		WebElement expYear = pageObjectManager.getBookHotel().getExpYear();
		type(expYear, s15);
		String s16 = emp.get(0).get("cvvNumber");
		WebElement ccvNum = pageObjectManager.getBookHotel().getCcvNum();
		type(ccvNum, s16);
		WebElement bookBtn = pageObjectManager.getBookHotel().getBookBtn();
		btnClick(bookBtn);
		ScreensShot();
		Thread.sleep(6000);
		
		WebElement orderid = pageObjectManager.getConfirmationPage().getOrderid();
		String attribute = orderid.getAttribute("value");
		WebElement booked = pageObjectManager.getConfirmationPage().getBooked();
		btnClick(booked);
		WebElement cancell = driver
				.findElement(By.xpath("(//input[@value='" + attribute + "']/parent::td/preceding-sibling::td)[1]"));
		cancell.click();
		WebElement cancel = pageObjectManager.getConfirmationPage().getCancel();
		btnClick(cancel);
		Alert a= driver.switchTo().alert();
		a.accept();
		ScreensShot();
	}

	/*
	 * @Then("user generate the ID number") public void
	 * user_generate_the_ID_number() throws IOException {
	 * driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); WebElement
	 * order= driver.findElement(By.id("order_no")); String txt=
	 * order.getAttribute("value"); System.out.println(txt); ScreensShot();
	 */
}

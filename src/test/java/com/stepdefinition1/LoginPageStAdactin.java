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

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginPageStAdactin extends LibGlobal {
	public WebDriver driver;
	LoginPage page;
	SearchHotel page1;

	@Given("user is on adactin page")
	public void user_is_on_adactin_page() {
		driver = getDriver();
		loadUrl("https://adactin.com/HotelApp/");
	}

	@When("user enters details")
	public void user_enters_details(io.cucumber.datatable.DataTable data) throws InterruptedException {
		page = new LoginPage();
		List<Map<String, String>> emp = data.asMaps();
		String S1 = emp.get(1).get("userName");
		WebElement name = page.getTxtUsername();
		type(name, S1);
		String S2 = emp.get(1).get("passWord");
		WebElement pass = page.getTxtPassWord();
		type(pass, S2);
		WebElement btnLogin = page.getBtnLogin();
		btnLogin.click();
	}

	@When("User should verify the message")
	public void user_should_verify_the_message() {
		System.out.println("verify message");
	}

	@When("user should search Hotels")
	public void user_should_search_Hotels(io.cucumber.datatable.DataTable data) throws IOException {
		page1 = new SearchHotel();
		List<Map<String, String>> emp = data.asMaps();
		String s3 = emp.get(0).get("location");
		WebElement loction = page1.getLoction();
		type(loction, s3);
		String s4 = emp.get(0).get("Hotels");
		WebElement hotels = page1.getHotels();
		type(hotels, s4);
		String s5 = emp.get(0).get("roomType");
		WebElement roomType = page1.getRoomType();
		type(roomType, s5);
		String s6 = emp.get(0).get("numberOfRooms");
		WebElement roomNO = page1.getRoomNO();
		type(roomNO, s6);
		String s7 = emp.get(0).get("adultsPerRoom");
		WebElement adultRoom = page1.getAdultRoom();
		type(adultRoom, s7);
		String s8 = emp.get(0).get("childrenPerRoom");
		WebElement childRoom = page1.getChildRoom();
		type(childRoom, s8);
		ScreensShot();
	}

	@When("user should enter search button")
	public void user_should_enter_search_button() throws IOException {
		WebElement submit = page1.getSubmit();
		btnClick(submit);
		ScreensShot();
	}

	@When("user should click radio button")
	public void user_should_click_radio_button() {
		SelectHotel page = new SelectHotel();
		WebElement radio = page.getRadio();
		btnClick(radio);
		WebElement enterContinue = page.getEnterContinue();
		btnClick(enterContinue);
	}

	@When("user should payment")
	public void user_should_payment(io.cucumber.datatable.DataTable data) throws IOException, InterruptedException {
		BookHotel page = new BookHotel();
		List<Map<String, String>> emp = data.asMaps();
		String s9 = emp.get(0).get("firstName");
		WebElement fn = page.getFn();
		type(fn, s9);
		String s10 = emp.get(0).get("lastName");
		WebElement ln = page.getLn();
		type(ln, s10);
		String s11 = emp.get(0).get("billingAddress");
		WebElement ad = page.getAd();
		type(ad, s11);
		String s12 = emp.get(0).get("creditCardNumber");
		WebElement crdNum = page.getCrdNum();
		type(crdNum, s12);
		String s13 = emp.get(0).get("creditCardType");
		WebElement crdType = page.getCrdType();
		type(crdType, s13);
		String s14 = emp.get(0).get("expiryMonth");
		WebElement expMonth = page.getExpMonth();
		type(expMonth, s14);
		String s15 = emp.get(0).get("year");
		WebElement expYear = page.getExpYear();
		type(expYear, s15);
		String s16 = emp.get(0).get("cvvNumber");
		WebElement ccvNum = page.getCcvNum();
		type(ccvNum, s16);
		WebElement bookBtn = page.getBookBtn();
		btnClick(bookBtn);
		Thread.sleep(6000);
		ConfirmationPage page1 = new ConfirmationPage();
		WebElement orderid = page1.getOrderid();
		String attribute = orderid.getAttribute("value");
		WebElement booked = page1.getBooked();
		btnClick(booked);
		WebElement cancell = driver
				.findElement(By.xpath("(//input[@value='" + attribute + "']/parent::td/preceding-sibling::td)[1]"));
		cancell.click();
		WebElement cancel = page1.getCancel();
		btnClick(cancel);
		Alert a= driver.switchTo().alert();
		a.accept();
	}

	/*
	 * @Then("user generate the ID number") public void
	 * user_generate_the_ID_number() throws IOException {
	 * driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); WebElement
	 * order= driver.findElement(By.id("order_no")); String txt=
	 * order.getAttribute("value"); System.out.println(txt); ScreensShot();
	 */
}

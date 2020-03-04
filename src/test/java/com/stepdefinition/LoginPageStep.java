package com.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginPageStep {
	static WebDriver driver;
	@Given("user is on adactin page")
	public void user_is_on_adactin_page() {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\ADMIN\\eclipse-jayasankar\\Cucumber\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		 driver.get("https://adactin.com/HotelApp/");
		 driver.manage().window().maximize();
	
	}

	@When("user enters {string} and {string}")
	public void user_enters_and(String s1, String s2) {
		WebElement txtUserName = driver.findElement(By.id("username"));
		txtUserName.sendKeys(s1);
		String name = txtUserName.getAttribute("value");

		WebElement txtPassword = driver.findElement(By.id("password"));
		txtPassword.sendKeys(s2);
		String pass = txtPassword.getAttribute("value");
		
	}

	@When("user should click the login button")
	public void user_should_click_the_login_button() {
		WebElement btnLogin = driver.findElement(By.id("login"));
		btnLogin.click();	

	}

	@When("user select the {string},{string},{string},{string},{string},{string}")
	public void user_select_the(String S3, String S4, String S5, String S6, String S7, String S8) {
		WebElement selectLoc = driver.findElement(By.id("location"));
		Select S = new Select(selectLoc); 
		S.selectByVisibleText(S3);
WebElement selectHotel = driver.findElement(By.id("hotels"));
Select S1 = new Select(selectHotel); 
S1.selectByVisibleText(S4);
WebElement selectRoomt = driver.findElement(By.id("room_type"));
Select S2 = new Select(selectRoomt); 
S2.selectByVisibleText(S5);
WebElement selectNos = driver.findElement(By.id("room_nos"));
selectNos.sendKeys(S6);
/*Select A = new Select(selectNos);
A.selectByVisibleText(S6);*/
WebElement selectAdroom = driver.findElement(By.id("adult_room"));
selectAdroom.sendKeys(S7);
/*Select B = new Select(selectAdroom); 
B.selectByVisibleText(S7);*/
WebElement selectChroom = driver.findElement(By.id("child_room"));
selectChroom.sendKeys(S8);
/*Select C = new Select(selectChroom); 
C.selectByVisibleText(S8);*/
	}

	@When("user should click the search button")
	public void user_should_click_the_search_button() throws InterruptedException {
		Thread.sleep(5000);
		WebElement btnSearch = driver.findElement(By.xpath("//input[@type='submit']"));
		btnSearch.click();
	}

	@When("user should click the radiobutton")
	public void user_should_click_the_radiobutton() {
		WebElement btnRadio = driver.findElement(By.id("radiobutton_0"));
		btnRadio.click();
}
	
	@When("user should click the continue button")
	public void user_should_click_the_continue_button() {
		WebElement btnContinue = driver.findElement(By.id("continue"));
		btnContinue.click();
	}

	@When("user enters {string},{string},{string}")
	public void user_enters(String S9, String S10, String S11) {
		WebElement txtFirst = driver.findElement(By.id("first_name"));
		txtFirst.sendKeys(S9);
		WebElement txtLast = driver.findElement(By.id("last_name"));
		txtLast.sendKeys(S10);
		WebElement txtAddress = driver.findElement(By.id("address"));
		txtAddress.sendKeys(S11);
		
	}

	@When("user enters {string}")
	public void user_enters(String S12) {
		WebElement txtCcn = driver.findElement(By.id("cc_num"));
		txtCcn.sendKeys(S12);
	}
	

	@When("user select the {string},{string},{string}")
	public void user_select_the(String S13, String S14, String S15) {
		WebElement ccType = driver.findElement(By.id("cc_type"));
		ccType.sendKeys(S13);
		WebElement expMonth = driver.findElement(By.id("cc_exp_month"));
		expMonth.sendKeys(S14);
		WebElement expYear = driver.findElement(By.id("cc_exp_year"));
		expYear.sendKeys(S15);
		
	}
	@When("user add {string}")
	public void user_add(String S16) {
		WebElement txtCvv = driver.findElement(By.id("cc_cvv"));
		txtCvv.sendKeys(S16);
	}

	@When("user should click the booknow button")
	public void user_should_click_the_booknow_button() {
		WebElement btnBook = driver.findElement(By.id("book_now"));
		btnBook.click();
	}

	@Then("user generate the Id number")
	public void user_generate_the_Id_number() throws InterruptedException {
		Thread.sleep(10000);
		WebElement ordNum = driver.findElement(By.id("order_no"));
		String orderNo = ordNum.getAttribute("value");
		System.out.println();
		System.out.println(orderNo);
		
	}

	
	  }

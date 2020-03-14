package com.stepdefinition1;

import org.base.LibGlobal;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends LibGlobal{
	
	@Before
	public void beforeScenario() {
		getDriver();
		loadUrl("https://adactin.com/HotelApp/");

	}
	@After
	public void afterScenario(Scenario Sc) {
boolean b = Sc.isFailed();
if(!b==true) {
		TakesScreenshot tk=(TakesScreenshot)driver;
	byte[] b1 = tk.getScreenshotAs(OutputType.BYTES);
	Sc.embed(b1, "images/png");
	
	}

	}
}

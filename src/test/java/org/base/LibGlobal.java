package org.base;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LibGlobal {
public  static WebDriver  driver;
public WebDriver getDriver() {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\eclipse-jayasankar\\Cucumber\\drivers\\chromedriver.exe");
driver = new ChromeDriver();
driver.manage().window().maximize();
return driver;

}
public void loadUrl(String url) {
driver.get(url);
	
}
	public void type(WebElement element, String name) {
element.sendKeys(name);
	}
	public void btnClick(WebElement element) {
element.click();
	}
	public void SelectTextByIndex(WebElement element, int index) {
		new Select(element).selectByIndex(index);
	}
	public void SelectTextByAttribute(WebElement element, String name) {
		new Select(element).selectByValue(name);

	}
	public String getTextByAttribute(WebElement element) {
String attribute = element.getAttribute("value");
return attribute;
	}
	public String getTitle() {
		return driver.getTitle();

	}
public String generateRandomDate() {
	return new SimpleDateFormat("EEE_MM_dd_hhmmss").format(new Date());

}	
public void ScreensShot() throws IOException {
File Source =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
File destLoc = new File ("C:\\Users\\ADMIN\\eclipse-jayasankar\\Cucumber\\screenshot"+ generateRandomDate() +" .png");
FileUtils.copyFile(Source, destLoc);



}	


}

package org.pages;

import java.util.List;

import org.base.LibGlobal;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends LibGlobal{

	public LoginPage() {
		
		PageFactory.initElements(driver, this);
	}		
		
	@FindBy(id="username")
	private WebElement txtUsername;
	@FindBy(id="password")	
	private WebElement txtPassWord;
	@FindBy(id="login")
	private WebElement BtnLogin;
	public WebElement getTxtUsername() {
		return txtUsername;
	}
	public WebElement getTxtPassWord() {
		return txtPassWord;
	}
	public WebElement getBtnLogin() {
		return  BtnLogin;
	}

	
		
		
		
		

}

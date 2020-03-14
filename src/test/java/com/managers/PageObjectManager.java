package com.managers;

import org.pages.BookHotel;
import org.pages.ConfirmationPage;
import org.pages.LoginPage;
import org.pages.SearchHotel;
import org.pages.SelectHotel;

public class PageObjectManager {
	private LoginPage loginPage;
	private SearchHotel searchHotel;
	private SelectHotel selectHotel;
	private BookHotel bookHotel;
	private ConfirmationPage confirmationPage;
	public LoginPage getLoginPage() {
		return(loginPage==null)?loginPage=new LoginPage():loginPage;
	}
	public SearchHotel getSearchHotel() {
		return (searchHotel==null)?searchHotel=new SearchHotel():searchHotel;
	}
	public SelectHotel getSelectHotel() {
		return (selectHotel==null)?selectHotel=new SelectHotel():selectHotel;
	}
	public BookHotel getBookHotel() {
		return (bookHotel==null)?bookHotel=new BookHotel():bookHotel;
	}
	public ConfirmationPage getConfirmationPage() {
		return (confirmationPage==null)?confirmationPage=new ConfirmationPage():confirmationPage;
	}
	
	

}

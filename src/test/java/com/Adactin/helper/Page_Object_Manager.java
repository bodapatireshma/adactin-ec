package com.Adactin.helper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.Adactin.pom.Book_A_Hotel;
import com.Adactin.pom.Booking_Confirmation;
import com.Adactin.pom.Login_Page;
import com.Adactin.pom.Search_Hotel;
import com.Adactin.pom.Select_Hotel;

public class Page_Object_Manager {

	public WebDriver driver;       //---null
	
	private Login_Page login;          //private classname obj name
	private Search_Hotel search;
	private Select_Hotel select;
	private Book_A_Hotel book;
	private Booking_Confirmation confirm;
	
	public Page_Object_Manager(WebDriver driver2) {
		this .driver = driver2;
		PageFactory.initElements(driver2, this);
	}
	public Login_Page getInstanceLogin() {
		login = new Login_Page(driver);
		return login;
	}
	public Search_Hotel getInstanceSearch() {
		search = new Search_Hotel(driver);
		return search;
	}
	public Select_Hotel getInstanceSelect() {
		select = new Select_Hotel(driver);
		return select;
	}
	public Book_A_Hotel getInstanceBookHotel() {
		book = new Book_A_Hotel(driver);
		return book;
	}
	public Booking_Confirmation getInstanceConfirmBook() {
		confirm = new Booking_Confirmation(driver);
		return confirm;
	}
	
}

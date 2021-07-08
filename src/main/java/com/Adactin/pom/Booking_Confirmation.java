package com.Adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Booking_Confirmation {

	public WebDriver driver;
	
	@FindBy(xpath = "//input[@id='logout']")
	private WebElement logout;

	public Booking_Confirmation(WebDriver condriver) {
		this.driver = condriver;
		PageFactory.initElements(condriver, this);
	}

	public WebElement getLogout() {
		return logout;
	}
}
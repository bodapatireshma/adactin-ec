package com.Adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Book_A_Hotel {

	public WebDriver driver;
	
	@FindBy(xpath = "//input[@id='first_name']")
	private WebElement firstName;

	@FindBy(xpath = "//input[@id='last_name']")
	private WebElement lastName;
	
	@FindBy(xpath = "//textarea[@id='address']")
	private WebElement billingAddress;
	
	@FindBy(xpath = "//input[@id='cc_num']")
	private WebElement creditCardNo;
	
	@FindBy(xpath = "//select[@id='cc_type']")
	private WebElement creditCardType;
	
	@FindBy(xpath = "//select[@id='cc_exp_month']")
	private WebElement expiryMonth;
	
	@FindBy(xpath = "//select[@id='cc_exp_year']")
	private WebElement expiryYear;
	
	@FindBy(xpath = "//input[@id='cc_cvv']")
	private WebElement cvvNo;
	
	@FindBy(xpath = "//input[@id='book_now']")
	private WebElement bookNowBtn;

	public Book_A_Hotel(WebDriver bookdriver) {
		this.driver = bookdriver;
		PageFactory.initElements(bookdriver, this);
	}
	public WebElement getFirstName() {
		return firstName;
	}
	public WebElement getLastName() {
		return lastName;
	}
	public WebElement getBillingAddress() {
		return billingAddress;
	}
	public WebElement getCreditCardNo() {
		return creditCardNo;
	}
	public WebElement getCreditCardType() {
		return creditCardType;
	}
	public WebElement getExpiryMonth() {
		return expiryMonth;
	}
	public WebElement getExpiryYear() {
		return expiryYear;
	}
	public WebElement getCvvNo() {
		return cvvNo;
	}
	public WebElement getBookNowBtn() {
		return bookNowBtn;
	}
}
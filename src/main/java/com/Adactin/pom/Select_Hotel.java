package com.Adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Select_Hotel {

	public WebDriver driver;
	
	@FindBy(xpath = "//input[@id='radiobutton_0']")
	private WebElement selectRadioBtn;
	
	@FindBy(xpath = "//input[@id='continue']")
	private WebElement continueBtn;
	
	public Select_Hotel(WebDriver seldriver) {
		this.driver = seldriver;
		PageFactory.initElements(seldriver, this);
	}
	public WebElement getSelectRadioBtn() {
		return selectRadioBtn;
	}
	public WebElement getContinueBtn() {
		return continueBtn;
	}
}
package com.Adactin.stepdefinition;

import org.openqa.selenium.WebDriver;
import com.Adactin.Baseclass.Base_Class;
import com.Adactin.helper.File_Reader_Manager;
import com.Adactin.helper.Page_Object_Manager;
import com.Adactin.pom.Book_A_Hotel;
import com.Adactin.pom.Booking_Confirmation;
import com.Adactin.pom.Login_Page;
import com.Adactin.pom.Search_Hotel;
import com.Adactin.pom.Select_Hotel;
import com.Adactin.runner.Test_Runner;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Step_Definition extends Base_Class {

	public static WebDriver driver = Test_Runner.driver;
//page 1	
	public static Page_Object_Manager pom = new Page_Object_Manager(driver);
	 
	@Given("^user Launch The Application$")
	public void user_Launch_The_Application() throws Throwable {
		String url = File_Reader_Manager.getInstance().getInstanceCR().getUrl();
		getUrl(url);
	}
	@When("^user Enter The \"([^\"]*)\" In Username Field$")
	public void user_Enter_The_Username_In_Username_Field(String username) {
		sendValues(pom.getInstanceLogin().getUsername(), username);
	}

	@When("^user Enter The \"([^\"]*)\" In Password Field$")
	public void user_Enter_The_Password_In_Password_Field(String password) {
		sendValues(pom.getInstanceLogin().getPassword(), password);
	}
	@Then("^user Click On The Login Button And It Navigates To The Search Hotel$")
	public void user_Click_On_The_Login_Button_And_It_Navigates_To_The_Search_Hotel() {
		clickOnElement(pom.getInstanceLogin().getLogin());
	}
//page 2
	
	@When("^user Select The Location$")
	public void user_Select_The_Location() {
		selectValue(pom.getInstanceSearch().getLocation(), "Sydney");
	}
	@When("^user Select The Hotel$")
	public void user_Select_The_Hotel() {
		selectValue(pom.getInstanceSearch().getHotels(), "Hotel Creek");
	}
	@When("^user Select The Room Type$")
	public void user_Select_The_Room_Type() {
		selectValue(pom.getInstanceSearch().getRoomType(), "Standard");
	}
	@When("^user Select The Check In Date$")
	public void user_Select_The_Check_In_Date() {
	}
	@When("^user Select The Check Out Date$")
	public void user_Select_The_Check_Out_Date() {
	}
	@When("^user Select Number Of Adults$")
	public void user_Select_Number_Of_Adults() {
		selectValue(pom.getInstanceSearch().getAdultsPerRoom(), "1");
	}
	@When("^user Select Number Of Children$")
	public void user_Select_Number_Of_Children() {
		selectValue(pom.getInstanceSearch().getChildrenPerRoom(), "0");
	}
	@Then("^user Click On The Search Button And It Navigates To Select Hotel$")
	public void user_Click_On_The_Search_Button_And_It_Navigates_To_Select_Hotel() {
		clickOnElement(pom.getInstanceSearch().getSearchBtn());
	}
	
//page 3
	
	@When("^user Select The Radio Button To Select Hotel$")
	public void user_Select_The_Radio_Button_To_Select_Hotel() {
		clickOnElement(pom.getInstanceSelect().getSelectRadioBtn());
	}
	@Then("^user Click On The Continue Button And It Navigates To Book A Hotel$")
	public void user_Click_On_The_Continue_Button_And_It_Navigates_To_Book_A_Hotel() {
		clickOnElement(pom.getInstanceSelect().getContinueBtn());
	}
	
//page 4
	
	@When("^user Select The First Name$")
	public void user_Select_The_First_Name() {
		sendValues(pom.getInstanceBookHotel().getFirstName(), "Reshma");
	}
	@When("^user Select The Last Name$")
	public void user_Select_The_Last_Name() {
		sendValues(pom.getInstanceBookHotel().getLastName(), "Bodapati");
	}
	@When("^user Select The Billing Address$")
	public void user_Select_The_Billing_Address() {
		sendValues(pom.getInstanceBookHotel().getBillingAddress(), "Chennai");
	}
	@When("^user Select The Creditcard Number$")
	public void user_Select_The_Creditcard_Number() throws Throwable {
		String ccNum = File_Reader_Manager.getInstance().getInstanceCR().getCreditcardNumber();
		sendValues(pom.getInstanceBookHotel().getCreditCardNo(), ccNum);
	}
	@When("^user Select The Creditcard Type$")
	public void user_Select_The_Creditcard_Type() throws Throwable {
		String ccType = File_Reader_Manager.getInstance().getInstanceCR().getCreditcardType();
		selectValue(pom.getInstanceBookHotel().getCreditCardType(), ccType);
	}
	@When("^user Select The Expiry Month$")
	public void user_Select_The_Expiry_Month() throws Throwable {
		String expMonth = File_Reader_Manager.getInstance().getInstanceCR().getExpiryMonth();
		selectValue(pom.getInstanceBookHotel().getExpiryMonth(), expMonth);
	}
	@When("^user Select The Expiry Year$")
	public void user_Select_The_Expiry_Year() throws Throwable {
		String expYear = File_Reader_Manager.getInstance().getInstanceCR().getExpiryYear();
		sendValues(pom.getInstanceBookHotel().getExpiryYear(), expYear);
	}
	@When("^user Select The Cvv Number$")
	public void user_Select_The_Cvv_Number() throws Throwable {
		String cvvNum = File_Reader_Manager.getInstance().getInstanceCR().getCvvNumber();
		sendValues(pom.getInstanceBookHotel().getCvvNo(), cvvNum);
	}
	@Then("^user Click On The Book Now Button And It Navigates To Booking Confirmation$")
	public void user_Click_On_The_Book_Now_Button_And_It_Navigates_To_Booking_Confirmation() {
		clickOnElement(pom.getInstanceBookHotel().getBookNowBtn());
		implicitWait();
	}
	
//page 5
	public static Booking_Confirmation con = new Booking_Confirmation(driver);
	
	@Then("^user Click On The Logout Button$")
	public void user_Click_On_The_Logout_Button() {
		clickOnElement(pom.getInstanceConfirmBook().getLogout());
	}	
}
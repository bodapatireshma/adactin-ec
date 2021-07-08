package com.Adactin.runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.Adactin.Baseclass.Base_Class;
import com.Adactin.helper.File_Reader_Manager;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src//test//java//com//Adactin//feature",
glue = "com.Adactin.stepdefinition",
monochrome = true,
dryRun = false,
strict = true,
tags=("@SmokeTest,@SanityTest"),
plugin = {"html:Report/HTML_Report",
			"pretty",
			"json:Report/CucumberJSON_Report.json",
			"com.cucumber.listener.ExtentCucumberFormatter:Reports/ExtentReport.html"})

public class Test_Runner {
	
	public static WebDriver driver;        // null
	
	@BeforeClass
	public static void set_Up() throws Throwable {
		
		String browser = File_Reader_Manager.getInstance().getInstanceCR().getBrowser();
		driver = Base_Class.browserLaunch(browser);
	}
	@AfterClass
	public static void tear_Down() {
//		driver.close();
	}
}
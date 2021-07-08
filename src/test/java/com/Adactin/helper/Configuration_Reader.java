package com.Adactin.helper;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class Configuration_Reader {
	
	public static Properties p;     //---empty
	
	public Configuration_Reader() throws Throwable {
		File f = new File("C:\\Users\\user\\eclipse-workspace\\Adactin\\src\\test\\java\\com\\Adactin\\properties\\configuration.properties");
		
		FileInputStream fis = new FileInputStream(f);
		
		p=new Properties();
		
		p.load(fis);
	}
	public String getBrowser() {
		String browser = p.getProperty("browser");
		return browser;
	}
	public String getUrl() {
		String url = p.getProperty("url");
		return url;
	}
	public String getCreditcardNumber() {
		String ccNum = p.getProperty("creditcardnumber");
		return ccNum;
	}
	public String getCreditcardType() {
		String ccType = p.getProperty("creditcardtype");
		return ccType;
	}
	public String getExpiryMonth() {
		String expMonth = p.getProperty("expirymonth");
		return expMonth;
	}
	public String getExpiryYear() {
		String expYear = p.getProperty("expiryyear");
		return expYear;
	}
	public String getCvvNumber() {
		String cvvNum = p.getProperty("cvvnumber");
		return cvvNum;
	}
}

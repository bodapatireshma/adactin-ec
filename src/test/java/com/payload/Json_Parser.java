package com.payload;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.junit.Assert;
import org.junit.Test;

public class Json_Parser {

//	public static void main(String[] args) throws IOException, ParseException {
//		
//		File f = new File(".\\src\\test\\java\\com\\payload\\Payload.json");
//		
//		FileReader fis = new FileReader(f);
//		
//		JSONParser js = new JSONParser();
//		
//		Object parse = js.parse(fis);
//		
//		JSONObject obj = (JSONObject) parse;             //narrow type casting
//		
//		Object object = obj.get("name");
//		
//		String name = object.toString();
//		
//		System.out.println("Name : "+name);
//	}
	
	@Test
	public void json_Parser() throws IOException, ParseException {
		
		File f = new File(".\\src\\test\\java\\com\\payload\\Payload.json");
		
		FileReader fis = new FileReader(f);
		
		JSONParser js = new JSONParser();
		
		Object parse = js.parse(fis);
		
		JSONObject obj = (JSONObject) parse;             //narrow type casting
		
		Object object = obj.get("name");
		
		String name = object.toString();
		
		System.out.println("Name : "+name);
		
		Assert.assertEquals("Smith", name);
		
		System.out.println("Assertion passed");
	}
	
	
}

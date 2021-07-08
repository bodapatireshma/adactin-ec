package com.api;

import org.junit.Assert;
import org.junit.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class api {
	
	@Test
	public void get_List() {
		
		RestAssured.baseURI = "https://reqres.in/";
		RequestSpecification request = RestAssured.given();
		Response response = request.get("api/users?page=2");
		String asString = response.asString();
		System.out.println(asString);
		int statusCode = response.getStatusCode();
		System.out.println("Status Code:" +statusCode );
		Assert.assertEquals(200, statusCode);
		System.out.println("Assert Success");
		System.out.println();
	}
	@Test
	public void get_Singleuser() {
		
		RestAssured.baseURI = "https://reqres.in/";
		RequestSpecification request1 = RestAssured.given();
		Response response1 = request1.get("api/users/2");
		String asString1 = response1.asString();
		System.out.println(asString1);
		int statusCode1 = response1.getStatusCode();
		System.out.println("Status Code:" +statusCode1);
		Assert.assertEquals(200, statusCode1);
		System.out.println("Assert 1 Success");
		System.out.println();
	}
	@Test
	public void get_Singleusernotfound() {
		
		RestAssured.baseURI = "https://reqres.in/";
		RequestSpecification request2 = RestAssured.given();
		Response response2 = request2.get("api/users/23");
		String asString2 = response2.asString();
		System.out.println(asString2);
		int statusCode2 = response2.statusCode();
		System.out.println("Status Code:" +statusCode2);
		Assert.assertEquals(404, statusCode2);
		System.out.println("Assert 2 Success");
		System.out.println();
	}
	@Test
	public void get_Listresource() {

		RestAssured.baseURI = "https://reqres.in/";
		RequestSpecification request3 = RestAssured.given();
		Response response3 = request3.get("api/unknown");
		String asString3 = response3.asString();
		System.out.println(asString3);
		int statusCode3 = response3.getStatusCode();
		System.out.println("Status Code:" +statusCode3);
		Assert.assertEquals(200, statusCode3);
		System.out.println("Assert 3 Success");
		System.out.println();
	}
	@Test
	public void get_Singleresource() {

		RestAssured.baseURI = "https://reqres.in/";
		RequestSpecification request4 = RestAssured.given();
		Response response4 = request4.get("api/unknown/2");
		String asString4 = response4.asString();
		System.out.println(asString4);
		int statusCode4 = response4.getStatusCode();
		System.out.println("Status Code:" +statusCode4);
		Assert.assertEquals(200, statusCode4);
		System.out.println("Assert 4 Success");
		System.out.println();
	}
	@Test
	public void get_Singleresourcenotfound() {

		RestAssured.baseURI = "https://reqres.in/";
		RequestSpecification request5 = RestAssured.given();
		Response response5 = request5.get("api/unknown/23");
		String asString5 = response5.asString();
		System.out.println(asString5);
		int statusCode5 = response5.getStatusCode();
		System.out.println("Status Code:" +statusCode5);
		Assert.assertEquals(404, statusCode5);
		System.out.println("Assert 5 Success");
		System.out.println();
	}
	@Test
	public void get_Delayedresponse() {

		RestAssured.baseURI = "https://reqres.in/";
		RequestSpecification request6 = RestAssured.given();
		Response response6 = request6.get("api/users?delay=3");
		String asString6 = response6.asString();
		System.out.println(asString6);
		int statusCode6 = response6.getStatusCode();
		System.out.println("Status Code:" +statusCode6);
		Assert.assertEquals(200, statusCode6);
		System.out.println("Assert 6 Success");
		System.out.println();
	}
}
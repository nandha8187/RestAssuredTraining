package com.ems.non_bdd;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class GetAllEmployees {

      @Test(enabled=false)
	  public void getallEmployees() {
		
		  RestAssured.baseURI="http://localhost:3000/";
		  
		  RequestSpecification requestSpecification = RestAssured.given();
		  
		  Response response = requestSpecification.request(Method.GET,"employees");
		  
		  System.out.println(response.asPrettyString());
		  
		  System.out.println(response.getStatusLine());
		  
		  
		  
	}
	
      @Test
	  public void getaSingleEmployees() {
		
		  RestAssured.baseURI="http://localhost:3000/";
		  
		  RequestSpecification requestSpecification = RestAssured.given();
		  
		  Response response = requestSpecification.request(Method.GET,"employees/7");
		  
		  System.out.println(response.asPrettyString());
		  
		  System.out.println(response.getStatusLine());
		  
		  
		  
	}
	
	
}

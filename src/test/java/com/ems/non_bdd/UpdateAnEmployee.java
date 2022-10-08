package com.ems.non_bdd;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class UpdateAnEmployee {

     @Test
   	 public void updateAnEmployee() {
		 

		  RestAssured.baseURI="http://localhost:3000/";
		  
		  RequestSpecification requestSpecification = 
					RestAssured.given()
					.header("Content-Type","application/json")
					.body("{\r\n"
					  + "   \"first_name\": \"virat\",\r\n"
					  + "   \"last_name\": \"KOHLI\",\r\n"
					  + "   \"email\": \"KOHLI65@gmail.com\"\r\n"
					  + "\r\n"
					  + "}");

		  		  
		  Response response = requestSpecification.request(Method.PUT,"employees/12");
			
		 System.out.println(response.asPrettyString());
		 
	}
	
	
	
	
}

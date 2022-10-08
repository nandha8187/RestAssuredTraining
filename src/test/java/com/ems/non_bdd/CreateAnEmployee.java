package com.ems.non_bdd;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class CreateAnEmployee {


    @Test
	public void createAnEmployee() {


		RestAssured.baseURI="http://localhost:3000/";

		RequestSpecification requestSpecification = 
				RestAssured.given()
				.header("Content-Type","application/json")
				.body("{\r\n"
				  + "   \"first_name\": \"kamelash\",\r\n"
				  + "   \"last_name\": \"nagar\",\r\n"
				  + "   \"email\": \"kamlesh65@gmail.com\"\r\n"
				  + "\r\n"
				  + "}");

		Response response = requestSpecification.request(Method.POST,"employees");

        System.out.println(response.getStatusLine());
        
        System.out.println(response.asPrettyString());




	}


}

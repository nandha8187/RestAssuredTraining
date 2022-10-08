package com.ems.bdd_style;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

public class CreateAnEmployeeBDD {

	@Test
	public void createAnEmployeeBDD() {
		
      given()
       .baseUri("http://localhost:3000")
       .header("Content-Type","application/json")
       .body("{\r\n"
				  + "   \"first_name\": \"King\",\r\n"
				  + "   \"last_name\": \"Kohli\",\r\n"
				  + "   \"email\": \"King65@gmail.com\"\r\n"
				  + "\r\n"
				  + "}")
       .when()
           .post("/employees")
       .prettyPrint();
		
		
	
	}

	
}

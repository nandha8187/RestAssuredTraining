package com.ems.bdd_style;

import static io.restassured.RestAssured.given;

import java.io.File;

import org.testng.annotations.Test;

public class CreateEmployeeFromJson {

	
	File jsonFile = new File("postData.json");
	
	@Test
	public void createEmployeeFromJson() {
	
		 given()
		 .baseUri("http://localhost:3000")
         .header("Content-Type","application/json")
          .body(jsonFile)
           .when()
           .post("/employees")
           .prettyPrint();
		
	}
	
	
	
	
	
	
	
	
	
}

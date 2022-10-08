package com.ems.bdd_style;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class GetAllEmployees {

	
	@Test
	public void getAllEmployees() {
		
		  given()
              .baseUri("http://localhost:3000")
          .when() 
             .get("/employees")
          .prettyPrint(); 
		
		
	}
	
	
	
	
	
}

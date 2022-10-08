package com.ems.bdd_style;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

public class DeleteAnEmployee {

	@Test
	public void deleteAnEmployee() {
	
		given()
		 .baseUri("http://localhost:3000")
	     .when()
         .delete("/employees/5")
         .prettyPrint();
	
	}
	
	
	
}

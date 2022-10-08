package com.ems.extra_concepts;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
public class Serialization {

	@Test
	public void serilization() {
	
		Map<String,Object> jsonBody = new HashMap<String,Object>();
		
		List<String> skills = new ArrayList<>();
		
		skills.add("java");
		skills.add("selenium");
		
		jsonBody.put("first_name", "Geetha");
		jsonBody.put("last_name", "sundhara Moorthi");
		jsonBody.put("email","geetha14@gmail.com");
		
		jsonBody.put("skills",skills);
		
		System.out.println(jsonBody);
		
	    
		given()
		  .baseUri("http://localhost:3000")
		  .header("Content-Type","application/json")
		  .body(jsonBody)
		  .log()
		  .all()
		  .when()
		  .post("/employees")
		  .then()
		  .log()
		  .all();
		
		
	}
	
	
}

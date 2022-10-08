package com.ems.non_bdd;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class DeleteAnEmployee {

    @Test
	public void deleteAnEmployee() {
							
	RestAssured.baseURI="http://localhost:3000/";

	RequestSpecification requestSpecification = RestAssured.given();

	Response response = requestSpecification.request(Method.DELETE,"employees/10");

    System.out.println(response.asPrettyString());
	
	
	}








}

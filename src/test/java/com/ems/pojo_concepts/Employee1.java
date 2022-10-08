package com.ems.pojo_concepts;

import java.util.Arrays;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Employee1 {

	public static void main(String[] args) throws JsonProcessingException {
		// TODO Auto-generated method stub


		Employee employee1 = new Employee();

		employee1.setFirstname("Thiyagu");
		employee1.setLastname("rajan");
		employee1.setEmail("thiyagu@gmail.com");
		employee1.setSkills(Arrays.asList("java","selenium"));

		System.out.println(employee1.getFirstname());
		System.out.println(employee1.getLastname());
		System.out.println(employee1.getEmail());
		System.out.println(employee1.getSkills());

		ObjectMapper mapper = new ObjectMapper();

		String employeeJson = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(employee1);

		System.out.println(employeeJson);
	}

}

package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Day_2_Problem_1 
{
	@Value("${name}")
	private String StudentName;
	
	@GetMapping("day_2_problem_1")
	public String getName()
	{
		return StudentName;
	}
}
package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Day_1_Problem_2 
{
	@Value("${var}")
	private String StudentName;
	
	@GetMapping("day_1_problem_2")
	public String getName()
	{
		return "Welcome "+StudentName+"!";
	}
}

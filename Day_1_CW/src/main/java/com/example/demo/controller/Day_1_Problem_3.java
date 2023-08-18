package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Day_1_Problem_3 
{
	@Value("${color}")
	private String yourFavColor;
	
	@GetMapping("day_1_problem_3")
	public String getMyFav()
	{
		return "My favorite color is "+yourFavColor;
	}
}

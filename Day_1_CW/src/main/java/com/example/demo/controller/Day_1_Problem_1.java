package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class Day_1_Problem_1
{
	@GetMapping("day_1_problem_1")
	public String display()
	{
		return "Welcome String Boot";
	}
}

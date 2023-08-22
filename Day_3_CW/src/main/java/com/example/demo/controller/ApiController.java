package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Employee;
import com.example.demo.service.ApiService;

@RestController
public class ApiController {
	@Autowired
	ApiService a;
	
	@PostMapping("AddEmp")
	public Employee add(@RequestBody Employee ss)
	{
		return a.saveinfo(ss);
	}
	
	@GetMapping("ShowDetails")
	public List<Employee> show()
	{
		return a.showinfo();
	}
	
	@GetMapping("ShowByID/{id}")
    public  Optional<Employee>  getmyid(@PathVariable int id)
    {
    	return a.getid(id);
    }

}

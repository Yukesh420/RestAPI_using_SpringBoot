package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Student;
import com.example.demo.service.ApiService;

@RestController
public class ApiController
{
	@Autowired
	ApiService sser;
	
    @PostMapping("AddStudent")
    public Student add(@RequestBody Student ss)
    {
    	return sser.saveinfo(ss);
    }
    
    @GetMapping("ShowDetails")
    public List<Student> show()
    {
    	return sser.showinfo();
    }
    
    @PutMapping("UpdateDetail")
    public Student modify(@RequestBody Student ss)
    {
    	return sser.changeinfo(ss);
    }
    @DeleteMapping("DeleteDetail")
    public String delete(@RequestBody Student ss)
    {
    	sser.deleteinfo(ss);
    	return "Deleted Successfully";
    }
    
    @GetMapping("ShowByID/{id}")
    public  Optional<Student>  getmyid(@PathVariable int id)
    {
    	return sser.getid(id);
    }
    
    @DeleteMapping("delid/{id}")
    public  void deletemyid(@PathVariable int id)
    {
    	sser.deleteid(id);
    }
    
    @PutMapping("UpdateById/{id}")
    public String modifybyId(@PathVariable int id,@RequestBody Student ss)
    {
    	return sser.updateInfobyId(id,ss);
    }
}

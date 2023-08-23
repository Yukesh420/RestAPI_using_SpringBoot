package com.example.demo.Controller;

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

import com.example.demo.Model.E_Book_Model;
import com.example.demo.Service.E_Book_Service;

@RestController
public class E_BookContoller {
	
	@Autowired
	E_Book_Service sser;
	
    @PostMapping("AddDetail")
    public E_Book_Model add(@RequestBody E_Book_Model ss)
    {
    	return sser.saveinfo(ss);
    }
    @PostMapping("AddMultipleDetails")
    public List<E_Book_Model> addndetails(@RequestBody List <E_Book_Model> ss)
	{
		return sser.savedetails(ss);
	}
    @GetMapping("ShowDetails")
    public List<E_Book_Model> show()
    {
    	return sser.showinfo();
    }
    
    @PutMapping("UpdateDetail")
    public E_Book_Model modify(@RequestBody E_Book_Model ss)
    {
    	return sser.changeinfo(ss);
    }
    @DeleteMapping("DeleteDetail")
    public String delete(@RequestBody E_Book_Model ss)
    {
    	sser.deleteinfo(ss);
    	return "Deleted Successfully";
    }
    
    @GetMapping("ShowByID/{id}")
    public  Optional<E_Book_Model>  getmyid(@PathVariable int id)
    {
    	return sser.getid(id);
    }
    
    @DeleteMapping("DelById/{id}")
    public  String deletemyid(@PathVariable int id)
    {
    	return sser.deleteid(id);
    	
    }
    
    @PutMapping("UpdateById/{id}")
    public String modifybyId(@PathVariable int id,@RequestBody E_Book_Model ss)
    {
    	return sser.updateInfobyId(id,ss);
    }

}

package com.example.demo.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.E_Book_Model;
import com.example.demo.Repository.E_BookRepo;

@Service
public class E_Book_Service 
{
     @Autowired
     E_BookRepo sr;
     
     public E_Book_Model saveinfo(E_Book_Model ss)
     {
    	 return sr.save(ss);
     }
     
     public List<E_Book_Model> showinfo()
     {
    	 return sr.findAll();
     }
     public List<E_Book_Model> savedetails(List<E_Book_Model> ss)
 	{
 		return (List<E_Book_Model>)sr.saveAll(ss);
 	}
     public E_Book_Model changeinfo(E_Book_Model ss)
 	{
 		return sr.saveAndFlush(ss);
 	}
     
     public void deleteinfo(E_Book_Model ss)
 	{
 		sr.delete(ss);
 	}
 	
 	public Optional<E_Book_Model> getid(int id)
 	{
 		return sr.findById(id);
 	}
 	
 	public String deleteid(int id)
 	{
 		sr.deleteById(id);
 		return "Deleted Successfully";
 	}
 	
 	public String updateInfobyId(int id,E_Book_Model ss)
 	{
 		sr.saveAndFlush(ss);
 		if(sr.existsById(id))
 		{
 			return "Updated";
 		}
 		else
 		{
 			return "Enter Valid Id";
 		}
 	}
     
}

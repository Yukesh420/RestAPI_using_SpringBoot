package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Book;
import com.example.demo.repository.BookRepo;

@Service
public class ApiService {
      
	@Autowired
	BookRepo sr;
	
	public Book saveinfo(Book ss)
	{
		return sr.save(ss);
	}
	
	public List<Book> showinfo()
	{
		return sr.findAll();
	}
	
	public Book changeinfo(Book ss)
	{
		return sr.saveAndFlush(ss);
	}
	
	public void deleteinfo(Book ss)
	{
		sr.delete(ss);
	}
	
	public Optional<Book> getid(int id)
	{
		return sr.findById(id);
	}
	
	public void deleteid(int id)
	{
		sr.deleteById(id);
	}
	
	public String updateInfobyId(int id,Book ss)
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

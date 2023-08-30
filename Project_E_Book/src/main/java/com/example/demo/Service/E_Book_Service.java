package com.example.demo.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
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
 	
 	public List<E_Book_Model> SortInfo(String bname)
 	{
 		return sr.findAll(Sort.by(Sort.DEFAULT_DIRECTION,bname));
 	}
 	
 	public List<E_Book_Model> GetByPage(int pgno,int pgsize)
	{
		Page<E_Book_Model> p = sr.findAll(PageRequest.of(pgno, pgsize));
		return p.getContent();
	}
 	
 	public List<E_Book_Model> SortAndPage(String name,int pgno,int pagesize)
	{
		Sort sort = Sort.by(name).ascending();
		Page<E_Book_Model> p = sr.findAll(PageRequest.of(pgno,pagesize, sort));
		return p.getContent();
	}
 	
 	 public List<E_Book_Model> getbookId(int id)
 	 {
 		return sr.getinfobookId(id);
 	 }
     
     public List<E_Book_Model> getCategory(String cat)
  	 {
  		return sr.getinfoCategory(cat);
  	 }
     
     public List<E_Book_Model> getNameAndAuthor(String name,String author)
     {
    		return sr.getinfoNameandAuthor(name,author);
     }
     
     public int DeleteByQuery(int id)
     {
    	 return sr.deleteBookById(id);
     }
     
     public int UpdateByQuery(int newid,int oldid)
     {
    	 return sr.updateBookById(newid,oldid);
     }
     
}

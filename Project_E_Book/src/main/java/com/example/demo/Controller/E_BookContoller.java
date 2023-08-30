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
	
	//Add Details
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
    
    //Show Details
    @GetMapping("ShowDetails")
    public List<E_Book_Model> show()
    {
    	return sser.showinfo();
    }
    
    //Update Details
    @PutMapping("UpdateDetail")
    public E_Book_Model modify(@RequestBody E_Book_Model ss)
    {
    	return sser.changeinfo(ss);
    }
    
    //Delete Detail
    @DeleteMapping("DeleteDetail")
    public String delete(@RequestBody E_Book_Model ss)
    {
    	sser.deleteinfo(ss);
    	return "Deleted Successfully";
    }
    
    //Operations with Id
    @GetMapping("ShowByID/{id}")
    public  Optional<E_Book_Model>  getmyid(@PathVariable int id)
    {
    	return sser.getid(id);
    }
    
    @DeleteMapping("DeleteById/{id}")
    public  String deletemyid(@PathVariable int id)
    {
    	return sser.deleteid(id);
    }
    
    @PutMapping("UpdateById/{id}")
    public String modifybyId(@PathVariable int id,@RequestBody E_Book_Model ss)
    {
    	return sser.updateInfobyId(id,ss);
    }
    
    //Sorting by Column Name
    @GetMapping("Sort/{str}")
    public List<E_Book_Model> GetSortInfo(@PathVariable String str)
    {
    	return sser.SortInfo(str);
    }
    
    //Paging 
    @GetMapping("Paging/{pgno}/{pagesize}")
    public List<E_Book_Model> showpageinfo(@PathVariable int pgno,@PathVariable int pagesize)
    {
    	return sser.GetByPage(pgno, pagesize);
    }
    
    //Sorting And Paging
    @GetMapping("SortAndPage/{pageno}/{pagesize}/{str}")
    public List<E_Book_Model> pageandsort(@PathVariable int pageno,@PathVariable int pagesize,@PathVariable String str)
    {
    	return sser.SortAndPage(str, pageno, pagesize);
    }
    
    //Select by Query
    @GetMapping("bookId/{id}")
 	public List<E_Book_Model> displayBookID(@PathVariable int id)
 	{
 		return sser.getbookId(id);
 	}
    
    @GetMapping("/category/{cat}")
 	public List<E_Book_Model> displayCategory(@PathVariable String cat)
 	{
 		return sser.getCategory(cat);
 	}
    
    @GetMapping("/bookName/{name}/bookAuthor/{author}")
 	public List<E_Book_Model> displayNameAndAuthor(@PathVariable String name,@PathVariable String author)
 	{
 		return sser.getNameAndAuthor(name,author);
 	}
 	
 	
 	//Delete by Query
 	@DeleteMapping("DQueryById/{id}")
 	public String DeleteDetailsByQuery(@PathVariable int id)
 	{
 		return sser.DeleteByQuery(id)+"Deleted Successfully";
 	}
 	
 	//Update by Query
 	@PutMapping("UQueryById/{newid}/{oldid}")
 	public String UpdateDetailsByQuery(@PathVariable int newid, @PathVariable int oldid)
 	{
 		return sser.UpdateByQuery(newid,oldid)+"Updated Successfully";
 	}
    
    

}

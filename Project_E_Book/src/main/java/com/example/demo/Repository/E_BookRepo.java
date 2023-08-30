package com.example.demo.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.Model.E_Book_Model;

import jakarta.transaction.Transactional;

public interface E_BookRepo extends JpaRepository<E_Book_Model, Integer>
{
	@Query(value = "select *from ebook_table where book_id=:a",nativeQuery = true)
	public List<E_Book_Model> getinfobookId(@Param("a") int id);
	
	@Query(value = "select* from ebook_table  where book_category=:b",nativeQuery = true)
	public List<E_Book_Model> getinfoCategory(@Param("b") String cat);
	
	@Query(value = "select* from ebook_table  where book_name=:d and book_author=:e",nativeQuery = true)
	public List<E_Book_Model> getinfoNameandAuthor(@Param("d") String name,@Param("e") String author);
	
	@Modifying
	@Transactional
	@Query(value = "delete from ebook_table  where book_id=:f",nativeQuery = true)
	public Integer deleteBookById(@Param("f") int id);
	
	@Modifying
	@Transactional
	@Query(value = "update ebook_table  set book_id=?1 where book_id=?2",nativeQuery = true)
	public int updateBookById(int newid,int oldid);
	
}

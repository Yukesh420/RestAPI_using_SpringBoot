package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Model.E_Book_Model;

public interface E_BookRepo extends JpaRepository<E_Book_Model, Integer>
{
	
}

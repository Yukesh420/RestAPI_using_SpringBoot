package com.example.demo.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="EBookFormat")
public class E_Book_Format 
{
     @Id
     private int formatId;
     private String bookFormat;
     private long additionalPrice;
     
	public E_Book_Format()
	{
		super();
		// TODO Auto-generated constructor stub
	}

	public E_Book_Format(int formatId, String bookFormat, long additionalPrice) 
	{
		super();
		this.formatId = formatId;
		this.bookFormat = bookFormat;
		this.additionalPrice = additionalPrice;
	}

	public int getFormatId() {
		return formatId;
	}

	public void setFormatId(int formatId) {
		this.formatId = formatId;
	}

	public String getBookFormat() {
		return bookFormat;
	}

	public void setBookFormat(String bookFormat) {
		this.bookFormat = bookFormat;
	}

	public long getAdditionalPrice() {
		return additionalPrice;
	}

	public void setAdditionalPrice(long additionalPrice) {
		this.additionalPrice = additionalPrice;
	}
    
}

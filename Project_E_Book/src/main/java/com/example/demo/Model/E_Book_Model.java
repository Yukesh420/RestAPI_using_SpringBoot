package com.example.demo.Model;

//import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
//import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="EBookTable")
public class E_Book_Model 
{
	@Id
//	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="book_id")
	private int bookId;
	@Column(name="book_name")
	private String bookName;
	@Column(name="book_author")
	private String bookAuthor;
	@Column(name="book_category")
	private String category;
	@Column(length=1024,name="book_description")
	private String description;
	@Column(name="year_of_publish")
	private int yearOfPublish;
	@Column(name="book_price")
	private long bookPrice;
	
	
//   ONE TO MANY MAPPING
//	 @OneToMany(cascade = CascadeType.ALL)
//   @JoinColumn(name="Multiformat_id")
//	 public List<E_Book_Format> bf;
//
//
//	public E_Book_Model() {
//		super();
//		// TODO Auto-generated constructor stub
//	}
//
//
//	public E_Book_Model(int bookId, String bookName, String bookAuthor, String category, String description,
//			int yearOfPublish, long bookPrice, List<E_Book_Format> bf) {
//		super();
//		this.bookId = bookId;
//		this.bookName = bookName;
//		this.bookAuthor = bookAuthor;
//		this.category = category;
//		this.description = description;
//		this.yearOfPublish = yearOfPublish;
//		this.bookPrice = bookPrice;
//		this.bf = bf;
//	}
//
//
//	public int getBookId() {
//		return bookId;
//	}
//
//
//	public void setBookId(int bookId) {
//		this.bookId = bookId;
//	}
//
//
//	public String getBookName() {
//		return bookName;
//	}
//
//
//	public void setBookName(String bookName) {
//		this.bookName = bookName;
//	}
//
//
//	public String getBookAuthor() {
//		return bookAuthor;
//	}
//
//
//	public void setBookAuthor(String bookAuthor) {
//		this.bookAuthor = bookAuthor;
//	}
//
//
//	public String getCategory() {
//		return category;
//	}
//
//
//	public void setCategory(String category) {
//		this.category = category;
//	}
//
//
//	public String getDescription() {
//		return description;
//	}
//
//
//	public void setDescription(String description) {
//		this.description = description;
//	}
//
//
//	public int getYearOfPublish() {
//		return yearOfPublish;
//	}
//
//
//	public void setYearOfPublish(int yearOfPublish) {
//		this.yearOfPublish = yearOfPublish;
//	}
//
//
//	public long getBookPrice() {
//		return bookPrice;
//	}
//
//
//	public void setBookPrice(long bookPrice) {
//		this.bookPrice = bookPrice;
//	}
//
//
//	public List<E_Book_Format> getBf() {
//		return bf;
//	}
//
//
//	public void setBf(List<E_Book_Format> bf) {
//		this.bf = bf;
//	}
	
	
	
	
	
	
	
	
	
// ONE TO ONE MAPPING	
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="format_id")
	private E_Book_Format fk;
	public E_Book_Model() 
	{
		super();
		// TODO Auto-generated constructor stub
	}

	public E_Book_Model(int bookId, String bookName, String bookAuthor, String category, String description,
			int yearOfPublish, long bookPrice, E_Book_Format fk) 
	{
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.bookAuthor = bookAuthor;
		this.category = category;
		this.description = description;
		this.yearOfPublish = yearOfPublish;
		this.bookPrice = bookPrice;
		this.fk = fk;
	}

	public int getBookId() 
	{
		return bookId;
	}

	public void setBookId(int bookId) 
	{
		this.bookId = bookId;
	}

	public String getBookName() 
	{
		return bookName;
	}

	public void setBookName(String bookName) 
	{
		this.bookName = bookName;
	}

	public String getBookAuthor() 
	{
		return bookAuthor;
	}

	public void setBookAuthor(String bookAuthor)
	{
		this.bookAuthor = bookAuthor;
	}

	public String getCategory() 
	{
		return category;
	}

	public void setCategory(String category) 
	{
		this.category = category;
	}

	public String getDescription()
	{
		return description;
	}

	public void setDescription(String description) 
	{
		this.description = description;
	}

	public int getYearOfPublish()
	{
		return yearOfPublish;
	}

	public void setYearOfPublish(int yearOfPublish) 
	{
		this.yearOfPublish = yearOfPublish;
	}

	public long getBookPrice() 
	{
		return bookPrice;
	}

	public void setBookPrice(long bookPrice) 
	{
		this.bookPrice = bookPrice;
	}

	public E_Book_Format getFk() 
	{
		return fk;
	}

	public void setFk(E_Book_Format fk) 
	{
		this.fk = fk;
	}
	
	
	

	
	
//  WITHOUT MAPPING		
//	public E_Book_Model(int bookId, String bookName, String bookAuthor, String category, String description,
//			int yearOfPublish, long bookPrice) 
//	{
//		super();
//		this.bookId = bookId;
//		this.bookName = bookName;
//		this.bookAuthor = bookAuthor;
//		this.category = category;
//		this.description = description;
//		this.yearOfPublish = yearOfPublish;
//		this.bookPrice = bookPrice;
//	}
//	public E_Book_Model() 
//	{
//		super();
//		// TODO Auto-generated constructor stub
//	}
//	public int getBookId() 
//	{
//		return bookId;
//	}
//	public void setBookId(int bookId) 
//	{
//		this.bookId = bookId;
//	}
//	public String getBookName() 
//	{
//		return bookName;
//	}
//	public void setBookName(String bookName) 
//	{
//		this.bookName = bookName;
//	}
//	public String getBookAuthor() 
//	{
//		return bookAuthor;
//	}
//	public void setBookAuthor(String bookAuthor) 
//	{
//		this.bookAuthor = bookAuthor;
//	}
//	public String getCategory() 
//	{
//		return category;
//	}
//	public void setCategory(String category) 
//	{
//		this.category = category;
//	}
//	public String getDescription() 
//	{
//		return description;
//	}
//	public void setDescription(String description) 
//	{
//		this.description = description;
//	}
//	public int getYearOfPublish()
//	{
//		return yearOfPublish;
//	}
//	public void setYearOfPublish(int yearOfPublish) 
//	{
//		this.yearOfPublish = yearOfPublish;
//	}
//	public long getBookPrice() 
//	{
//		return bookPrice;
//	}
//	public void setBookPrice(long bookPrice) 
//	{
//		this.bookPrice = bookPrice;
//	}
	
}
	
	
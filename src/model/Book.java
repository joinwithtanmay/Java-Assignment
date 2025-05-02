package model;
import java.util.*;
public class Book implements Comparable <Book>{
	
	private int book_id;
	private String book_name;
	private String author_name;
	public double book_price;
	
	public Book(int book_id, String book_name, String author_name, double book_price)
	{
		this.book_id = book_id;
		this.book_name = book_name;
		this.author_name = author_name;
		this.book_price = book_price;
	}

	@Override
	public int compareTo(Book o) {
		return Integer.compare(this.book_id, o.book_id);
	}
	
	@Override
	public String toString() {
	    return "Book ID: " + book_id + ", Title: " + book_name +
	           ", Author: " + author_name + ", Price: Rs." + book_price;
	}

	public int getId() {
		// TODO Auto-generated method stub
		return book_id;
	}
	public String getTitle()
	{
		return book_name;
	}
	public String getAuthor()
	{
		return author_name;
	}
	public double getPrice()
	{
		return book_price;
	}

	public void setPrice(double price) {
	    this.book_price = price;
	}

}

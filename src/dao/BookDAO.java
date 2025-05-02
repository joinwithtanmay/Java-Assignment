package dao;
import model.Book;

import java.util.Iterator;
//import java.util.Optional;
import java.util.Set;
//import java.util.TreeSet;

//import java.util.Set;

//import java.util.Set;

import db.Database;


public class BookDAO {
	
	private Database database;
	
	public BookDAO()
	{
		database = new Database();
	}
	public void insert (Book book)
	{
		database.AddBook(book);
	}
	public Set<Book> viewBooks() {
		
		return database.getAllBooks();
	}
	public Book viewByName(String title) {
	    Book b = database.getBookByTitle(title); 
	    return b;
	   	   
	}

	    public void deleteById(int id) {
	        database.deleteBookById(id);
	    }
	    public boolean updatePriceByTitle(String name, double newPrice) {
	        return database.updateBook(name, newPrice); 
	    }
	
}

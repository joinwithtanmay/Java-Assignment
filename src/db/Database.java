package db;

import java.util.*;
import model.Book;
public class Database {
	
	private TreeSet<Book> book;
	public Database()
	
	{
		book = new TreeSet<Book>();
		Book b1 = new Book(1,"Harry Pottar", "J. K. Rowling",2500);
		book.add(b1);
		
		Book b2 = new Book(2,"Half Girlfriend", "Chetan Bhagat",3500);
		book.add(b2);
		
	}
	
	public void AddBook(Book b) {
	    for (Book existingBook : book) {
	        if (existingBook.getId()==(b.getId())) {
	            System.out.println("Book With Same ID No. already Exists. Please Enter Unique ID");
	            return;
	        }
	    }
	    book.add(b);
	    System.out.println("Book Added Successfully");
	}

public Set<Book> getAllBooks()
{
	return book;
}

public Book getBookByTitle(String title) {
    for (Book b : book) {
        if (b.getTitle().equalsIgnoreCase(title)) {
        	System.out.println("Details Of Book Of Whose Title Is Entered");
            return b;  // Return the found book
        }
    } 
    return null; // Return null if not found
}
public void deleteBookById(int id) {
    Iterator<Book> iterator = book.iterator();
    while (iterator.hasNext()) {
        Book book = iterator.next();
        if (book.getId() == id) {
            iterator.remove();
            System.out.println("Book Deleted Successfully");
            return;
        }
    }
    System.out.println("Book with ID " + id + " not found.");
}

public boolean updateBook(String name, double price) {
    for (Book b : book) {
        if (b.getTitle().equalsIgnoreCase(name)) {
            b.setPrice(price);
            return true; // Price updated
        }
    }
    System.out.println("Book with title '" + name + "' not found.");
    return false;
}
}

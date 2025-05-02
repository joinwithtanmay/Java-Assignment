package uimodel;
import java.util.*;
import model.Book;
import dao.BookDAO;
public class Admin 
{
    public static void main (String [] args)
    {
    	Scanner sc = new Scanner (System.in);
    	BookDAO bookDao = new BookDAO();
        char ch = 'Y';
    	int choice;
    	    
    	    do
    	    {
    		System.out.println("************MENU*************");
    		System.out.println("Press 1 To View All Books");
    		System.out.println("Press 2 To Search Book By Title");
    		System.out.println("Press 3 To Insert Book");
    		System.out.println("Press 4 To Delete Book");
    		System.out.println("Press 5 To Update Book");
    		System.out.println("Press 6 To Exit");
    		System.out.println("************************************");
    		System.out.println("Enter your choice : ");
    		choice = sc.nextInt();
    		
    		
    	switch(choice)
    	{
    		
    	case 1:
    		System.out.println("Welcome to the Library");
    	    Set<Book> books = bookDao.viewBooks();  // call method that returns the TreeSet
    	    if (books.isEmpty()) {
    	        System.out.println("No books available.");
    	    } else {
    	        for (Book b : books) {
    	            System.out.println(b);  // works if toString() is defined in Book
    	        }
    	    }
    	
    		break;
    		
    	case 2:
    		System.out.println("Enter the name of the Book");
    		sc.nextLine();
    		String name = sc.nextLine();
    		Book book1 = bookDao.viewByName(name);
    		if(book1!=null)
    		{
    		System.out.println(book1);
    		}
    		else
    		{
    			System.out.println("Sorry This Book unavailable");
    		}
    		break;
    		
    	case 3:
    		System.out.println("Enter The ID No. Of The Book");
    		int id1 = sc.nextInt();
    		sc.nextLine();
    		System.out.println("Enter The Name Of The Book");
    		String name1 = sc.nextLine();
    		System.out.println("Enter The Author Of The Book");
    		String author = sc.nextLine();
    		System.out.println("Enter The Price Of The Book");
    		double price = sc.nextDouble();
            Book book = new Book(id1, name1, author, price);
    		bookDao.insert(book);
    		break;
    		
    	case 4:
    		System.out.println("Enter The ID No. Of The Book");
    		int id2 = sc.nextInt();
    		bookDao.deleteById(id2);
    		break;
    		
    	case 5:
    	    sc.nextLine(); 
    	    System.out.println("Enter The Title Of The Book Whose Price Is To Be Updated:");
    	    String name2 = sc.nextLine();

    	    System.out.println("Enter The New Price:");
    	    double newPrice = sc.nextDouble();

    	    boolean updated = bookDao.updatePriceByTitle(name2, newPrice);

    	    if (updated) {
    	        System.out.println("Price updated successfully.");
    	    } else {
    	        System.out.println("Book not found.");
    	    }
    	    break;

    		
    	case 6:
    		System.out.println("Exit");
    		System.out.print("Do you want to see the menu again? (Y/N): ");
            sc.nextLine();
            ch = sc.next().charAt(0);
            ch = Character.toUpperCase(ch);
    		break;
    		
    	default:
    		System.out.println("Please enter the valid choice");
    		break;
    	}
    	    
    	
         
    	
    }while (choice!=6 || ch=='Y');
    	
    	System.out.print("Thank You For Using Our Book Management System!");
    	sc.close();
}
    
}
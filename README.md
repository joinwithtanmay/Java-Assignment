src/

├── Admin.java        // Manages admin info and system operations

├── Book.java         // Represents book details (title, author, etc.)

├── Database.java     // Holds in-memory "database" of books

└── BookDAO.java      // Provides data access methods (add, delete, find)


Class Responsibilities

1. Admin.java
Contains admin-related data (name, ID, etc.)
Provides menu-driven interface for admin actions

2. Book.java
Contains attributes like ID, title, author, price, and genre
Includes getters, setters, and toString() override

3. Database.java
Acts as an in-memory store (could use ArrayList<Book>)
Provides helper methods to interact with book list

4. BookDAO.java
Contains logic to:
Add a book
Remove a book
Search books
Fetch all books


package ScenarioBased;
import java.util.*;
public class LibraryManagementSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        
        Book[] library = {
            new Book("Harry Potter and the Sorcerer's Stone", "J.K. Rowling"),
            new Book("The Hobbit", "J.R.R. Tolkien"),
            new Book("To Kill a Mockingbird", "Harper Lee"),
            new Book("1984", "George Orwell")
        };

        displayBooks(library);

       
        System.out.print("\nEnter keyword to search books: ");
        String keyword = sc.nextLine();
        searchBook(library, keyword);

       
        System.out.print("\nEnter exact title to checkout: ");
        String checkoutTitle = sc.nextLine();
        checkoutBook(library, checkoutTitle);

        
        displayBooks(library);
	}
	public static void searchBook(Book[] books, String keyword) {
        System.out.println("\nSearch results for \"" + keyword + "\":");
        boolean found = false;
        for (Book book : books) {
            if (book.title.toLowerCase().contains(keyword.toLowerCase())) {
                book.display();
                found = true;
            }
        }
        if (!found) System.out.println("No books found.");
    }

    
    public static void checkoutBook(Book[] books, String title) {
        for (Book book : books) {
            if (book.title.equalsIgnoreCase(title)) {
                if (book.isAvailable) {
                    book.isAvailable = false;
                    System.out.println("Book \"" + book.title + "\" checked out successfully!");
                } else {
                    System.out.println("Book \"" + book.title + "\" is already checked out.");
                }
                return;
            }
        }
        System.out.println("Book not found.");
    }

    
    public static void displayBooks(Book[] books) {
        System.out.println("\n--- Library Books ---");
        for (Book book : books) {
            book.display();
        }
    }
}
class Book {
    String title;
    String author;
    boolean isAvailable; 

    
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.isAvailable = true;
    }

    
    public void display() {
        System.out.println("Title: " + title + ", Author: " + author + ", Status: " + (isAvailable ? "Available" : "Checked Out"));
    }
}
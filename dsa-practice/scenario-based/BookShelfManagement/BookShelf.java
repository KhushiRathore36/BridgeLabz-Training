package BookShelfManagement;
import java.util.*;
public class BookShelf {
	HashMap<String, LinkedList<Book>> catalog = new HashMap<>();

   
    HashSet<String> uniqueTitles = new HashSet<>();

    
    void addBook(String genre, Book book) {
        if (uniqueTitles.contains(book.title)) {
            System.out.println("Book Already Exists! Duplicate avoided.");
            return;
        }

        catalog.putIfAbsent(genre, new LinkedList<>());
        catalog.get(genre).add(book);
        uniqueTitles.add(book.title);

        System.out.println("Book added: " + book + " under Genre: " + genre);
    }

    
    Book borrowBook(String genre, String title) {
        if (!catalog.containsKey(genre) || catalog.get(genre).isEmpty()) {
            System.out.println("No books available in this genre!");
            return null;
        }

        LinkedList<Book> list = catalog.get(genre);
        Iterator<Book> it = list.iterator();

        while (it.hasNext()) {
            Book b = it.next();
            if (b.title.equals(title)) {
                it.remove();
                uniqueTitles.remove(b.title);
                System.out.println("Borrowed: " + b);
                return b;
            }
        }

        System.out.println("Book not found!");
        return null;
    }

   
    void returnBook(String genre, Book book) {
        addBook(genre, book);
    }

   
    void printCatalog() {
        if (catalog.isEmpty()) {
            System.out.println("Library is Empty!");
            return;
        }

        System.out.println("\n--- LIBRARY CATALOG ---");
        for (String genre : catalog.keySet()) {
            System.out.println("Genre: " + genre);
            LinkedList<Book> list = catalog.get(genre);
            if (list.isEmpty()) System.out.println("  (No books)");
            for (Book b : list) {
                System.out.println("  " + b);
            }
        }
        System.out.println("------------------------");
    }
}

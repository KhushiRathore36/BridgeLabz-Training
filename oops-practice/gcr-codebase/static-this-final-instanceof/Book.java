package Keywords;

public class Book {
	static String libraryName = "Egmore Library";
    String title;
    String author;
    final String isbn;
    Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }
    static void displayLibraryName() {
        System.out.println("Library Name: " + libraryName);
    }
    static void displayBookDetails(Object obj) {
        if (obj instanceof Book) {   
            Book book = (Book) obj;
            System.out.println("Title: " + book.title);
            System.out.println("Author: " + book.author);
            System.out.println("ISBN: " + book.isbn);
        } else {
            System.out.println("Not a Book object");
        }
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book b1 = new Book("Effective Java","Joshua Bloch","978-0134685991");
        displayLibraryName();
        displayBookDetails(b1);
	}

}

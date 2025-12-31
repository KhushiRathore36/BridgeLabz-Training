package AccessModifiers;

public class Book {
	public String ISBN;
	protected String title;
    private String author;
    Book(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public String getAuthor() {
        return author;
    }
    void displayBookDetails() {
        System.out.println("ISBN: " + ISBN);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
}
class EBook extends Book {

    String fileFormat;

    
    EBook(String ISBN, String title, String author, String fileFormat) {
        super(ISBN, title, author);
        this.fileFormat = fileFormat;
    }

    
    void displayEBookDetails() {
        System.out.println("ISBN: " + ISBN);       
        System.out.println("Title: " + title);     
        System.out.println("Author: " + getAuthor()); 
        System.out.println("File Format: " + fileFormat);
    }
    public static void main(String[] args) {

        
        Book b1 = new Book("978-0134685991", "Effective Java", "Joshua Bloch");
        b1.displayBookDetails();
        EBook eb = new EBook(
                "978-0201633610",
                "Design Patterns",
                "Erich Gamma",
                "PDF"
        );
        eb.displayEBookDetails();

        
        eb.setAuthor("Gang of Four");
        System.out.println("Updated Author: " + eb.getAuthor());
    }
}

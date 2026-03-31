package Inheritance;

public class LibraryManagement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Author book1 = new Author(
                "Clean Code",
                2008,
                "Robert C. Martin",
                "Software engineer and author"
        );

        book1.displayInfo();
	}

}
class Book {
    String title;
    int publicationYear;

    
    Book(String title, int publicationYear) {
        this.title = title;
        this.publicationYear = publicationYear;
    }

    
    void displayInfo() {
        System.out.println("Book Title: " + title);
        System.out.println("Publication Year: " + publicationYear);
    }
}


class Author extends Book {
    String name;
    String bio;

    Author(String title, int publicationYear, String name, String bio) {
        super(title, publicationYear);
        this.name = name;
        this.bio = bio;
    }

   
    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Author Name: " + name);
        System.out.println("Author Bio: " + bio);
    }
}

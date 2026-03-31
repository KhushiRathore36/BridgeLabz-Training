package BookShelfManagement;

public class Book {
	String title;
    String author;

    Book(String t, String a) {
        this.title = t;
        this.author = a;
    }

    @Override
    public String toString() {
        return "[" + title + " by " + author + "]";
    }
}

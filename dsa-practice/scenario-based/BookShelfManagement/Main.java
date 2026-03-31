package BookShelfManagement;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BookShelf shelf = new BookShelf();

       
        shelf.addBook("Fiction", new Book("The Alchemist", "Paulo Coelho"));
        shelf.addBook("Fiction", new Book("1984", "George Orwell"));
        shelf.addBook("Science", new Book("Brief History of Time", "Stephen Hawking"));
        shelf.addBook("Science", new Book("Cosmos", "Carl Sagan"));

        
        shelf.addBook("Fiction", new Book("1984", "George Orwell"));

       
        shelf.printCatalog();

       
        Book borrowed = shelf.borrowBook("Fiction", "1984");

       
        shelf.printCatalog();

       
        if (borrowed != null) shelf.returnBook("Fiction", borrowed);

       
        shelf.printCatalog();
	}

}

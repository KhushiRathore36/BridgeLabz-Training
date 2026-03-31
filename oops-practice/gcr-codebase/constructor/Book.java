package OPPSProblem;

public class Book {
	String title;
    String author;
    int price;
    Book(){
    	title="JAICO BOOKS";
    	author="ROBIN SHARMA";
    	price=300;
    }
    Book(String title,String author,int price){
    	this.title=title;
    	this.author=author;
    	this.price=price;
    }
    public void display() {
    	System.out.println("Title of the book: "+title);
    	System.out.println("Author of the book: "+author);
    	System.out.println("Price of the book: "+price);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Book book=new Book("2States","Chetan Bhagat",200);
        Book book1=new Book();
        book.display();
        book1.display();
	}
	

}

package OPPSProblem;

public class BookDetails {
    String title;
    String author;
    int price;
    BookDetails(String title,String author,int price){
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
        BookDetails book=new BookDetails("2States","Chetan Bhagat",200);
        book.display();
	}

}

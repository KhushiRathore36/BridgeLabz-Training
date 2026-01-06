package Encapsulation;
import java.util.ArrayList;
import java.util.List;

interface Reservable {
    void reserveItem();
    boolean checkAvailability();
}

abstract class LibraryItem {
    private int itemId;
    private String title;
    private String author;
    private boolean available;
    private String borrowerData;

    public LibraryItem(int itemId, String title, String author) {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
        this.available = true;
    }

    public abstract int getLoanDuration();

    public void getItemDetails() {
        System.out.println("Item ID: " + itemId);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }

    protected boolean isAvailable() {
        return available;
    }

    protected void setAvailable(boolean available) {
        this.available = available;
    }

    protected void setBorrowerData(String borrowerData) {
        this.borrowerData = borrowerData;
    }
}

class Book extends LibraryItem implements Reservable {

    public Book(int itemId, String title, String author) {
        super(itemId, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 14;
    }

    @Override
    public void reserveItem() {
        if (isAvailable()) {
            setAvailable(false);
        }
    }

    @Override
    public boolean checkAvailability() {
        return isAvailable();
    }
}

class Magazine extends LibraryItem implements Reservable {

    public Magazine(int itemId, String title, String author) {
        super(itemId, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 7;
    }

    @Override
    public void reserveItem() {
        if (isAvailable()) {
            setAvailable(false);
        }
    }

    @Override
    public boolean checkAvailability() {
        return isAvailable();
    }
}

class DVD extends LibraryItem implements Reservable {

    public DVD(int itemId, String title, String author) {
        super(itemId, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 3;
    }

    @Override
    public void reserveItem() {
        if (isAvailable()) {
            setAvailable(false);
        }
    }

    @Override
    public boolean checkAvailability() {
        return isAvailable();
    }
}
public class LibraryManagementSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<LibraryItem> items = new ArrayList<>();

        items.add(new Book(1, "Java Programming", "Herbert Schildt"));
        items.add(new Magazine(2, "Tech Today", "Editorial Team"));
        items.add(new DVD(3, "Inception", "Christopher Nolan"));

        for (LibraryItem item : items) {

            item.getItemDetails();
            System.out.println("Loan Duration (days): " + item.getLoanDuration());

            if (item instanceof Reservable) {
                Reservable r = (Reservable) item;
                System.out.println("Available: " + r.checkAvailability());
                r.reserveItem();
                System.out.println("Available After Reservation: " + r.checkAvailability());
            }

        }
	}

}

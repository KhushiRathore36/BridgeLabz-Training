package ScenarioBased;
import java.util.ArrayList;
import java.util.List;

class InvalidPhoneNumberException extends Exception {
    public InvalidPhoneNumberException(String message) {
        super(message);
    }
}

class Contact {
    private String name;
    private String phoneNumber;

    public Contact(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
}

class ContactManager {
    private List<Contact> contacts = new ArrayList<>();

    public void addContact(String name, String phoneNumber) throws InvalidPhoneNumberException {
        if (!phoneNumber.matches("\\d{10}")) {
            throw new InvalidPhoneNumberException("Phone number must be exactly 10 digits");
        }
        for (Contact c : contacts) {
            if (c.getPhoneNumber().equals(phoneNumber)) {
                throw new IllegalArgumentException("Duplicate contact not allowed");
            }
        }
        contacts.add(new Contact(name, phoneNumber));
    }

    public void deleteContact(String phoneNumber) {
        contacts.removeIf(c -> c.getPhoneNumber().equals(phoneNumber));
    }

    public Contact searchContact(String keyword) {
        for (Contact c : contacts) {
            if (c.getName().equalsIgnoreCase(keyword) || c.getPhoneNumber().equals(keyword)) {
                return c;
            }
        }
        return null;
    }

    public void displayContacts() {
        for (Contact c : contacts) {
            System.out.println(c.getName() + " - " + c.getPhoneNumber());
        }
    }
}
public class PhoneContactOrganiser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ContactManager manager = new ContactManager();
        try {
            manager.addContact("Navya", "9876543210");
            manager.addContact("Kashish", "9123456789");
            manager.addContact("Muskan", "9999999999");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        manager.displayContacts();

        Contact found = manager.searchContact("Navya");
        if (found != null) {
            System.out.println("Found: " + found.getName() + " - " + found.getPhoneNumber());
        }

        manager.deleteContact("9123456789");
        manager.displayContacts();
	}

}

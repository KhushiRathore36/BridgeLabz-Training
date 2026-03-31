package AdressBook;
import java.util.*;
public class AddressBook {
    
     private ArrayList<Contacts> contactList = new ArrayList<>();
     
     public void addContact(Contacts contact) {
         contactList.add(contact);
         System.out.println("\nContact Added Successfully!");
     }

     public void getDetails() {
    	
         for (Contacts cn : contactList) {
        	 System.out.println("the contacts details are: ");
             System.out.println(cn.getFirstName()+" "+cn.getLastName());
             System.out.println("The adress of the contacts: "+cn.getAddress());
             System.out.println("The state of the person is: "+cn.getState());
             System.out.println("The city of the person is: "+cn.getCity());
             System.out.println("The zip of the person is: "+cn.getZip());
             System.out.println("phone number is: "+cn.getPhoneNumber());
             System.out.println("email are: "+cn.getEmail());
         }
     }
     public void editDetails(String firstName,Scanner sc) {
    	 for(Contacts cn:contactList) {
    		 if (cn.getFirstName().equalsIgnoreCase(firstName)) {
    	            System.out.println("Contact found! Enter new details:");

    	            System.out.print("First Name: ");
    	            cn.setFirstName(sc.nextLine());

    	            System.out.print("Last Name: ");
    	            cn.setLastName(sc.nextLine());

    	            System.out.print("Address: ");
    	            cn.setAddress(sc.nextLine());

    	            System.out.print("City: ");
    	            cn.setCity(sc.nextLine());

    	            System.out.print("State: ");
    	            cn.setState(sc.nextLine());

    	            System.out.print("ZIP: ");
    	            cn.setZip(sc.nextLine());

    	            System.out.print("Phone Number: ");
    	            cn.setPhoneNumber(sc.nextLine());
    	            
    	            System.out.print("Email: ");
    	            cn.setEmail(sc.nextLine());

    	            System.out.println("\nContact Updated Successfully!");
    	            return;
    	     }
    		 System.out.println("Contact not found!");
    	 }
     }
     public void deleteContact(String firstName) {
    	 for(Contacts cn:contactList) {
    		 if(cn.getFirstName().equalsIgnoreCase(firstName)) {
    			 contactList.remove(cn);
    			 System.out.println("contact is successfully deleted!");
    			 return;
    		 }
    	 }
    	 System.out.println("Contact Not Found!");
     }
}

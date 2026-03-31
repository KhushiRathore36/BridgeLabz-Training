package AdressBook;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println("Welcome To Adress Book Program");
        Contacts cn=new Contacts("Khushi","Rathore","post office street","Agra","Uttar Pradesh","282003","427293456","khushi@gmail.com");
        AddressBook ad=new AddressBook();
        ad.addContact(cn);
        ad.getDetails();
	}

}

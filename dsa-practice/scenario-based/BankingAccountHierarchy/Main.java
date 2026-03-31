package BankingAccountHierarchy;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount savings = new SavingsAccount("12345", 1000.0);
        System.out.printf("%.2f%n", savings.calculateFee()); 

       
        BankAccount s2 = new SavingsAccount("22222", 500.0);
        System.out.printf("%.2f%n", s2.calculateFee()); 

        BankAccount c1 = new CheckingAccount("33333", 1500.0);
        System.out.printf("%.2f%n", c1.calculateFee()); 

        BankAccount c2 = new CheckingAccount("44444", 500.0);
        System.out.printf("%.2f%n", c2.calculateFee()); 
	}

}

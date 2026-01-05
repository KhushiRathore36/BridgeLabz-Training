package ScenarioBased;

public class BankAccountManager {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount acc = new BankAccount("ACC12345", 5000);

        acc.checkBalance();
        acc.deposit(2000);
        acc.withdraw(1000);
        acc.withdraw(7000); 
        acc.checkBalance();
	}

}
class BankAccount {

    
    private String accountNumber;
    private double balance;

    
    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    
    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Deposit amount must be positive.");
        } else {
            balance += amount;
            System.out.println("Amount deposited: " + amount);
        }
    }

   
    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Withdrawal amount must be positive.");
        } else if (amount > balance) {
            System.out.println("Insufficient balance. Withdrawal denied.");
        } else {
            balance -= amount;
            System.out.println("Amount withdrawn: " + amount);
        }
    }

    public void checkBalance() {
        System.out.println("Current Balance: " + balance);
    }
}
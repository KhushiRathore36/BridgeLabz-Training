package OPPSProblem;

public class BankAccount {
	String accountHolder;
    String accountNumber;
    double balance;

    
    BankAccount(String accountHolder, String accountNumber, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

   
    void displayBalance() {
        System.out.println("Current balance: " + balance);
    }

    
    void deposit(double amount) {
        balance = balance + amount;
        System.out.println("Deposited: " + amount);
        displayBalance();
    }

    
    void withdraw(double amount) {
        if (amount <= balance) {
            balance = balance - amount;
            System.out.println("Withdraw amount is : " + amount);
            displayBalance();
        } else {
            System.out.println("Insufficient balance");
        }
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("State of Chennai\n");

        BankAccount account = new BankAccount("Ramesh", "ACC001", 700.0);

        account.displayBalance();
        account.deposit(200.0);
        account.withdraw(100.0);
        account.withdraw(1000.0);   
	}

}

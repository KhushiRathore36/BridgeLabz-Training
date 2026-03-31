package AccessModifiers;

public class BankAccount {
	public String accountNumber;
    protected String accountHolder;
    private double balance;
    BankAccount(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }
    public double getBalance() {
        return balance;
    }
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

   
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient balance or invalid amount!");
        }
    }

   
    void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: " + balance);
    }
}
class SavingsAccount extends BankAccount {

    double interestRate;
    SavingsAccount(String accountNumber, String accountHolder,double balance, double interestRate) {
        super(accountNumber, accountHolder, balance);
        this.interestRate = interestRate;
    }

    
    void displaySavingsAccountDetails() {
        System.out.println("Account Number: " + accountNumber);   
        System.out.println("Account Holder: " + accountHolder);   
        System.out.println("Interest Rate: " + interestRate + "%");
        System.out.println("Balance: " + getBalance());           
    }
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount("ACC101", "Rohan", 10000);
        acc1.displayAccountDetails();

        acc1.deposit(5000);
        acc1.withdraw(3000);
        System.out.println("Updated Balance: " + acc1.getBalance());
        SavingsAccount sa = new SavingsAccount("SAV201", "Anita", 20000, 4.5);
        sa.displaySavingsAccountDetails();
    }
}

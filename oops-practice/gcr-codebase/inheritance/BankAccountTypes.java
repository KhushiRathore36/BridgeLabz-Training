package Inheritance;

public class BankAccountTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount savings = new SavingsAccount("SA101", 50000, 4.5);
        BankAccount checking = new CheckingAccount("CA202", 30000, 10000);
        BankAccount fixedDeposit = new FixedDepositAccount("FD303", 100000, 5);

        savings.displayDetails();
        ((SavingsAccount) savings).displayAccountType();
        System.out.println();

        checking.displayDetails();
        ((CheckingAccount) checking).displayAccountType();
        System.out.println();

        fixedDeposit.displayDetails();
        ((FixedDepositAccount) fixedDeposit).displayAccountType();
	}

}
class BankAccount {
    String accountNumber;
    double balance;

    
    BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    
    void displayDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: ₹" + balance);
    }
}


class SavingsAccount extends BankAccount {
    double interestRate;

    SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    void displayAccountType() {
        System.out.println("Account Type: Savings Account");
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}


class CheckingAccount extends BankAccount {
    double withdrawalLimit;

    CheckingAccount(String accountNumber, double balance, double withdrawalLimit) {
        super(accountNumber, balance);
        this.withdrawalLimit = withdrawalLimit;
    }

    void displayAccountType() {
        System.out.println("Account Type: Checking Account");
        System.out.println("Withdrawal Limit: ₹" + withdrawalLimit);
    }
}


class FixedDepositAccount extends BankAccount {
    int tenure; 

    FixedDepositAccount(String accountNumber, double balance, int tenure) {
        super(accountNumber, balance);
        this.tenure = tenure;
    }

    void displayAccountType() {
        System.out.println("Account Type: Fixed Deposit Account");
        System.out.println("Tenure: " + tenure + " years");
    }
}
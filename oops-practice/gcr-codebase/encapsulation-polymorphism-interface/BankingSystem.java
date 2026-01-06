package Encapsulation;
import java.util.ArrayList;
import java.util.List;

interface Loanable {
    void applyForLoan();
    double calculateLoanEligibility();
}

abstract class BankAccount {
    private String accountNumber;
    private String holderName;
    private double balance;

    public BankAccount(String accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        }
    }

    public abstract double calculateInterest();

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getHolderName() {
        return holderName;
    }

    protected double getBalance() {
        return balance;
    }
}

class SavingsAccount extends BankAccount implements Loanable {

    public SavingsAccount(String accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }

    @Override
    public double calculateInterest() {
        return getBalance() * 0.04;
    }

    @Override
    public void applyForLoan() {
        System.out.println("Loan application submitted for Savings Account");
    }

    @Override
    public double calculateLoanEligibility() {
        return getBalance() * 5;
    }
}

class CurrentAccount extends BankAccount implements Loanable {

    public CurrentAccount(String accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }

    @Override
    public double calculateInterest() {
        return getBalance() * 0.02;
    }

    @Override
    public void applyForLoan() {
        System.out.println("Loan application submitted for Current Account");
    }

    @Override
    public double calculateLoanEligibility() {
        return getBalance() * 3;
    }
}


public class BankingSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<BankAccount> accounts = new ArrayList<>();

        accounts.add(new SavingsAccount("SA101", "Amit", 50000));
        accounts.add(new CurrentAccount("CA202", "Neha", 80000));

        for (BankAccount acc : accounts) {

            double interest = acc.calculateInterest();

            System.out.println("Account Number: " + acc.getAccountNumber());
            System.out.println("Holder Name: " + acc.getHolderName());
            System.out.println("Balance: ₹" + acc.getBalance());
            System.out.println("Interest: ₹" + interest);

            if (acc instanceof Loanable) {
                Loanable loanAcc = (Loanable) acc;
                loanAcc.applyForLoan();
                System.out.println("Loan Eligibility: ₹" + loanAcc.calculateLoanEligibility());
            }

            
        }
	}

}

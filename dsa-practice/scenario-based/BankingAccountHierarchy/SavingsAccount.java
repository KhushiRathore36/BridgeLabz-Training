package BankingAccountHierarchy;

public class SavingsAccount extends BankAccount{
	public SavingsAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    double calculateFee() {
        // 0.5% = 0.005 * balance
        return 0.005 * getBalance();
    }
}

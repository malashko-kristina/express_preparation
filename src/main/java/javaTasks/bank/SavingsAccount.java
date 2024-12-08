package javaTasks.bank;

public class SavingsAccount extends BankAccount {

    public SavingsAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    public void calculateInterest() {
        double interest = getBalance() * 0.05;
        setBalance(getBalance() + interest);
    }
}

package javaTasks.bank;

public class CheckingAccount extends BankAccount {

    public CheckingAccount(String accountName, double balance) {
        super(accountName, balance);
    }

    @Override
    public void calculateInterest() {
    }
}

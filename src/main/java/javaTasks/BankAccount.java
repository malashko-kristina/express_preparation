package javaTasks;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class BankAccount {
    protected int accountNumber;
    protected double balance;

    public double deposit(double amount) {
        return this.balance + amount;
    }

    public String withdraw(double amount) {
        if (this.balance >= amount) {
            return "Your balance: "+ (this.balance - amount);
        } return "There is no money on your balance";
    }
}

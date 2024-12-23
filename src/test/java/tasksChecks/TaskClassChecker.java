package tasksChecks;

import javaTasks.BankAccount;
import javaTasks.Item;
import javaTasks.Rectangle;

public class TaskClassChecker {
    public static void main(String[] args) {
//        Rectangle newRectangle = new Rectangle(12, 2);
//        System.out.println(newRectangle.calculateArea());
//        System.out.println(newRectangle.calculatePerimeter());
//
//        BankAccount newBankAccount = new BankAccount(1999, 100.0);
//        System.out.println(newBankAccount.getAccountNumber());
//        System.out.println(newBankAccount.withdraw(102));
//        System.out.println(newBankAccount.deposit(50.45));
//        System.out.println(newBankAccount.getBalance());

        Item newItem = new Item("chocolate", 3.67, 10);
        System.out.println(newItem.getName());
        System.out.println(newItem.sell(10));
        System.out.println(newItem.restock(5));
        System.out.println(newItem.sell(10));
        System.out.println(newItem.getQuantity());

    }
}

package javaTasks.bank;

public class Main {
    public static void main(String[] args) {
        // Массив счетов
        BankAccount[] accounts = new BankAccount[2];

        // Создаем разные типы счетов
        accounts[0] = new SavingsAccount("S001", 1800);
        accounts[1] = new CheckingAccount("C007", 386.89);

        for (BankAccount account: accounts) {
            System.out.println("Account name: " + account.getAccountNumber());
            System.out.println("Account balance before interest: " + account.getBalance());

            account.calculateInterest();

            System.out.println("Balance after interests: " + account.getBalance());
            System.out.println("---------------------------");

        }
    }
}

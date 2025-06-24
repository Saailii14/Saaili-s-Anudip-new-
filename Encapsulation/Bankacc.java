
package Encapsulation;
class BankAccount {
    private String accountHolder;
    private double balance;

    // Setter for accountHolder
    public void setAccountHolder(String name) {
        this.accountHolder = name;
    }

    // Getter for accountHolder
    public String getAccountHolder() {
        return accountHolder;
    }

    // Setter for balance
    public void setBalance(double amount) {
        if (amount >= 0) {
            this.balance = amount;
        }
    }

    // Getter for balance
    public double getBalance() {
        return balance;
    }

    // Deposit method
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    // Withdraw method
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        }
    }
}

public class Bankacc {
    public static void main(String[] args) {
        BankAccount saaili = new BankAccount();
        saaili.setAccountHolder("Saaili");
        saaili.setBalance(1000);
        saaili.deposit(300);
        saaili.withdraw(200);

        System.out.println("Account Holder: " + saaili.getAccountHolder());
        System.out.println("Final Balance: ₹" + saaili.getBalance());
    }
}

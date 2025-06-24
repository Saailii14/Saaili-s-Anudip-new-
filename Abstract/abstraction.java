package Abstract;
abstract class ATM {
    abstract void withdraw(double amount);
    abstract void checkBalance();
}

class MyATM extends ATM {
    double balance = 5000;

    @Override
    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Rs " + amount + " withdrawn");
        } else {
            System.out.println("Not enough balance");
        }
    }

    @Override
    void checkBalance() {
        System.out.println("Balance: Rs " + balance);
    }
}

public class abstraction {
    public static void main(String[] args) {
        MyATM atm = new MyATM();
        atm.checkBalance();      // Balance: Rs 5000
        atm.withdraw(1000);      // Rs 1000 withdrawn
        atm.checkBalance();      // Balance: Rs 4000
    }
}

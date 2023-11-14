package session10.practice.bank_account;

public class BankAccount {                               //encapsulare

    private double balance;

    public void deposit(double amount) {                        //prima metoda         //un fel de setter
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited " + amount);
        } else {
            System.out.println("the amount is invalid");
        }

    }

    public void withdraw(double amount) {                            //un fel de setter
        if (amount < balance && amount > 0) {
            balance -= amount;
            System.out.println("Withdrew " + amount);
        } else {
            System.out.println("The amount is invalid");


        }
    }

    public double checkBalance(){                       //un fel de getter
        return balance;
    }
}



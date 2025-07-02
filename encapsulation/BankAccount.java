package oops.encapsulation;

abstract class BankAccount {
    private String accountNumber;
    private String holderName;
    protected double balance;

    public BankAccount(String accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) balance += amount;
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) balance -= amount;
    }

    public abstract double calculateInterest();
}

interface Loanable {
    boolean applyForLoan(double amount);
    boolean calculateLoanEligibility();
}

class SavingsAccount extends BankAccount implements Loanable {
    public SavingsAccount(String acc, String name, double balance) {
        super(acc, name, balance);
    }

    public double calculateInterest() {
        return balance * 0.04;
    }

    public boolean applyForLoan(double amount) {
        return calculateLoanEligibility();
    }

    public boolean calculateLoanEligibility() {
        return balance >= 5000;
    }
}

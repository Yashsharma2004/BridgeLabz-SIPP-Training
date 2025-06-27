package oops.principles;

class Customer {
    String name;
    double balance;

    Customer(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    void viewBalance() {
        System.out.println(name + "'s Balance: ₹" + balance);
    }
}

class Bank {
    String name;

    Bank(String name) {
        this.name = name;
    }

    void openAccount(Customer customer) {
        System.out.println("Account opened for " + customer.name + " at " + name);
    }
}

public class AssociationDemo {
    public static void main(String[] args) {
        Bank bank = new Bank("HDFC Bank");
        Customer c1 = new Customer("Aman", 5000);
        Customer c2 = new Customer("Neha", 7000);

        bank.openAccount(c1);
        bank.openAccount(c2);

        c1.viewBalance();
        c2.viewBalance();
    }
}


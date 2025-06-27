package oops.principles;

import java.util.*;

class Product {
    String name;
    double price;

    Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    void show() {
        System.out.println(name + " - ₹" + price);
    }
}

class Order {
    int orderId;
    List<Product> products;

    Order(int orderId) {
        this.orderId = orderId;
        products = new ArrayList<>();
    }

    void addProduct(Product p) {
        products.add(p);
    }

    void showOrder() {
        System.out.println("Order ID: " + orderId);
        for (Product p : products) {
            p.show();
        }
    }
}

class Customer {
    String name;
    List<Order> orders;

    Customer(String name) {
        this.name = name;
        orders = new ArrayList<>();
    }

    void placeOrder(Order o) {
        orders.add(o);
        System.out.println(name + " placed Order ID: " + o.orderId);
    }

    void viewOrders() {
        System.out.println(name + "'s Orders:");
        for (Order o : orders) {
            o.showOrder();
        }
    }
}

public class ECommerceDemo {
    public static void main(String[] args) {
        Customer c1 = new Customer("Aarav");

        Product p1 = new Product("Laptop", 55000);
        Product p2 = new Product("Mouse", 500);
        Product p3 = new Product("Headphones", 1500);

        Order o1 = new Order(101);
        o1.addProduct(p1);
        o1.addProduct(p2);

        Order o2 = new Order(102);
        o2.addProduct(p3);

        c1.placeOrder(o1);
        c1.placeOrder(o2);

        c1.viewOrders();
    }
}


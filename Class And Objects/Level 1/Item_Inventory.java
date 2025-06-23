package class_and_obj;

import java.util.*;
class Item{
    int code;
    String name;
    double price;
    Item(int code,String name,double price){
        this.code=code;
        this.name=name;
        this.price=price;
    }
    double total(int qty){return price*qty;}
    void display(int qty){
        System.out.println("Item Code: "+code);
        System.out.println("Item Name: "+name);
        System.out.println("Unit Price: "+price);
        System.out.println("Quantity: "+qty);
        System.out.println("Total Cost: "+total(qty));
    }
}
public class Item_Inventory{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int code=sc.nextInt();
        sc.nextLine();
        String name=sc.nextLine();
        double price=sc.nextDouble();
        int qty=sc.nextInt();
        Item it=new Item(code,name,price);
        it.display(qty);
    }
}


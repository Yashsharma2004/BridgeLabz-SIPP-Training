package class_and_obj;

import java.util.*;
class CartItem{
    String name;
    double price;
    int qty;
    CartItem(String n,double p,int q){
        name=n;price=p;qty=q;
    }
    double subtotal(){return price*qty;}
}
public class Shopping_Cart{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        List<CartItem> cart=new ArrayList<>();
        while(true){
            int ch=sc.nextInt();
            if(ch==1){
                sc.nextLine();
                String n=sc.nextLine();
                double p=sc.nextDouble();
                int q=sc.nextInt();
                cart.add(new CartItem(n,p,q));
            }else if(ch==2){
                sc.nextLine();
                String n=sc.nextLine();
                cart.removeIf(it->it.name.equalsIgnoreCase(n));
            }else if(ch==3){
                double total=0;
                for(CartItem it:cart)total+=it.subtotal();
                System.out.println("Total Cost: "+total);
            }else break;
        }
    }
}


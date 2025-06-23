package class_and_obj;

import java.util.*;
class BankAccount{
    String holder;
    long number;
    double balance;
    BankAccount(String h,long n,double b){
        holder=h;number=n;balance=b;
    }
    void deposit(double amt){balance+=amt;}
    boolean withdraw(double amt){
        if(amt>balance)return false;
        balance-=amt;
        return true;
    }
    void display(){System.out.println("Balance: "+balance);}
}
public class ATM_Calc{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String holder=sc.nextLine();
        long num=sc.nextLong();
        double bal=sc.nextDouble();
        BankAccount acc=new BankAccount(holder,num,bal);
        while(true){
            int ch=sc.nextInt();
            if(ch==1)acc.deposit(sc.nextDouble());
            else if(ch==2){
                if(!acc.withdraw(sc.nextDouble()))System.out.println("Insufficient Balance");
            }else if(ch==3)acc.display();
            else break;
        }
    }
}


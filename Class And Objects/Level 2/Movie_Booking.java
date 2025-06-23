package class_and_obj;

import java.util.*;
class MovieTicket{
    String movie;
    int seat;
    double price;
    MovieTicket(String movie){this.movie=movie;}
    void book(int seat,double price){
        this.seat=seat;
        this.price=price;
    }
    void display(){
        System.out.println("Movie: "+movie);
        System.out.println("Seat: "+seat);
        System.out.println("Price: "+price);
    }
}
public class Movie_Booking{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String movie=sc.nextLine();
        int seat=sc.nextInt();
        double price=sc.nextDouble();
        MovieTicket t=new MovieTicket(movie);
        t.book(seat,price);
        t.display();
    }
}

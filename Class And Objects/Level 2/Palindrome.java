package class_and_obj;

import java.util.*;
class PalindromeChecker{
    String text;
    PalindromeChecker(String t){text=t;}
    boolean isPalindrome(){
        StringBuilder sb=new StringBuilder(text).reverse();
        return text.equalsIgnoreCase(sb.toString());
    }
    void display(){
        System.out.println(isPalindrome()?"Palindrome":"Not Palindrome");
    }
}
public class Palindrome{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String txt=sc.nextLine();
        PalindromeChecker pc=new PalindromeChecker(txt);
        pc.display();
    }
}


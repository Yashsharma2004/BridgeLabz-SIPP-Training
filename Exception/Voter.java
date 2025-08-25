package Exception;
import java.util.*;
public class Voter {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Age :");
        int age= sc.nextInt();
        try{
            if(age<18){
                throw new NonValidVoterException("Not a Valid Voter");
            }

        }
         catch(NonValidVoterException e){
            e.printStackTrace();
             //System.out.println(e.getMessage());
         }
    }
}

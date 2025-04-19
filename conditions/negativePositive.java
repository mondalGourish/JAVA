import java.util.*;

public class negativePositive {
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = sc.nextInt();
        if(number>0){
            System.out.println("It is a positive number.");
        }else if(number<0){
            System.out.println("It is a negative number.");
        }else if(number == 0){
            System.out.println("It is a neutral number.");

        }else{
            System.out.println("Enter a valid number.");

        }



    }
    
}

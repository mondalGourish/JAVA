//1️⃣5️⃣ Find GCD of two numbers
import java.util.*;

public class gcd {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number1: ");
        int n1 = sc.nextInt();
        System.out.print("Enter the number2: ");
        int n2 = sc.nextInt();
        // if(n1<n2){
        //     int temp = n1;
        //     n1 = n2;
        //     n2 = temp;
        // }
        // while(n2 != 0 ){
        //     int temp = n2;
        //     n2 = n1%n2;
        //     n1 = temp;
        // }
        // System.out.print(n1);
        while(n1>0 && n2>0){
            if(n1>n2){
                n1 = n1%n2;
            }else{
                n2 = n2%n1;
            }
        }
        if(n1 == 0){
                System.out.print(n2);
            }else{
                System.out.print(n1);
            }

    }
}

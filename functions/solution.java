import java.util.*;

public class solution {
    public static boolean isEven(int num){
        if(num%2 == 0){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a= sc.nextInt();
        if(isEven(a)){
            System.out.println("The number is even");
        }else{
            System.out.println("The number is odd");

        }

    }
    
}

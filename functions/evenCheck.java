import java.util.*;
public class evenCheck {
    public static boolean isEven(int n){
        
        if(n%2 == 0){
            return true;
        }else{
            return false;
        }
        
    }
    public static void  main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        int n = sc.nextInt();
        if(isEven(n)){
            System.out.print("It is an even number.");
        }else{
            System.out.print("It is an odd number.");
        }

    }
    
}

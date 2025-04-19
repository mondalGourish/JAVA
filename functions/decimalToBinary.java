import java.util.*;

public class decimalToBinary {
    public static void binary(int n){
        int myNum = n;
        int binNum = 0;
        int pow = 0;
        while(n>0){
            int rem = n%2;
            binNum = binNum + (rem * (int)Math.pow(10,pow));
            pow++;
            n = n/2;
        }
        System.out.println("Binary of "+myNum+" is "+ binNum );
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
         System.out.print("Enter the number:");
         int n = sc.nextInt();
         binary(n);
    }
    
}

import java.util.*;

public class binaryToDecimal {
    public static void  decimal(int n){
        int myNum = n;
        int pow=0;
        int decNum=0;
        while(n>0){
            int lastDigit = n%10;
            decNum = decNum +(lastDigit * (int)Math.pow(2,pow));
            pow++;
            n = n/10;

        }
        System.out.println("Decimal of "+ myNum +" is "+ decNum);
        

        

    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
         System.out.print("Enter the number:");
         int n = sc.nextInt();
        decimal(101);
    }
    
}

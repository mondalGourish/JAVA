//8️⃣ Find sum of digits
import java.util.*;
public class sumOfDigits{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:");
        int n = sc.nextInt();
        int sum = 0;
        while(n!=0){
            int lastDig = n%10;
            sum += lastDig;
            n/=10;
        }
        System.out.print("Sum of digits is "+sum);
    }
}
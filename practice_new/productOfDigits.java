//9️⃣ Find product of digits
import java.util.*;
public class productOfDigits{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        int mul = 1;
        while(n!=0){
            int lastDig = n%10;
            mul *= lastDig;
            n/=10;
        }
        System.out.print("The product of digits is: "+mul);

        
    }
}

//6️⃣ Reverse a number
import java.util.*;
public class reverse {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        int n = sc.nextInt();
        int rev = 0;
        int num = n;
        while(n!=0){
            int lastDig = n%10;
            rev = rev*10+lastDig;
            n/=10;
        }
        System.out.print("The reverse of " +num+ " is "+rev);
    }
    
}

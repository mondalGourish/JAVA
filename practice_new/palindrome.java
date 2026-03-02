//7️⃣ Check if number is palindrome
import java.util.*;

public class palindrome {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:");
        int n = sc.nextInt();
        int rev = 0;
        int num = n;
        while(n!=0){
            int lastDig = n%10;
            rev = rev*10 + lastDig;
            n = n/10;
        }
        if(num == rev){
            System.out.print(num+" is palindrome ");
        }else{
            System.out.print(num+" is not palindrome");
        }
    }
    
}

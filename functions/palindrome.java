import java.util.*;

public class palindrome {
    public static void isPalindrome(int n){
        int num = n;
        int rev =0;
        int rem ;
        while(n>0){
            rem = n%10;
            rev = rev*10 + rem;
            n = n/10;

        }
        if(rev == num){
            System.out.print("It is a palindrome number.");

        }else{
            System.out.print("It is not a  palindrome number.");
            

        }

    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a= sc.nextInt();
        isPalindrome(a);
    }
}

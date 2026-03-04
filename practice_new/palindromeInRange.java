//find all the palindrome number in given range.
import java.util.*;
public class palindromeInRange {
    public static boolean isPalindrome(int n){
        int num = n;
        int rev = 0;
        while(n != 0){
            int digit = n%10;
            rev = rev*10 + digit;
            n = n/10;
        }
        if(rev == num){
            return true;
        }else{
            return false;
        }
    }
    public static void printPalindrome(int min, int max){
        for(int i=min; i<=max; i++){
            if(isPalindrome(i)){
                System.out.print(i+" ");
            }
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the min range: ");
        int n = sc.nextInt();
        System.out.print("Enter the max range: ");
        int m = sc.nextInt();
        printPalindrome(n,m);
    }
}

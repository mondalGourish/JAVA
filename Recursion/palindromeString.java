import java.util.*;
public class palindromeString {
    public static boolean isPalindrome(int i, String s){
        int n = s.length();
        if(i>=n/2) return true;

        if(s.charAt(i) != s.charAt(n-i-1)) return false;

        return isPalindrome(i+1, s);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        if(isPalindrome(0,s)){
            System.out.print("palindrome");
        }else{
            System.out.print("Not palindrome");
        }
    }
}

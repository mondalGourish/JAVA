import java.util.*;

public class solution {
    public static int palindrome(int n){
        int rev = 0;
        while(n>0){
            int lastDig = n%10;
            rev = rev*10 + lastDig;
            n/=10;
        }
        return rev;    
}
        


    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number: ");
    int m = sc.nextInt();
    int myNum = m;
    int rev = palindrome(m);
    if(myNum == rev){
        System.out.print("It is a palindrome.");

    }else{
        System.out.print("it is not a palindrome.");
    }
    
    

    
    
    
}
    
}

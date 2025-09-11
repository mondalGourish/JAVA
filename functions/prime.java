import java.util.*;
public class prime {
    public static boolean isPrime(int n){
        boolean isPrime = true;
        for(int i =2; i<=n-1; i++){
            if(n%i == 0){
                isPrime = false;
            }
        }
        return isPrime;

    }
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number: ");
    int n = sc.nextInt();
    boolean x = isPrime(n);
    if(x==true){
        System.out.println("Is is a prime number.");
    }else{
        System.out.println("It is not a prime number");
    }
}
}

import java.util.*;
public class primeNumber{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        if(n == 2){
            System.out.print("It is a prime number");
        }else if(n <= 1){
            System.out.print("It is not a prime number");
        }else{
            boolean isPrime = true;
            for(int i=2; i<=Math.sqrt(n); i++){
                if(n%i == 0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime){
                System.out.print("It is a prime number");
            }else{
                System.out.print("It is not a prime number");
 
            }
        }
    }
}
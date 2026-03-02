//1️⃣2️⃣ Print all Prime numbers till N
import java.util.*;

public class primeUptoN {
    public static boolean isPrime(int n){
        if(n <= 1){
            return false;
        }
        for(int i=2; i<=Math.sqrt(n); i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
    public  static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the last number: ");
        int n = sc.nextInt();
        for(int i=2; i<=n; i++){
            if(isPrime(i)){
                System.out.print(i+" ");
            }
        }

    }
}

//to find the numbers of primes upto n 

import java.util.*;
public class sieveOfEratosthenes {
        public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();

        boolean[] isPrime = new boolean[n+1];
        Arrays.fill(isPrime,true);
        int count = 0;
        if(n >= 0) isPrime[0] = false;
        if(n >= 1) isPrime[1] = false;

        for(int i=2; i<Math.sqrt(n); i++){
            if(isPrime[i]){
                for(int j = i*i; j<=n; j+=i){
                    isPrime[j] = false;
                }
            }
        }
        System.out.print("The prime numbers upto "+n+" are : ");
        for(int i=2; i<=n; i++){
            if(isPrime[i]){
                count++;
                System.out.print(i+" ");
            }
        }
        System.out.println();

        System.out.print("The count of prime numbers are: "+count);

    }
}

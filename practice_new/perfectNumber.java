//1️⃣4️⃣ Check if number is Perfect number (6 → true, because 1+2+3 = 6)
import java.util.*;

public class perfectNumber {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        int sum = 1;
        for(int i=2; i<n; i++){
            if(n%i == 0){
                sum += i;
            }
            if(i != n/i){ //avoids double adding like 6*6 = 36
                sum += n/i;
            }
        }
        if(sum == n){
            System.out.print(n+" is a perfect number");
        }else{
            System.out.print(n+" is not a perfect number");
        }
    }
}

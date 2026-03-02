//3️⃣ Print sum of first N natural numbers
import java.util.*;

public class sumOfNum {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the last number:");
        int n = sc.nextInt();
        int sum = 0;
        for(int i=1; i<=n; i++){
            sum+=i;
        }
        System.out.print("The sum is:" + sum);

    }
    
}



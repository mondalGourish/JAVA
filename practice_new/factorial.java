//1️⃣3️⃣ Find factorial of a number
import java.util.*;

public class factorial {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        int fact = 1;
        for(int i=1; i<=n; i++){
            fact *= i;
        }
        System.out.print("The factorial of "+ n +" is "+fact);
    }
}

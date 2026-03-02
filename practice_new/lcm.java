//1️⃣6️⃣ Find LCM of two numbers
import java.util.*;

public class lcm {
    public static int gcd(int a, int b){
        while(b != 0){
            int temp = b;
            b = a%b;
            a = temp;
        }
        return a;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number1: ");
        int n1 = sc.nextInt();
        System.out.print("Enter the number2: ");
        int n2 = sc.nextInt();
        int gcd = gcd(n1,n2);
        int lcm = n1*n2/(gcd);
        System.out.print(lcm);
    }
    
}

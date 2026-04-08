import java.util.*;

public class factorial {
    public static int factorial(int n){
        if(n == 0){
            return 1;
        }
        int factnm1 = factorial(n-1);
        int fact = n*factnm1;
        return fact;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(factorial(n));
    }
}

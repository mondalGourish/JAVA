import java.util.*;
public class fibonacci {
    public static int fibonacci(int n){
        if(n == 0 || n == 1){
            return n;
        }
        int fibnm1 = fibonacci(n-1);
        int fibnm2 = fibonacci(n-2);
        int fib = fibnm1 + fibnm2;
        return fib;

    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(fibonacci(n));
    }
}

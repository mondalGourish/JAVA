import java.util.*;

public class factorial {
    public static int fact(int n){
        int f = 1;
        for(int i =1; i<=n; i++){
            f *= i;
        }
        return f;

        
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        //int factorial = fact(num);
        System.out.println("Factorial is "+ fact(num) );


    }
}


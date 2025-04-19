import java.util.*;

public class binomial {
    public static int fact(int n){
        int f = 1;
        for(int i =1; i<=n; i++){
            f *= i;
        }
        return f;
    }
    public static int bincoeff(int n, int r){
        int n_fact = fact(n);
        int r_fact = fact(r);
        int nr_fact = fact(n-r);

        int bincoeff = n_fact/(r_fact * nr_fact);
        return bincoeff;

    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();

        System.out.println("Binomial coefficient is "+ bincoeff(n,r) );
    }
    
}

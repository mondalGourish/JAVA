import java.util.*;
public class powerOfN {
    public static int power(int x, int n){
        if(n == 0) return 1;

        int nm1 = power(x,n-1);
        int ans = x * nm1;

        return ans;
    }

    public static int powerOptimized(int x, int n){
        if(n == 0) return 1;

        int half = powerOptimized(x,n/2);

        if(n%2 == 0){
            return half*half;
        }else{
            return x*half*half;
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();
        
        //System.out.print(power(x,n));
        System.out.print(powerOptimized(x,n));


    }
}

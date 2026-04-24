import java.util.*;
public class sumOfN {
    public static int sum(int n){
        if(n == 1){
            return 1;
        }
        int sumnm1 = sum(n-1);
        int sum = n+sumnm1;
        return sum;
        
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(sum(n));
    }
}

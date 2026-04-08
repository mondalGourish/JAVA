import java.util.*;
public class printIncreDecre {
    public static void decrement(int n){
        if(n == 1){
            System.out.print(n);
            return;
        }
        System.out.print(n+" ");
        decrement(n-1);
    }
    public static void increment(int n){
        if(n == 1){
            System.out.print(n+" ");
            return;
        }
        increment(n-1);
        System.out.print(n+" ");
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        decrement(n);
        System.out.println();
        increment(n);
        
        
    }
}

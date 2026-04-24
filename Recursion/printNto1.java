import java.util.*;

public class printNto1 {
    public static void Nto1(int n){
        if(n == 1){
            System.out.print(n+" ");
            return;
        }
        Nto1(n-1);
        System.out.print(n+" ");
    }
    public static void OneToN(int n){
        if(n == 1){
            System.out.print(n);
            return;
        }
        System.out.print(n+" ");
        OneToN(n-1);
    }

    public static void printInIncreasingOrder(int i, int n){
        if(i>n) return;
        System.out.print(i+" ");
        printInIncreasingOrder(i+1,n);
    }
    public static void printInDecreasingOrder(int i, int n){
        if(i<1) return;
        System.out.print(i+" ");
        printInDecreasingOrder(i-1,n);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Nto1(n);
        System.out.println();
        OneToN(n);

        System.out.println();
        System.out.println();
        printInIncreasingOrder(1,n);
        System.out.println();
        printInDecreasingOrder(n,n); 


    }
}

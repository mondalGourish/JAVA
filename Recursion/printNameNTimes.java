import java.util.*;
public class printNameNTimes{
    public static void printName(int n){
        if(n == 0){
            return;
        }
        System.out.println("Gourish");
        printName(n-1);
    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        printName(n);
    }
}
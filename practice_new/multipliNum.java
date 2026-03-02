import java.util.*;

public class multipliNum {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number for the multiplication table:");
        int n = sc.nextInt();
        System.out.print("Enter the number upto which you need the table:");
        int m = sc.nextInt();
        for(int i=1; i<=m; i++){
            System.out.println(n + "*" + i + "=" + n*i);
        }
    }
    
}

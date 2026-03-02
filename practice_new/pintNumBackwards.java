//2️⃣ Print numbers from N to 1
import java.util.*;

public class pintNumBackwards {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the last number:");
        int n = sc.nextInt();
        for(int i=n; i>0; i--){
            System.out.print(i+" ");
        }
    }
}

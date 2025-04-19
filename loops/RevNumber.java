import java.util.*;

public class RevNumber {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();
        
        while(num > 0){
            int rev = num % 10;
            System.out.print(rev);

            num /= 10;

        }
        System.out.println();

    }
    
}

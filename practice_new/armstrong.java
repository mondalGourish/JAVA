//🔟 Check if number is Armstrong (3-digit)
//the cube of the individual digits will be equal to the number itself
import java.util.*;
public class armstrong {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");;
        int n = sc.nextInt();
        int num = n;
        int sum = 0;
        while(n!=0){
            int lastDig = n%10;
            sum = sum+(lastDig*lastDig*lastDig);
            n/=10;

        }
        if(sum == num){
            System.out.print(num+" is armstrong");
        }else{
            System.out.print(num+" is not armstrong");
           
        }
    }
}

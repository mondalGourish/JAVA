import java.util.*;

public class sumOddEven {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number upto which you want sum:");
        int num = sc.nextInt();
        int evenSum=0;
        int oddSum=0;
        for(int i=1; i<=num; i++){
            if(i%2 == 0){
                evenSum += i;
            }else{
                oddSum += i;
            }
        }
        System.out.println("The sum of even numbers is: "+evenSum);
        System.out.println("The sum of odd numbers is: "+oddSum);



    }
    
}

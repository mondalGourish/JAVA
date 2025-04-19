import java.util.*;

public class sum_n_nos {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int num = 1;
        int sum =0;
        System.out.println("Enter the number upto which you want to print: ");
        int lastNum = sc.nextInt();
        while(num<=lastNum){
            sum += num;
            
            num++;
        }
        System.out.println("The sum is " + sum);
    }
    
}

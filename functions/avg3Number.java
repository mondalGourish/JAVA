import java.util.*;

public class avg3Number {
    public static void average(int a, int b, int c){
        int avg = (a+b+c)/3;
        System.out.println("The average of three numbers is "+avg);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the 1st no.: ");
        int a= sc.nextInt();
        System.out.print("Enter the 1st no.: ");
        int b= sc.nextInt();
        System.out.print("Enter the 1st no.: ");
        int c= sc.nextInt();
        average(a,b,c);


    }
    
}

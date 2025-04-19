
import java.util.*;

public class taxCalculator {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int income = sc.nextInt();
        int tax;
        if(income<500000){
            tax = (int)(income*0.05);
            System.out.println("Tax is"+ tax);
        }
        else if(income>=500000 && income<1000000){
            tax =(int) (income*0.10);
            System.out.println("Tax is"+ tax);
        }
        else if(income>=1000000){
            tax =(int) (income*0.20);
            System.out.println("Tax is"+ tax);
        }
        else{
            System.out.println("You are not eligible in tax slab.  ");
        }
    }
    
}

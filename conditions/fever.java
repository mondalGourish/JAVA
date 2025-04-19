import java.util.*;

public class fever {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
            System.out.println("Enter the body temperature:");
            float temp = sc.nextFloat();
            if(temp>100){
                System.out.println("You have fever.");
            }else{
                System.out.println("You are perfectly fine.");
            }

        }

        
    }
    


import java.util.*;

public class quadrant {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter X:");
        int x = sc.nextInt();
        System.out.println();
        System.out.print("Enter Y:");
        int y = sc.nextInt();
        System.out.println();
        if(x>0){
            if(y>0){
                System.out.println("Present in 1st quadrant");
            }else{
                System.out.println("Present in 4th quadrant");

            }
            
            
        }else{
            if(y>0){
                System.out.println("Present in 2nd quadrant");

            }else{
                System.out.println("Present in 3rd quadrant");

            }
        }

        sc.close();
    }
    
}

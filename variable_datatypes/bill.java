import java.util.*;

public class bill {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the cost of a pencil: ");
        float a = sc.nextFloat();
        System.out.println("Enter the cost of a pen: ");
        float b = sc.nextFloat();
        System.out.println("Enter the cost of a eraser: ");
        float c = sc.nextFloat();
        float total = a+b+c;
        System.out.println("The total bill is:"+total);
        System.out.println("The cost of the bill after applying 18% gst is: ");
        float gst = total + (18*total)/100;
        System.out.println(gst);
    }
    
}

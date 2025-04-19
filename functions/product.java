import java.util.*;
public class product{
    public static int multiply(int a, int b){
        int product = a*b;
        return product;

    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int mul = multiply(a,b);
        System.out.println("The product is "+ mul);

    }
}
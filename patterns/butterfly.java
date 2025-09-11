import java.util.*;
public class butterfly {
    public static void butterflyPattern(int rows){
        //first half outer loop
        for(int i=1; i<=rows; i++){
            //first part of stars
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            //print middle spaces
            for(int j=1; j<=2*(rows-i); j++){
                System.out.print(" ");
            }
            //print second part of stars
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        //for the inverse part
        for(int i=rows; i>=1; i--){
            //first part of stars
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            //print middle spaces

            for(int j=1; j<=2*(rows-i); j++){
                System.out.print(" ");
            }
            //print second part of stars

            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }


    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows:");
        int n = sc.nextInt();
        butterflyPattern(n);
    }
    
}

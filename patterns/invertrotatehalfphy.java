import java.util.*;
public class invertrotatehalfphy {
    public static void invertedRotatedHalfPyramid(int rows){

        //outerloop
        for(int i=1; i<=rows; i++){

        //print spaces
            for(int j=1; j<=rows-i; j++){
                System.out.print(" ");
            }
            //print stars
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
        invertedRotatedHalfPyramid(n);
    }
    
}

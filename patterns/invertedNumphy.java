import java.util.*;
public class invertedNumphy {
    
        public static void invertedNumberPyramid(int rows){

        //outerloop
        for(int i=1; i<=rows; i++){

        //print numbers
            for(int j=1; j<=rows+1-i; j++){
                System.out.print(j);
            }
            
            System.out.println();
        }

    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows:");
        int n = sc.nextInt();
        invertedNumberPyramid(n);
    }
    
}



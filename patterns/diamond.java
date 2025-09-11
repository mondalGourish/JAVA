import java.util.*;

public class diamond {
    public static void diamondPattern(int rows){
            for(int i=1; i<=rows; i++){
               
                //print  spaces
                for(int j=1; j<=rows-i; j++){
                    System.out.print(" ");
                }
                //print  stars
                for(int j=1; j<=2*i-1; j++){
                    System.out.print("*");
                }
                System.out.println();
            }
            for(int i=rows; i>=1; i--){
               
                //print  spaces
                for(int j=1; j<=rows-i; j++){
                    System.out.print(" ");
                }
                //print  stars
                for(int j=1; j<=2*i-1; j++){
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows:");
        int n = sc.nextInt();
        diamondPattern(n);

    }
    
}

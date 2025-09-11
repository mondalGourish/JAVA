import java.util.*;

public class solidRhombus {
        public static void rhombus(int rows){
            for(int i=1; i<=rows; i++){
                
                //print  spaces
                for(int j=1; j<=rows-i; j++){
                    System.out.print(" ");
                }
                //print  stars
                for(int j=1; j<=rows; j++){
                    System.out.print("*");
                }
                System.out.println();
            }
        }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows:");
        int n = sc.nextInt();
        rhombus(n);
    }
    

}

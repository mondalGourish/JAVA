import java.util.*;

public class hollowRhombus {
    public static void rhombus(int rows){
        for(int i=1; i<=rows; i++){
                
                //print  spaces
            for(int j=1; j<=rows-i; j++){
                    System.out.print(" ");
            }
            for(int j=1; j<=rows; j++){
                //check for * print for (i,j)
                if(i == 1 || i == rows || j == 1 || j == rows){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
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


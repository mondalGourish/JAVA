import java.util.*;
public class hollowRec {
    public static void hollowRectangle(int rows, int cols){
        //outer loop
        for(int i=1; i<=rows; i++){
            //inner loop
            for(int j=1; j<=cols; j++){
                //check for * print for (i,j)
                if(i == 1 || i == rows || j == 1 || j == cols){
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
        System.out.print("Enter the number of columns:");
        int m = sc.nextInt();
        hollowRectangle(n,m);

    }
    
    
}

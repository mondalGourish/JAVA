import java.util.*;
public class largestSmallest {
    public static void larSmall(int matrix[][]){
        int x=matrix.length , y=matrix[0].length;
        int a = Integer.MIN_VALUE;
        int b = Integer.MAX_VALUE;
        for(int i=0; i<x; i++){
            for(int j=0; j<y; j++){
                if(a < matrix[i][j]){
                    a = matrix[i][j];
                }
                if(b > matrix[i][j]){
                     b = matrix[i][j];
                }

            }
        }
        System.out.println("The biggest number is: "+a);
        System.out.println("The smallest number is: "+b);

    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int n = sc.nextInt();
        System.out.print("Enter the number of columns: ");
        int m = sc.nextInt();

        int matrix[][] = new int[n][m];

        int x=matrix.length , y=matrix[0].length;

        System.out.print("Enter the elements: ");

        for(int i=0; i<x; i++){
            for(int j=0; j<y; j++){
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("The elements are: ");

        for(int i=0; i<x; i++){
            for(int j=0; j<y; j++){
                System.out.print( matrix[i][j]+" ");
            }
            System.out.println();
        }
        larSmall(matrix);

    }
    
}

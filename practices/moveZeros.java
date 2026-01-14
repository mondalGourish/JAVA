import java.util.Scanner;
public class moveZeros {
    public static void removeZeros(int arr[]){
        int index = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] != 0){
                arr[index] = arr[i];
                index++;
            }
        }
        for(int i=0; i<arr.length; i++){
            if(index<arr.length){
                arr[index] = 0;
                index++;
            }
        }
        
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        //take input
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        //print input
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
        removeZeros(arr);
        System.out.println();
        //after moving zeros
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
    }
    
}

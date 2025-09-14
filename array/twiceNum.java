import java.util.Scanner;

public class twiceNum {
    public static boolean twice(int n[]){
        for(int i=0; i<n.length; i++){
            for(int j=i+1; j<n.length; j++){
                if(n[i]==n[j]){
                    return true;
                }
            }
        }
        return false;
        
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        int numbers[] = new int[n];
        for (int i=0; i<n; i++){
            numbers[i]=sc.nextInt();
        }
        System.out.print("Numbers are: ");
        for(int i=0; i<n; i++){
            System.out.print(numbers[i]+ " ");
        }
        System.out.println();
        if(twice(numbers)){
            System.out.println("Array contains duplicate elements");
        }
        else{
            System.out.println("Array does not contain duplicate elements");
        }       
    }
    
}

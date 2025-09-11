import java.util.*;
public class repeatedNumber {
    public static boolean repeated(int n[]){
        for(int i=0; i<n.length; i++){
            int count = 0;

            for(int j=i; j<n.length; j++){
                if(n[i]==n[j]){
                    count++;
                }
            }
            if(count>1){
                return true;
            }
        }
        
        return false;
        
        
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements:");
        int n = sc.nextInt();
        int numbers[] = new int[n];
        for(int i=0; i<n; i++){
            numbers[i]=sc.nextInt();
        }
        for(int i=0; i<n; i++){
            System.out.print(numbers[i]+" ");
           
        }
        System.out.println();
        if (repeated(numbers)) {
            System.out.println("Array contains duplicates.");
        } else {
            System.out.println("All elements are distinct.");
        }

    }
    
}

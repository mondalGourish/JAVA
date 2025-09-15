import java.util.Scanner;
public class selctionSort {
    public static void sort(int nums[]){
        int n = nums.length;
        for(int i=0; i<n-1; i++){
            int max = i;
            for(int j=i+1; j<n; j++){
                if(nums[max]>nums[j]){
                    max = j;
                }
                
            }
            int temp = nums[max];
            nums[max] = nums[i];
            nums[i] = temp;
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        int num[] = new int[n];
        
        for(int i=0; i<n; i++){
            num[i] = sc.nextInt();
        }

        for(int i=0; i<n; i++){
            System.out.print(num[i]+" ");
        }
        System.out.println();
        System.out.println();
        sort(num);
        System.out.print("Sorted array: ");
        for(int i=0; i<n; i++){
            System.out.print(num[i]+" ");
        }

        sc.close();
    }
    
}

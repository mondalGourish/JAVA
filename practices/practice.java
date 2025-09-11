import java.util.*;
class Practice {  
    public void moveZeroes(int[] nums) {
        int start =0 ,  end = nums.length-1;
        while(start<end){
            if(nums[start]==0){
                int temp = nums[start];
                nums[start] = nums[end];
                nums[end] = temp;
                end--;
            }else{
                start++;
            }
        }
        
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
        Solution sol = new Solution();
        sol.moveZeroes(numbers);
        System.out.print("\nAfter Moving Zeroes: ");
        for (int i = 0; i < n; i++) {
            System.out.print(numbers[i] + " ");
        }

        sc.close();
      }
        
}

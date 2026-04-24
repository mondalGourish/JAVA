import java.util.*;
public class printAllSubsequence {
    public static void printSubsequence(int i, int arr[], ArrayList<Integer>list){
        //base case
        if(i == arr.length){
            System.out.println(list);
            return;
        }
        
        //take case
        list.add(arr[i]);
        printSubsequence(i+1,arr,list);

        //backtrack
        list.remove(list.size()-1);

        //not take case
        printSubsequence(i+1,arr,list);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        int n = sc.nextInt();
        int arr[] = new int[n]; 
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        printSubsequence(0,arr,list);
    }
}

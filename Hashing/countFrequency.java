import java.util.*;
public class countFrequency {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        //this is used for small input constraints
        int hash[] = new int[13];
        for(int i=0; i<n; i++){
            hash[arr[i]]++;
        }


        //for large input constraint we have to use hashmap
        // HashMap<Integer,Integer>map = new HashMap<>();
        // for(int i=0; i<n; i++){
        //     map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        // }

        int q = sc.nextInt();
        for(int i=0; i<q; i++){
            int num = sc.nextInt();
            //System.out.println(map.getOrDefault(num,0));
            System.out.println(hash[num]);
        }
    }
}

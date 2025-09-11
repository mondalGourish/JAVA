import java.util.*;

public class linearSearch {
    public static int search(int numbers[], int key){
        for(int i=0; i<numbers.length; i++){
            if(numbers[i]==key){
            return i;
            }

        }
        return -1;

    }
    public static void main(String args[]){

    Scanner sc = new Scanner(System.in);
    System.out.print("The the size of the array:");
    int n = sc.nextInt();
    int numbers[] =new int[n];
    //taking input
    System.out.println("Enter the elements of array:");
    for(int i=0; i<numbers.length;i++){
        numbers[i]=sc.nextInt();
    }
    System.out.print("The elements of array are: ");
    //printing them
    for(int i=0; i<numbers.length;i++){
        System.out.print("|"+ numbers[i] + "|");
    }
    System.out.println();
    //taking the key
    System.out.print("Enter the key:");
    int key = sc.nextInt();
    int index = search(numbers,key);
    
    if(index == -1){
        System.out.println("NOT FOUND");
    }else{
        System.out.println("index at "+index);

    }
}
    
}

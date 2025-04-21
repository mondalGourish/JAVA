import java.util.*;

import java.util.Scanner;

public class solution {
    
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
          while(n<=1 || n>=10){
            for(int i = 1; i<=10; i++){
                int result = n*i;
                System.out.println(n+ "*" +i+ "=" +result);
            }
          }  
        
    }
}

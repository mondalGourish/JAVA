import java.util.*;
public class characterHashing {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();


        //for lower case letters only
        // int hash[] = new int[26];
        // for(int i=0; i<s.length(); i++){
        //     hash[s.charAt(i)-'a']++;
        // }

        // int q = sc.nextInt();
        // for(int i=0; i<q; i++){
        //     char ch = sc.next().charAt(0);

        //     System.out.println(hash[ch-'a']);

        // }

        //for all characters
        int hash[] = new int[256];
        for(int i=0; i<s.length(); i++){
            hash[s.charAt(i)]++;
        }

        int q = sc.nextInt();
        for(int i=0; i<q; i++){
            char ch = sc.next().charAt(0);
            System.out.println(hash[ch]);
        }
    }
}

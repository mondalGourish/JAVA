import java.util.*;

public class numberinRange {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int num = 1;
        System.out.println("Enter the number upto which you want to print: ");
        int lastNum = sc.nextInt();
        while(num<=lastNum){
            System.out.print(num+ " ");
            num++;
        }
    }
    
}

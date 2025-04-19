import java.util.*;
public class marks {
    public static void main(String args[]){
        int marks[] = new int[10];
        Scanner sc = new Scanner(System.in);
        marks[0] = sc.nextInt();
        marks[1] = sc.nextInt();
        marks[2] = sc.nextInt();
        System.out.println("Physics: "+marks[0]);
        System.out.println("Physics: "+marks[1]);
        System.out.println("Physics: "+marks[2]);
        int sum = marks[0]+marks[1]+marks[2];
        System.out.println("Total: "+sum);
        int percentage = (marks[0]+marks[1]+marks[2])/3;
        System.out.println("Percentage: "+percentage+ "%");



    }

    
}

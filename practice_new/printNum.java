//1️⃣ Print numbers from 1 to N
import java.util.*;
public class printNum{
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the last number upto which you want to print:");
	int n = sc.nextInt();
	for(int i=1; i<=n; i++){
		System.out.print(i+ " ");
	}
	}
}
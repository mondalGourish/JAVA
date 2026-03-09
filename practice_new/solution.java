// //check for palindrome
// import java.util.Scanner;
// public class solution{
// 	public static void main(String args[]){
// 	Scanner sc = new Scanner(System.in);
// 	System.out.print("Enter the number: ");
// 	int n = sc.nextInt();
// 	int num = n;
// 	int rev = 0;
// 	while(n!=0){
// 	int digit = n%10;
// 	rev = rev*10 + digit;
// 	n = n/10;
// 	}
// 	if(rev == num){
// 	System.out.print("Palindrome");
// 	}else{
// 	System.out.print("Not palindrome");
// 	}
// }
// }

//palindrome in given range
// import java.util.Scanner;
// public class solution{

// 	public static boolean isPalindrome(int n){
// 	int num = n;
// 	int rev = 0;
// 	while(n != 0){
// 	int digit = n%10;
// 	rev = rev*10 + digit;
// 	n = n/10;
// 	}
// 	if(rev == num){
// 	return true;
// 	}else{
// 	return false;
// 	}

// 	}
// 	public static void printPalindrome(int min, int max){
// 		for(int i=min; i<=max; i++){
// 			if(isPalindrome(i)){
// 				System.out.print(i+" ");
// 			}
// 		}
// 	}
// 	public static void main(String args[]){
// 		Scanner sc = new Scanner(System.in);
// 		System.out.print("Enter the min range: ");
// 		int n = sc.nextInt();
// 		System.out.print("Enter the max range: ");
// 		int m = sc.nextInt();
// 		printPalindrome(n,m);
// }

	
// }

//check for prime
// import java.util.Scanner;
// public class Main{
//   public static boolean isPrime(int n){
//     if(n<=1){
//       return false;
//     }else if(n == 2){
//       return true;
//     }else{
//       for(int i=2; i*i<=n; i++){
//         if(n%i == 0){
//           return false;
//         }
//       }
//       return true;
//     }
//   }
//   public static void main(String args[]){
//     Scanner sc = new Scanner(System.in);
//     System.out.print("Enter the number: ");
//     int n = sc.nextInt();
//     if(isPrime(n)){
//       System.out.print("It is prime");
//     }else{
//       System.out.print("It is not prime");
//     }
    
//   }
// }

//print primes in range 
// import java.util.Scanner;
// public class solution{
//   public static boolean isPrime(int n){
//     for(int i=2; i*i<=n; i++){
//       if(n%i == 0){
//         return false;
//       }
//     }
//     return true;
//   }
//   public static void printPrime(int min, int max){
//     for(int i=min; i<=max; i++){
//       if(isPrime(i)){
//         System.out.print(i+" ");
//       }
//     }
//   }
  
//   public static void main(String args[]){
//     Scanner sc = new Scanner(System.in);
//     int min = sc.nextInt();
//     int max = sc.nextInt();
//     printPrime(min,max);
    
//   }
// }

//armstrong number
// import java.util.Scanner;
// public class solution{
//   public static void isArmstrong(int n){
//     int sum = 0;
//     int num = n;
//     while(n != 0){
//       int digit = n%10;
//       sum = sum+(digit*digit*digit);
//       n/=10;
//     }
//     if(sum == num){
//       System.out.print("True");
//     }else{
//       System.out.print("False");
//     }
//   }
//   public static void main(String args[]){
//     Scanner sc = new Scanner(System.in);
//     int n = sc.nextInt();
//     isArmstrong(n);
//   }
// }

//perfect number
// import java.util.Scanner;
// public class solution{
//   public static void isPerfect(int n){
//     int sum = 0;
//     for(int i=1; i<n; i++){
//       if(n%i == 0){
//         sum += i;
//       }
//     }
//     if(sum == n){
//       System.out.print("True");
//     }else{
//       System.out.print("False");
//     }
//   }
//   public static void main(String args[]){
//     Scanner sc = new Scanner(System.in);
//     int n = sc.nextInt();
//     isPerfect(n);
//   }
// }

//even or odd
// import java.util.Scanner;
// public class solution{
//   public static void evenOdd(int n){
//     if(n%2 == 0){
//       System.out.print("Even");
//     }else{
//       System.out.print("Odd");
//     }
//   }
//   public static void main(String args[]){
//     Scanner sc = new Scanner(System.in);
//     int n =sc.nextInt();
//     evenOdd(n);
//   }
// }

//positive or negative
// import java.util.Scanner;
// public class solution{
//   public static void positiveNegative(int n){
//     if(n>= 0){
//       System.out.print("positive");
//     }else{
//       System.out.print("negative");
//     }
//   }
//   public static void main(String args[]){
//     Scanner sc = new Scanner(System.in);
//     int n =sc.nextInt();
//     positiveNegative(n);
//   }
// }

//sum upto n natural nos
// import java.util.Scanner;
// public class solution{
//   public static void sumN(int n){
//     int sum = 0;
//     for(int i=1; i<=n; i++){
//       sum += i;
//     }
//     System.out.print(sum);
//   }
//   public static void main(String args[]){
//     Scanner sc = new Scanner(System.in);
//     int n =sc.nextInt();
//     sumN(n);
//   }
// }

//find ap
// import java.util.Scanner;
// public class solution{
//   public static void apSeries(int n, int a, int d){
//     int sum = 0;
//     for(int i=a; i<=n*d; i=i+d){
//       sum += i;
//       System.out.print(i+" ");
//     }
//     System.out.println();
//     System.out.print(sum);
//   }
//   public static void main(String args[]){
//     Scanner sc = new Scanner(System.in);
//     int n =sc.nextInt();
//     int a = sc.nextInt();
//     int d = sc.nextInt();
//     apSeries(n,a,d);
//   }
// }
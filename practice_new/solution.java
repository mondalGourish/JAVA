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

//find ap and sum
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

//find gp and sum
// import java.util.Scanner;
// public class solution{
//   public static void gpSeries(int a, float r, int n){
//     float sum = 0;
//     float term = a;
//     for(int i=0; i<n; i++){
//       System.out.print(term+" ");
//       sum = sum+term;
//       term = term*r;
//     }
//     System.out.println();
//     System.out.print(sum);
//   }
//   public static void main(String args[]){
//     Scanner sc = new Scanner(System.in);
//     int a = sc.nextInt();
//     float r = sc.nextFloat();
//     int n = sc.nextInt();
//     gpSeries(a,r,n);
//   }
// }

//greater among two
// import java.util.Scanner;
// public class solution{
//   public static void greaterTwo(double n, double m){
//     if(n>m){
//       System.out.print(n);
//     }else{
//       System.out.print(m);
//     }
//   }
//   public static void main(String args[]){
//     Scanner sc = new Scanner(System.in);
//     double n = sc.nextDouble();
//     double m = sc.nextDouble();
//     greaterTwo(n,m);
//   }
// }

//greater among 3
// import java.util.Scanner;
// public class solution{
//   public static void greaterThree(double n, double m, double p){
//     if(n>m && n>p){
//       System.out.print(n);
//     }else if(m>p){
//       System.out.print(m);
//     }else{
//       System.out.print(p);
//     }
//   }
//   public static void main(String args[]){
//     Scanner sc = new Scanner(System.in);
//     double n = sc.nextDouble();
//     double m = sc.nextDouble();
//     double p = sc.nextDouble();
//     greaterThree(n,m,p);
//   }
// }

//leap year
// import java.util.Scanner;
// public class solution{
//   public static void leapYear(int n){
//     if((n%4==0)&&(n%100==0) || (n%400 == 0)){
//       System.out.print("yes");
//     }else{
//       System.out.print("no");
//     }
//   }
  
//   public static void main(String args[]){
//     Scanner sc = new Scanner(System.in);
//     int n = sc.nextInt();
//     leapYear(n);
//   }
// }

//reverse
// import java.util.Scanner;
// public class solution{
//   public static void reverse(int n){
//     int rev = 0;
//     while(n!=0){
//       int digit = n%10;
//       rev = rev*10+digit;
//       n /= 10;
//     }
//     System.out.print(rev);
//   }
//   public static void main(String args[]){
//     Scanner sc = new Scanner(System.in);
//     int n = sc.nextInt();
//     reverse(n);
//   }
// }

//maximum and minimum digit in a number
// import java.util.Scanner;
// public class solution{
//   public static void smallerGreater(int n){
//     int minDigit = 9;
//     int maxDigit = 0;
//     while(n != 0){
//       int digit = n%10;
//       if(digit>maxDigit){
//         maxDigit = digit;
//       }
//       if(digit<minDigit){
//         minDigit = digit;
//       }
      
//       n/=10;
//     }
//     System.out.print("MaxDigit:"+maxDigit+" ");
//     System.out.print("MinDigit:"+minDigit);
//   }
//   public static void main(String args[]){
//     Scanner sc = new Scanner(System.in);
//     int n = sc.nextInt();
//     smallerGreater(n);
//   }
// }

//fibonacci
// import java.util.Scanner;
// public class solution{
//   public static void fibonacci(int n){
//     if(n == 0){
//       System.out.print("The fibonacci series upto "+n+" is:");
//       System.out.println(0);
//     }else{
//       int secLast = 0;
//       int last = 1;
//       System.out.println("The fibonacci series upto "+n+" is:");
//       System.out.print(secLast+" "+last+" ");
      
//       int curr;
//       for(int i=2; i<=n; i++){
//         curr = secLast+last;
//         secLast = last;
//         last = curr;
//         System.out.print(curr+" ");
//       }
//     }
//   }
//   public static void main(String args[]){
//     Scanner sc = new Scanner(System.in);
//     int n = sc.nextInt();
//     fibonacci(n);
//   }
// }

//factorial
// import java.util.Scanner;
// public class solution{
//   public static void factorial(int n){
//     int fact = 1;
//     for(int i=1; i<=n; i++){
//       fact *= i;
//     }
//     System.out.print(fact);
//   }
//   public static void main(String args[]){
//     Scanner sc = new Scanner(System.in);
//     int n = sc.nextInt();
//     factorial(n);
//   }
// }
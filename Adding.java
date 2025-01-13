 
import java.io.*;
import java.util.StringTokenizer;
import java.util.Scanner;
 
public class Adding {
	public static void main(String[] args) throws IOException {
		Scanner e = new Scanner(System.in); 
 
		long n = e.nextInt();
		
		
		for (int i = 0; i<n; i++) {
			long o = e.nextLong();      
			long rF = 5;
			long rS = 9; 
			long f = 0; 
			
			//System.out.println("e");
			long c = 0; 
			//int arr[] = new int[amountofDigits(o)]; 
 
			while (o>0) {
				// if (o>=rF*2 && o<= rS*2) {
				// 	//System.out.println(j);
				// 	if (j== amountofDigits(o)-1 && o==9) {
				// 		System.out.println("Yes");
				// 		f = 1;
				// 	}
				// 	else 
				// 	else {
				// 		System.out.println("Yes");
				// 		f=1;
				// 		break;
				// 	}
				// }
				// else {
				// 	rF = rF * 10 + 5;
				// 	rS = rS * 10 + 9;
				// }
 
				long digi = o % 10;
				o/=10; 
				if (c== 0 && digi== 9) {
					f=1; 
				}
				else if (o==0  && digi != 1) {
					f=1; 
				} 
				else if (o != 0 && c != 0 && digi == 0) {
					f=1;
				}
				c++;
			}
			if (f == 0) {
			System.out.println("Yes");
			}
			else {
				System.out.println("No");
			}
			
		
 
		}
		
 
		
	}
 
	public static long amountofDigits(long num) {
		long copy = num;
		long c = 0;
		while (copy>=1) {
		c++;
		copy/=10;
		}
		return c;
  	} 
}
 
 
// import java.util.Scanner;
 
// public class Main {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
        
//         int t = scanner.nextInt();
//         for (int i = 0; i < t; i++) {
//             long x = scanner.nextLong();
//             int digits = String.valueOf(x).length();
           
//             long lowerBound = 10 * (long) Math.pow(10, digits - 1);
//             long upperBound = 18 * (long) Math.pow(10, digits - 1);
            
            
//             if (x >= lowerBound && x <= upperBound) {
//                 System.out.println("YES");
//             } else {
//                 System.out.println("NO");
//             }
//         }
        
//         scanner.close();
//     }
// }
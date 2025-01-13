import java.util.Scanner;
 
public class OptimalMultiples {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
      
        int t = scanner.nextInt();
        
        
        int[] results = new int[t];
        
        
        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            int maxSum = 0;
            int optimalX = 0;
            
            for (int x = 2; x <= n; x++) {
                int k = n / x;
                int currentSum = x * k * (k + 1) / 2;
                
                
                if (currentSum > maxSum) {
                    maxSum = currentSum;
                    optimalX = x;
                }
            }
            
            
            results[i] = optimalX;
        }
        
       
        for (int result : results) {
            System.out.println(result);
        }
        
        scanner.close();
    }
}
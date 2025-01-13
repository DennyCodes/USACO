import java.io.*;
import java.util.StringTokenizer;
import java.util.ArrayList;
 
public class KarinaAndArray {
 
    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
 
        StringTokenizer st = new StringTokenizer(r.readLine());
        long n = Long.parseLong(st.nextToken());
 
        for (long i = 0; i < n; i++) {
            st = new StringTokenizer(r.readLine());
            long k = Long.parseLong(st.nextToken());
            ArrayList<Long> arr = new ArrayList<>();
 
            st = new StringTokenizer(r.readLine());
            for (long j = 0; j < k; j++) {
                arr.add(Long.parseLong(st.nextToken()));
            }
 
            if (k == 2) {
                pw.println(arr.get(0) * arr.get(1));
                continue;
            } else if (k == 3) {
                long x1 = arr.get(0) * arr.get(1);
                long x2 = arr.get(0) * arr.get(2);
                long x3 = arr.get(1) * arr.get(2);
                long maxProduct = Math.max(x1, Math.max(x2, x3));
                pw.println(maxProduct);
                continue;
            } else {
                long ma1 = Long.MIN_VALUE;
                long ma2 = Long.MIN_VALUE;
                long mi1 = Long.MAX_VALUE;
                long mi2 = Long.MAX_VALUE;
 
                for (long j = 0; j < k; j++) {
                    long current = arr.get((int) j);
 
                    
                    if (current > ma1) {
                        ma2 = ma1;
                        ma1 = current;
                    } else if (current > ma2) {
                        ma2 = current;
                    }
 
                    
                    if (current < mi1) {
                        mi2 = mi1;
                        mi1 = current;
                    } else if (current < mi2) {
                        mi2 = current;
                    }
                }
 
                long productMax = ma1 * ma2;
                long productMin = mi1 * mi2;
                pw.println(Math.max(productMax, productMin));
            }
        }
 
        pw.close();
    }
}


// import java.util.*;
// import java.io.*;
 
// public class Solution {
//     public static void main(String[] args) throws IOException {
//         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//         int t = Integer.parseInt(br.readLine());
        
//         while (t-- > 0) {
//             int n = Integer.parseInt(br.readLine());
//             long[] a = new long[n];
//             String[] input = br.readLine().split(" ");
//             for (int i = 0; i < n; i++) {
//                 a[i] = Long.parseLong(input[i]);
//             }
            
//             System.out.println(solve(a, n));
//         }
//     }
    
//     private static long solve(long[] a, int n) {
//         Arrays.sort(a);
//         return Math.max(a[0] * a[1], a[n-1] * a[n-2]);
//     }
// }
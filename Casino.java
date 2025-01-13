 
import java.io.*;
import java.util.StringTokenizer;
import java.util.Scanner;
import java.util.Arrays;
public class Casino {
	public static void main(String[] args) throws IOException {
		Scanner e = new Scanner(System.in);
		// BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		// PrintWriter pw = new PrintWriter(System.out);
 
		// StringTokenizer st = new StringTokenizer(r.readLine());
		int t = e.nextInt();
		long total = 0; 
		// st = new StringTokenizer(r.readLine());
		for (int i = 0; i< t; i++) {
			int n = e.nextInt();
			int m = e.nextInt();
			
			int arr[][] = new int[n][m];
			for (int j = 0; j<n; j++) {
				for (int p =0; p<m; p ++) {
					arr[j][p] = e.nextInt();
				}
			}
 
			if (n==1) {
				System.out.println(0);
				continue;
			}
 
			total = 0; 
			for (int o = 0; o<m; o++) {
				int col[] = new int[n]; 
				for (int j = 0; j<n; j++) {
					col[j] = arr[j][o];
				}
				Arrays.sort(col);
 
				for (int j = 0; j<n; j++) {
					// if (n-1 % 2 == 0)
					total += (long)(col[n-1-j])*(n-1-j);
					total -= (long)(col[n-1-j])*j;
				}
			}
			System.out.println(total); 
		
		}
 
 
		// pw.close();
	}
}
import java.io.*;
import java.util.StringTokenizer;
 
public class alternatingSubsequence {
	public static void main(String[] args) throws IOException {
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(System.out);
 
		StringTokenizer st = new StringTokenizer(r.readLine());
		int t = Integer.parseInt(st.nextToken());
		for (int i = 0; i<t; i++) {
			st = new StringTokenizer(r.readLine());
			int n = Integer.parseInt(st.nextToken());
			int arr[] = new int[n];
			st = new StringTokenizer(r.readLine());
			for (int j =0; j<n; j++) 
				arr[j] = Integer.parseInt(st.nextToken());
			long ans = 0; 
 
			for (int position = 0; position<n;) {
				int biggest = 0; 
				if (arr[position]>0) {
					biggest = 0;
					while (position<n && arr[position] > 0 ) {
						if (arr[position]>biggest) {
							biggest = arr[position];
							// System.out.println(biggest);
						}
						position++; 
					}
 
				}
				else {
					biggest = -1000000000;
					while (position<n && arr[position] < 0 ) {
						if (arr[position]>biggest) {
							biggest = arr[position];
							
						}
						position++; 
					}
				}
				
				ans += biggest;
			}
			System.out.println(ans); 
			
		}
		
		pw.close();
	}
}
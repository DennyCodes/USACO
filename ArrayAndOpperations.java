// Source: https://usaco.guide/general/io

import java.io.*;
import java.util.StringTokenizer;
import java.util.ArrayList;
import java.util.Collections;
// import java.util.ArrayList;
import java.util.Comparator;

public class ArrayAndOpperations {
	public static void main(String[] args) throws IOException {
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
	

		StringTokenizer st = new StringTokenizer(r.readLine());
		int t = Integer.parseInt(st.nextToken());
		for (int i = 0; i<t; i++) {
			// System.out.println(t + " " + i);
			st = new StringTokenizer(r.readLine());
			int n = Integer.parseInt(st.nextToken());
			int k = Integer.parseInt(st.nextToken());
			// int arr[] = new int[n];
			ArrayList<Integer> arr = new ArrayList<Integer>();
			st = new StringTokenizer(r.readLine());
			for (int j =0; j<n; j++) {
				arr.add(Integer.parseInt(st.nextToken()));
			}
			int score = 0; 
			arr.sort(Comparator.naturalOrder());
			// System.out.println(t + " " + i + " " + n + " " + k);
			for (int j = 0; j < k; j++) {
				// compare arr[n-j-1] with arr[n-j-k-1] (k apart)
				// 6-8, 5-7
				score += arr.get(n-j-k-1) / arr.get(n-j-1);
			}
		
			for (int j =0; j < n - 2 * k; j++) {
				score += arr.get(j);
			}
			System.out.println(score); 
		}
		// pw.close();
	}
}

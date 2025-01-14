// Source: https://usaco.guide/general/io

import java.io.*;
import java.util.StringTokenizer;
import java.util.ArrayList; 

public class Make It Good {
	public static void main(String[] args) throws IOException {
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(System.out);

		StringTokenizer st = new StringTokenizer(r.readLine());
		
		int t = Integer.parseInt(st.nextToken());
		for (int i = 0; i<t; i++) { 
			st = new StringTokenizer(r.readLine());
			int n = Integer.parseInt(st.nextToken());
			ArrayList<Integer> arr = new ArrayList<Integer>();
			st = new StringTokenizer(r.readLine());
			for (int j = 0; j<n; j++) {
				arr.add(Integer.parseInt(st.nextToken()));
			}
			boolean print = true; 
			int c = 1; 
			for (int j = arr.size()-1; j>=1; j--) {
				if (print && arr.get(j-1) >= arr.get(j)) {
					c++; 
				}
				else {
					print = false; 
				}
			}
			// System.out.println(c);
			int v = n-c; 
			// int current = c;
			// boolean 
			while (v>=1 && arr.get(v)>=arr.get(v-1)) {
				v--; 
			}
			System.out.println(v);


		}
		pw.close();
	}
}

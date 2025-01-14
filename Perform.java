// Source: https://usaco.guide/general/io

import java.io.*;
import java.util.StringTokenizer;
import java.util.HashMap;
import java.util.Arrays; // import the HashMap class


public class Perform the Combo {
	public static void main(String[] args) throws IOException {
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(System.out);

		StringTokenizer st = new StringTokenizer(r.readLine());
		int t = Integer.parseInt(st.nextToken());
		for (int i = 0; i<t; i++) {
			st = new StringTokenizer(r.readLine());
			int n = Integer.parseInt(st.nextToken());
			int m = Integer.parseInt(st.nextToken());
			HashMap<Character, Integer> map = new HashMap<Character, Integer>();
			String s = r.readLine();
			// System.out.println(s); 
			st = new StringTokenizer(r.readLine());
			int tries[] = new int[m];
			for (int k = 0; k<m; k++) {
				tries[k] = Integer.parseInt(st.nextToken());
			}
			Arrays.sort(tries);

			for (char j = ('a'); j<=('z'); j++) {
				map.put(j, 0); 
			}

			int c = 0; 
			for (int j =0; j<n; j++) {
				while (c < m && tries[c] <= j) {
					c++;
				}
				// add to charAt(j) m - c
				map.put(s.charAt(j), map.get(s.charAt(j))+m-c); 
				
				// String sub = s.substring(0, tries[j]);
				// for (int k = 0; k<sub.length(); k++) {
				// 	map.put(sub.charAt(k), map.get(sub.charAt(k))+1); 
				// }
			}
			
				
			for (int k = 0; k<s.length(); k++) {
				map.put(s.charAt(k), map.get(s.charAt(k))+1); 
			}
			

			for (Integer value : map.values()) {

				System.out.print(value + " "); // Prints each value in the map

			}

			System.out.println(); 



		}




		pw.close();
	}
}

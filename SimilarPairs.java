// Source: https://usaco.guide/general/io
//accepted solution
import java.io.*;
import java.util.StringTokenizer;
import java.util.ArrayList;
import java.util.Collections;

public class SimilarPairs {
	public static void main(String[] args) throws IOException {
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(System.out);

		StringTokenizer st = new StringTokenizer(r.readLine());
		int a = Integer.parseInt(st.nextToken());
		for (int i = 0; i<a; i++) {
			st = new StringTokenizer(r.readLine());
			int b = Integer.parseInt(st.nextToken());
			ArrayList<Integer> arr = new ArrayList<Integer>();
			// ArrayList<Integer> original = new ArrayList<Integer>();
			st = new StringTokenizer(r.readLine());
			for (int j = 0; j<b; j++) {
				int c = Integer.parseInt(st.nextToken());
				arr.add(c);
				// original.add(c);
			}
			ArrayList<Integer> evens = new ArrayList<Integer>();
			ArrayList<Integer> odds = new ArrayList<Integer>();
			ArrayList<Integer> next = new ArrayList<Integer>();
			for (int j = 0; j<b; j++) {
				if (arr.get(j)%2==0) {
					evens.add(arr.get(j));
				}
				else 
					odds.add(arr.get(j)); 
				
			}
			
			if (evens.size()%2==0 && odds.size()%2==0) {
				System.out.println("Yes");
			}
			else {
				Collections.sort(arr);
				boolean ans = false;  
				for (int j =0; j<arr.size()-1; j++) {
					if (arr.get(j+1)-arr.get(j)==1) {
						ans = true;
						break; 
					}
				}
				if (ans) {
					System.out.println("Yes");
				}
				else {
					System.out.println("No");
				}
			}



			// else {
			// 	System.out.println("No");
			// }






		}
		

		pw.close();
	}
}

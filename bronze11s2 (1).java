// Source: https://usaco.guide/general/io

import java.io.*;
import java.util.StringTokenizer;

public class bronze11s2 {
	public static void main(String[] args) throws IOException {
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(System.out);

		StringTokenizer st = new StringTokenizer(r.readLine());
		int t = Integer.parseInt(st.nextToken());

		// int arr[] = new int[t];
		// for (int i = 0; i<t; i++) {
			
		// 	arr[i] = Integer.parseInt(st.nextToken());
		// 	// System.out.println(arr[i]);
		// }

		long total = 0;
		int z =0; 
		for (int j = 0; j<t; j++) {
			st = new StringTokenizer(r.readLine());
			z = Integer.parseInt(st.nextToken());
			total = 0; 
			for (int i = 2; i<=z; i++) {
				long log = (int)(Math.ceil(Math.log10(i))); 
				
				//regular 
				long powerR = (long)(Math.pow(10,log));
				long ansR = Math.round(i / (double)(powerR)) * powerR;
				//chain 
				long tempR = i; 
				for (int p = 1; p<=log; p++) {
					long powerC = (long)(Math.pow(10, p)); 
					tempR = Math.round((double)(tempR) / (double)(powerC)) * powerC; 
				} 
				if (tempR != ansR) {
					total++; 
				}

			}

			System.out.println(total);  

		}
		pw.close();
	}




	
}

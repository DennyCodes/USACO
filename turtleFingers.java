import java.io.*;
import java.util.StringTokenizer;
import java.util.ArrayList;
 
public class turtleFingers {
	public static void main(String[] args) throws IOException {
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(System.out);
 
		StringTokenizer st = new StringTokenizer(r.readLine());
		int n = Integer.parseInt(st.nextToken());
 
		for (int i = 0; i<n; i++) {
			st = new StringTokenizer(r.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int l = Integer.parseInt(st.nextToken());
			//check
			int total = 0; 
			ArrayList<Integer> arr = new ArrayList<Integer>();
			for (int j = 0; j<bigA(a,l); j++) {
				
				for (int p = 0; p<bigB(b,l); p++ ) {
					if ((l % (Math.pow(a,j) * Math.pow(b,p))) == 0 && arr.contains((int)(l/(Math.pow(a,j) * Math.pow(b,p)))) == false) {
						total +=1; 
						arr.add((int)(l/(Math.pow(a,j) * Math.pow(b,p))));
						//System.out.println("a: " + a + " b: " + b + " x: " + j + " y:" + p + " l " + l);
					}
					
				}
 
			}
			System.out.println(total); 
		}
	
		pw.close();
	
	}
 
	public static boolean contain(int x, ArrayList<Integer> arr) {
		for (int a : arr) {
			if (a == x) {
				return true;
			}
		}
		return false; 
	}
	public static int bigA(int a, int l) {
		int i = 0;
		while (Math.pow(a,i)<=l) {
			i++;
		}
		return i; 
	}
	public static int bigB(int b, int l) {
		int i = 0;
		while (Math.pow(b,i)<=l) {
			i++;
		}
		return i; 
	}
}
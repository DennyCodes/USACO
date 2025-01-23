// Source: https://usaco.guide/general/io

import java.util.Scanner; 
import java.util.HashMap;
import java.util.ArrayList; 
public class EvenString {
	public static void main(String[] args){
		Scanner e = new Scanner(System.in);
		int t = e.nextInt();
		//
		for (int i = 0; i<t; i++) {
			HashMap<Character, Integer> map = new HashMap<Character, Integer>();
			String s = e.next(); 
			//  System.out.println(s); 
			// for (int j = 0; j<s.length(); j++) {
			// 	if (!map.containsKey(s.charAt(j))) {
			// 		map.put(s.charAt(j), 1); 
			// 	}
			// 	else {
			// 		map.put(s.charAt(j), map.get(s.charAt(j))+1); 
			// 	}
			// }
			// int r = 0; 
			// for (int value : map.values()) {
			// 	if (value%2==1) {
			// 		r++;
			// 	}
	
			// }	
			// System.out.println(r);
			ArrayList<Character> arr = new ArrayList<Character>();
			int r = 0; 
			boolean cont = false; 
			for (int j = 0; j<s.length(); j++) {
			
				if (arr.contains(s.charAt(j))) {
					// System.out.println("Positions: " + j + " " + s.charAt(j));
					r+= arr.size()-1;
					cont = false;
					arr.clear();
				}else {
					arr.add(s.charAt(j));
				}
				
			}
			r+= arr.size();
			System.out.println(r); 
			// 3
			// 3
			// 2
			// 0
			// 2
			// 7
		}
	}
}

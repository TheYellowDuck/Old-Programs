package Math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Galois_2022_4 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] spec = br.readLine().split(" ");
		char[] a = br.readLine().toCharArray();
		System.out.println(recurse(a, 0, spec[0].charAt(0), 0, Integer.parseInt(spec[1])));
//		char x = 0, y = 0;
//		long total = 1;
//		for (int i = 0; i < a.length; i ++) {
//			if (a[i] != '*') 
//				continue;
//			
////			if (i > 0) x = a[i - 1];
////			if (i < a.length - 1) y = a[i + 1];
////			if (x == '*') x = 0;
////			if (y == '*') y = 0;
////			int c = 5;
////			for (char j = 'A'; j <= 'E'; j ++) 
////				if (j == x || j == y)
////					c --;
//			total *= c;
//		}
//		System.out.println(total);
	}
	
	static long recurse(char[] a, int i, char c, int count, int t) {
		if (i == a.length) {
			if (count >= t) {
				System.out.print(a);
				System.out.println(" " + count);
				return 1;
			}
			else return 0;
		}
		if (a[i] != '*') {
			if (a[i] == c)
				count ++;
			return recurse(a, i + 1, c, count, t);
		}
		char x = 0, y = 0;
		if (i > 0) x = a[i - 1];
		if (i < a.length - 1) y = a[i + 1];
		if (x == '*') x = 0;
		if (y == '*') y = 0;
		long total = 0;
		for (char j = 'A'; j <= 'E'; j ++) {
			if (j == x || j == y)
				continue;
			a[i] = j;
			if (j == c)
				count ++;
			total += recurse(a, i + 1, c, count, t);
			if (j == c)
				count --;
		}
		a[i] = '*';
		return total;
	}

}

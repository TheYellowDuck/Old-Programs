package Other;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sister_Help {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int target = Integer.parseInt(br.readLine());
		String[] in = br.readLine().split(" ");
		int[] a = new int[in.length];
		
		for (int i = 0; i < in.length; i ++) {
			a[i] = Integer.parseInt(in[i]);
		}
		
		int l = 0, r = a.length;
		
		// bid >=
		
		// 10 9 8 7 6 5 4 3 2 1
		
		// 4 2 1
		
		while (l < r) {
			int m = (l + r - 1) / 2;
			if (a[m] < target) 
				r = m;
			else 
				l = m;
			System.out.println(l + " " + r);
		}
		

	}

}

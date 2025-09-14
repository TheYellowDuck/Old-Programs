package programs;

import java.util.ArrayList;

public class EOR {
	public static void main(String[] args) {
		ArrayList<Integer> e=new ArrayList<Integer>();
		ArrayList<Integer> o=new ArrayList<Integer>();
		for (int i=0; i<25; i++) {
			int n=(int)(Math.random()*98)+1;
			if (n%2==0)
				e.add(n);
			else
				o.add(n);
		}
		String even=e.toString().replace("[","").replace("]", "");
		String odd=o.toString().replace("[","").replace("]", "");
		System.out.println("Even: \n"+even);
		System.out.println("Odd: \n"+odd);
	}

}

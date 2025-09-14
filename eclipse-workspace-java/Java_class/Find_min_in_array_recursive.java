package programs;

import java.util.Scanner;

public class Find_min_in_array_recursive {
	static void myMethod(String n) {
		n=n.replaceAll(" ", "");
		String[] array=n.split(",");
		int[] array1=new int[array.length];
		for (int r=0; r<array.length; r++) {
			while (array[r].length()>0) {
				array1[r]=(array1[r]*10)+Integer.parseInt(array[r].substring(0, 1));
				array[r]=array[r].substring(1);
			}
		}
		min(array1, array1[0], 1);
	}
	static void min(int[] n, int b, int r) {
		if (r<n.length) {
			if (b>n[r]) {
				b=n[r];
			}
			min(n, b, r+1);
		}
		if (r==n.length) {
			System.out.println(b);
		}
		return;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input1=new Scanner(System.in);
	    System.out.println("Please Enter Your Desired int Array.");
	    String n=input1.nextLine();
	    myMethod(n);
	}
}

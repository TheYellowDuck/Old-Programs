package programs;

import java.util.Scanner;

public class Sum_of_Elements_in_array_Recursion {
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
		sumMethod(array1, array1.length, 0);
	}
	static void sumMethod(int[] array, int len, int s) {
		int[] array1;
		if (array.length>0) {
			array1=new int[len-1];
			for (int i=1, k=0; i<array.length; i++, k++) { 
	            array1[k]=array[i]; 
	        }
			if (array.length!=0) {
				sumMethod(array1, array1.length, s+array[0]);
			}
		}
		else {
			System.out.println(s);
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

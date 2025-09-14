package programs;

import java.util.Scanner;

public class Palindrome_Recursion {
	static boolean myMethod(String num1, boolean flag, int i, int j) {
		int a=(num1.length()+1)/2;
		num1=num1.toLowerCase();
		String[] array=num1.split("");
		if (array[i].contentEquals(array[j])) {
			flag=true;
			if (i<a) {
				i++;
				j--;
				myMethod(num1, flag, i, j);
			}
		}
		else {
			flag=false;
		}
		return flag;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input1=new Scanner(System.in);
	    System.out.println("Enter a your Palindrome Checker String/Number.");
	    String num1=input1.nextLine();
	    boolean output=myMethod(num1, false, 0, num1.length()-1);
	    System.out.println(output);
	}
}

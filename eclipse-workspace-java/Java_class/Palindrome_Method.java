package programs;

import java.util.Scanner;

public class Palindrome_Method {
	static boolean myMethod(String num1) {
		num1=num1.toLowerCase();
		String[] x=num1.split("");
		String[] check=new String[num1.length()];
		int j=0;
		for (int r=x.length-1; r>-1; r--) {
        	check[j]=x[r];
        	j++;
        }
		boolean flag=false;
		if (x.length==check.length) {
			for (int i=0; i<x.length; i++) {
				flag=false;
				if (x[i].contentEquals(check[i])) {
					flag=true;
				}
				else {
					break;
				}
			}
		}
		return flag;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input1=new Scanner(System.in);
	    System.out.println("Enter a your Palindrome Checker String/Number.");
	    String num1=input1.nextLine();
	    boolean output=myMethod(num1);
	    System.out.println(output);
	}

}

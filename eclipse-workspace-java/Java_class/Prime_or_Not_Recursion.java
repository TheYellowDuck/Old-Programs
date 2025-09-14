package programs;

import java.util.Scanner;

public class Prime_or_Not_Recursion {
	static String myMethod(int n, int i) {
		if (n==1) {
			return "Prime";
		}
		else if (n==2) {
			return "Prime";
		}
		else if (n%i!=0 && i>1 && i<n/2+1) {
		    myMethod(n, i-1);
	    }
	    else {
	    	return "Not Prime";
	    }
	    return "Prime";
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input1=new Scanner(System.in);
	    System.out.println("Please Enter Your Desired Number.");
	    int n=input1.nextInt();
	    String output=myMethod(n, n/2);
	    System.out.println(output);
	}
}

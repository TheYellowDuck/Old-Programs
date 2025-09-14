package programs;

import java.util.Scanner;

public class Recursion_1plustoN {
	static void myMethod(int n, int sum, int i) {
	    if (i<=n) {
	    	sum=sum+i;
	    	i++;
	    	myMethod(n, sum, i);
	    }
	    else {
	    	System.out.println(sum);
	    }
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input1=new Scanner(System.in);
	    System.out.println("Please Enter Your Desired Number.");
	    int n=input1.nextInt();
	    myMethod(n, 0, 0);
	}
}

package programs;

import java.util.Scanner;

public class Factorial_Method {
	static int myMethod(int n) {
	    if (n!=0){
	    	return n*myMethod(n-1);
	    }
	    else {
	    	return 1;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input1=new Scanner(System.in);
	    System.out.println("Please Enter Your Desired Number.");
	    int n=input1.nextInt();
	    int output=myMethod(n);
	    System.out.println(n+" Factorial="+output);
	}

}

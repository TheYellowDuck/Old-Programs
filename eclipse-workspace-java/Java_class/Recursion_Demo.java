package programs;

import java.util.Scanner;

public class Recursion_Demo {

	static void myMethod(int n) {
	    if (n<1){
	    	return;
	    }
	    else {
	    	System.out.printf("%d", n);
	    	myMethod(n-1);
	    	System.out.printf("%d", n);
	    	return;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input1=new Scanner(System.in);
	    System.out.println("Please Enter Your Desired Number.");
	    int n=input1.nextInt();
	    myMethod(n);
	}

}

package programs;

import java.util.Scanner;

public class Pow_Simulation_Recursion {
	static void myMethod(int n, int m, int sum, int count) {
	    if (count<m){
	    	sum=sum*n;
	    	count++;
	    	myMethod(n, m, sum, count);
	    	return;
	    }
	    else {
	    	System.out.println(n+" to the Power to "+m+"="+sum);
	    	return;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input1=new Scanner(System.in);
	    System.out.println("Please Enter Your Desired Number.");
	    int n=input1.nextInt();
	    System.out.println("Please Enter Your Power Number.");
	    int m=input1.nextInt();
	    int sum=1;
	    int count=0;
	    myMethod(n, m, sum, count);
	}
}

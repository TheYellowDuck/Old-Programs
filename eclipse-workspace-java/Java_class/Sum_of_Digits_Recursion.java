package programs;

import java.util.Scanner;

public class Sum_of_Digits_Recursion {
	static void myMethod(int n, int sum) {
	    if (n!=0){
	    	sum=sum+n%10;
	    	myMethod(n/10, sum);
	    	return;
	    }
	    else {
	    	System.out.println(sum);
	    	return;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input1=new Scanner(System.in);
	    System.out.println("Please Enter Your Desired Number.");
	    int n=input1.nextInt();
	    int sum=0;
	    myMethod(n, sum);
	}
}

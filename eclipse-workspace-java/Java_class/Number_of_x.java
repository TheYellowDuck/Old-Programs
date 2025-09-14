package programs;

import java.util.Scanner;

public class Number_of_x {
	static void myMethod(String n, int count, int count2) {
	    if (count2<n.length()){
	    	if (n.charAt(count2)=='x') {
	    		count++;
	    	}
	    	count2++;
	    	myMethod(n, count, count2);
	    	return;
	    }
	    else {
	    	System.out.println(count);
	    	return;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input1=new Scanner(System.in);
	    System.out.println("Please Enter Your Desired String.");
	    String n=input1.nextLine();
	    int count=0;
	    int count2=0;
	    myMethod(n, count, count2);
	}
}

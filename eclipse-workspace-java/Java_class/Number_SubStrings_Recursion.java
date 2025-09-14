//Finds Number of Substrings In Given String.
package programs;

import java.util.Scanner;

public class Number_SubStrings_Recursion {
	static void myMethod(String n, String m, int count) {
	    if (n.contains(m)){
	    	n=n.substring(n.indexOf(m)+m.length());
	    	count++;
	    	myMethod(n, m, count);
	    	return;
	    }
	    else {
	    	System.out.println("Number is "+count);
	    	return;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input1=new Scanner(System.in);
	    System.out.println("Please Enter Your Desired String.");
	    String n=input1.nextLine();
	    System.out.println("Please Enter Your Desired SubString.");
	    String m=input1.nextLine();
	    int count=0;
	    myMethod(n, m, count);
	}
}

package programs;

import java.util.Scanner;

public class Check_If_String_Only_Contains_Numbers {
	static void myMethod(String n) {
	    try {
	    	Integer.parseInt(n);
	    	System.out.println("String Does Contain Only Numbers");
	    }
	    catch (NumberFormatException nfe) {
	    	System.out.println("String Does Not Contain Only Numbers");
	    }
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input1=new Scanner(System.in);
	    System.out.println("Please Enter Your Desired String.");
	    String n=input1.nextLine();
	    myMethod(n);
	}
}

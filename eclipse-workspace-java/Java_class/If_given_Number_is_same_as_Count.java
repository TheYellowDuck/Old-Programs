package programs;

import java.util.Scanner;

public class If_given_Number_is_same_as_Count {
	static void myMethod(String n, String m, int z, int count) {
	    if (n.contains(m)){
	    	n=n.substring(n.indexOf(m)+m.length());
	    	count++;
	    	myMethod(n, m, z, count);
	    	return;
	    }
	    else {
	    	if (count==z) {
	    		System.out.println("You were Correct");
	    	}
	    	else {
	    		System.out.println("You were Not Correct");
	    	}
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
	    System.out.println("Please Enter Your Number of SubString.");
	    int z=input1.nextInt();
	    int count=0;
	    myMethod(n, m, z, count);
	}
}

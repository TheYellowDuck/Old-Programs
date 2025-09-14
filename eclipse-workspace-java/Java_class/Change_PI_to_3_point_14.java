//Replace All pi with 3.14
package programs;

import java.util.Scanner;

public class Change_PI_to_3_point_14 {
	static void myMethod(String n, String m, String r, String replace) {
	    if (r.contains(m)){
	    	String pi="3.14";
	    	n=n.replaceFirst("pi", pi);
	    	r=r.substring(r.indexOf(m)+m.length());
	    	myMethod(n, m, r, replace);
	    	return;
	    }
	    else {
	    	System.out.println(replace+" is Now equal to "+n);
	    	return;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input1=new Scanner(System.in);
	    System.out.println("Please Enter Your Desired String.");
	    String n=input1.nextLine();
	    String m="pi";
	    String r=n;
	    String replace=n;
	    myMethod(n, m, r, replace);
	}
}

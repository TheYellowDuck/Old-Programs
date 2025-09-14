package programs;

import java.util.Scanner;

public class Middle_Character_Method {
	static String myMethod(String x) {
	    int a=(x.length()+1)/2;
	    String sub1=x.substring(a-1, a);
	    String sub2="";
	    if (x.length()%2==0) {
	    	sub2=x.substring(a, a+1);
	    }
	    return sub1+sub2;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input1=new Scanner(System.in);
	    System.out.println("Please Enter Your String.");
	    String x=input1.nextLine();
	    String output=myMethod(x);
	    System.out.println(output);
	}

}

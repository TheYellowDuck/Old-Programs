package programs;

import java.util.Scanner;

public class Percentage_of_String {
	static String myMethod(String x) {
		double A=0;
		double a=0;
		double N=0;
		double S=0;
		if (x.matches(".*[A-Z].*")) {
			A++;
		}
		if (x.matches(".*[a-z].*")) {
			a++;
		}
		if (x.matches(".*[0-9].*")) {
			N++;
		}
		A=(A/x.length())*100;
		a=(a/x.length())*100;
		N=(N/x.length())*100;
		S=100-(A+a+N);
		return A+"% of Uppercase Letters"+"\n"+a+"% of Lowercase Letters"+"\n"+N+"% of Numbers"+"\n"+S+"% of Symbols";
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

package programs;

import java.util.Scanner;

public class Leap_Year_Method {
	static String myMethod(int num1) {
		if(num1%4==0 && num1%100!=0){
		    return "Leap year!";
		}
	    else{
    	    return "This is not a leap year.";
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input1=new Scanner(System.in);
	    System.out.println("Enter a any Year.");
	    int num1=input1.nextInt();
	    String output=myMethod(num1);
	    System.out.println(output);
	}

}

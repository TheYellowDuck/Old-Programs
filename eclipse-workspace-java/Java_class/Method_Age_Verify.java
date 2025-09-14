package programs;

import java.util.Scanner;

public class Method_Age_Verify {
	static String myMethod(int x){
		if (x<18){
	      return x+" Access Denied";
	    }
	    else{
	      return x+" Access Granted";
	    }
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input1=new Scanner(System.in);
	    System.out.println("Please Verify Your Age");
	    int num1=input1.nextInt();
	    String output=myMethod(num1);
	    System.out.println(output);
	}

}

package programs;

import java.util.Scanner;

public class Word_Count {
	static int myMethod(String num1) {
	    String[] array=num1.split(" ");
	    return array.length;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input1=new Scanner(System.in);
	    System.out.println("Enter a any String.");
	    String num1=input1.nextLine();
	    int output=myMethod(num1);
	    System.out.println(output);
	}

}

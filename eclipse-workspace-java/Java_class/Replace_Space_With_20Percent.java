package programs;

import java.util.Scanner;

public class Replace_Space_With_20Percent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input1=new Scanner(System.in);
	    System.out.println("Enter a any String.");
	    String num1=input1.nextLine();
	    String num2=num1.replace(" ", "%20");
	    System.out.println(num1+" to "+num2);
	}

}

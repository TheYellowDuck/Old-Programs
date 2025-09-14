package programs;

import java.util.Scanner;

public class Remove_Spaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input1=new Scanner(System.in);
	    System.out.println("Enter a any String.");
	    String num1=input1.nextLine();
	    num1=num1.replaceAll(" ", "");
	    System.out.println(num1);
	}
}

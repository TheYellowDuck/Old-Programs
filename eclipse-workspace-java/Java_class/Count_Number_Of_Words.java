package programs;

import java.util.Scanner;

public class Count_Number_Of_Words {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input1=new Scanner(System.in);
	    System.out.println("Enter Anything");
	    String num1=input1.nextLine();
	    String[] array1=num1.split(" ");
	    System.out.println("There are "+array1.length+" words");
	}

}

package programs;

import java.util.Scanner;

public class If_String_is_Rotation_of_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input1=new Scanner(System.in);
	    System.out.println("Enter a any String.");
	    String num1=input1.nextLine();
	    String num2=num1.toLowerCase();
	    System.out.println("Enter a any String.");
	    String num3=input1.nextLine();
        String num4=num3.toLowerCase();
		String x=num2+num2;
		if (x.contains(num4)) {
			System.out.println(num1+" and "+num3+" Are Rotations of One Another");
		}
		else {
        	System.out.println(num1+" and "+num3+" Are Not Rotations of One Another");
        }
	}

}

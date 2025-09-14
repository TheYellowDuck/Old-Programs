package programs;

import java.util.Scanner;
import java.lang.Math.*;

public class Accept_Radius_Calculate_Area {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input1=new Scanner(System.in);
	    System.out.println("Enter a any Number.");
	    double num1=input1.nextDouble();
	    double area=Math.PI*Math.pow(num1, 2);
	    System.out.println(area);
	}

}

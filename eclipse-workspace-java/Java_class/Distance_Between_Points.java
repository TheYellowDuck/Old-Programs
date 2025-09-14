package programs;

import java.util.Scanner;
import java.lang.Math.*;

public class Distance_Between_Points {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input1=new Scanner(System.in);
	    System.out.println("Enter a any Number.");
	    double a=input1.nextDouble();
	    System.out.println("Enter a any Number.");
	    double b=input1.nextDouble();
	    System.out.println("Enter a any Number.");
	    double c=input1.nextDouble();
	    System.out.println("Enter a any Number.");
	    double d=input1.nextDouble();
	    double e=a-c;
	    if (e<0) {
	    	e=e*-1;
	    }
	    double f=b-d;
	    if (f<0) {
	    	f=f*-1;
	    }
	    double distance=Math.pow(e, 2)+Math.pow(f, 2);
	    distance=Math.sqrt(distance);
	    System.out.println(distance);
	}

}

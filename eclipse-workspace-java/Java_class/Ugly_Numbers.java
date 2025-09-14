package programs;

import java.util.Scanner;

public class Ugly_Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input1=new Scanner(System.in);
	    System.out.println("Enter a any Number.");
	    int num1=input1.nextInt();
	    boolean flag=true;
	    if (num1%2!=0) {
	    	flag=false;
	    }
	    else if (num1%3!=0) {
	    	flag=false;
	    }
	    else if (num1%5!=0) {
	    	flag=false;
	    }
	    if (flag==true) {
	    	System.out.println("Ugly Number");
	    }
	    if (flag==false) {
	    	System.out.println("Not A Ugly Number");
	    }
	}

}

package programs;

import java.util.Scanner;

public class Unique_Characters_Checker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input1=new Scanner(System.in);
	    System.out.println("Enter Anything");
	    String num1=input1.nextLine();
	    num1=num1.strip();
	    String[] array1=num1.split("");
	    boolean flag=true;
	    for (int i=0; i<array1.length && flag==true; i++) {
	    	for (int j=i+1; j<array1.length && flag==true; j++) {
	    		flag=false;
	    		if (!array1[i].contentEquals(array1[j])) {
	    			flag=true;
	    		}
	    	}
	    }
	    if (flag==true) {
	    	System.out.println("All Characters Are Unique");
	    }
	    else {
	    	System.out.println("Characters Are Not Unique");
	    }
	}

}

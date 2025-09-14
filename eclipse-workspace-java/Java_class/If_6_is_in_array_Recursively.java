package programs;

import java.util.Scanner;

public class If_6_is_in_array_Recursively {
	static void myMethod(String[] array, int index) {
		boolean flag=false;
    	if (array[index].contentEquals("6")) {
    		flag=true;
    	}
    	else {
    		if (index<array.length-1) {
    			myMethod(array, index+1);
    		}
    	}
    	if (index==array.length-1) {
    		System.out.println(flag);
    	}
	    return;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input1=new Scanner(System.in);
	    System.out.println("Please Enter Your Desired Array.");
	    String n=input1.nextLine();
	    n=n.replaceAll(" ", "");
	    String[] array=n.split(",");
	    myMethod(array, 0);
	}
}

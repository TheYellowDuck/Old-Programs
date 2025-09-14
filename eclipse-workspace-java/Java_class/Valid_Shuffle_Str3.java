package programs;

import java.util.Scanner;

public class Valid_Shuffle_Str3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input1=new Scanner(System.in);
	    System.out.println("Enter a any String.");
	    String num1=input1.nextLine();
	    String[] n1=num1.split("");
	    System.out.println("Enter a any String.");
	    String num2=input1.nextLine();
	    String[] n2=num2.split("");
	    System.out.println("Enter a any Shuffle.");
	    String num3=input1.nextLine();
	    if (num3.length()==num1.length()+num2.length()) {
	    	boolean flag=false;
	    	for (int j=0; j<n1.length; j++) {
	    		flag=false;
	    		if (num3.contains(n1[j])) {
	    			flag=true;
	    		}
	    	}	
	    	if (flag==false) {
	    		System.out.println(num3+" is Not a Valid Shuffle of "+num1+" and "+num2);
	    	}
	    	boolean flag2=false;
	    	for (int j=0; j<n2.length; j++) {
	    		flag2=false;
	    		if (num3.contains(n1[j])) {
	    			flag2=true;
	    		}
	    	}
	    	if (flag2==false) {
	    		System.out.println(num3+" is Not a Valid Shuffle of "+num1+" and "+num2);
	    	}
	    	if (flag2==true) {
	    		System.out.println(num3+" is a Valid Shuffle of "+num1+" and "+num2);
	    	}	
	    }
	    else {
	   		System.out.println(num3+" is Not a Valid Shuffle of "+num1+" and "+num2);
	   	}
	}

}

package programs;

import java.util.Scanner;

class digits {
	static void ones(int[] x) {
		System.out.println("Ones: "+x[x.length-1]);
		return;
	}
	static void tens(int[] x) {
		System.out.println("Tens: "+x[x.length-2]);
		return;
	}
	static void hundreds(int[] x) {
		System.out.println("Hundreds: "+x[x.length-3]);
		return;
	}
	static void custom(int[] x, int y) {
		System.out.println("Your Desired Digit: "+x[x.length-y]);
		return;
	}

}
public class Digit_Extracter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		digits dig=new digits(); //storing the class
		Scanner input=new Scanner(System.in); //ScannerInput
		boolean valid=false;
		String[] numstr=null;
		int[] num=null;
		String x="";
	    while (valid==false) {
			System.out.print("Enter Your Desired Number: "); //asking user what to do
		    x=input.nextLine(); //storing info
		    x=x.toLowerCase();
	    	x=x.replaceAll(" ", "");
	    	if (x.contains(".")) {
	    		x=x.substring(0, x.indexOf("."));
	    	}
		    try {
		    	numstr=x.split("");
		    	num=new int[numstr.length];
		    	for (int i=0; i<num.length; i++) {
		    		num[i]=Integer.parseInt(numstr[i]);
		    	}
		    	valid=true;
		    }
		    catch (NumberFormatException nfe) {
		    	System.out.println("Not Valid");
		    }
	    }
	    String command="";
	    while (!command.contentEquals("q")) {
	    	System.out.print("Show (W)hole Number. \nShow (O)nes Place Number. \nShow (T)ens Place Number. \nShow (H)undreds Place Number. \nShow (C)ustom Place Number. \n(Q)uit \nEnter Your Choice: ");
	    	command=input.nextLine();
	    	command=command.toLowerCase();
	    	command=command.replaceAll(" ", "");
	    	command=command.substring(0, 1);
	    	switch (command) {
	    	case "w":
	    		System.out.println("Whole Number: "+String.join("", numstr));
	    		break;
	    	case "o":
	    		dig.ones(num);
	    		break;
	    	case "t":
	    		dig.tens(num);
	    		break;
	    	case "h":
	    		dig.hundreds(num);
	    		break;
	    	case "c":
	    		while (x!=null) {
		    		System.out.print("Enter Your Desired Digit Between 1 to "+x.length()+" if Exit, Type Exit: ");
			    	String com=input.nextLine();
			    	try {
			    		if (Integer.parseInt(com)>0 && Integer.parseInt(com)<=x.length()) {
			    			dig.custom(num, Integer.parseInt(com));
			    		}
			    	}
			    	catch (NumberFormatException nfe) {
			    		break;
			    	}
	    		}
	    		break;
	    	case "q":
	    		System.out.println("You Have Exited");
	    		break;
	    	}
	    	
	    }
	}

}

package programs;

import java.util.Scanner;

class PiggyBank {
	static double sum=0;
	String strDouble=String.format("%.2f", sum);
	static void penny(double x) {
		sum=sum+x;
		String strDouble=String.format("%.2f", sum);
		sum=Double.parseDouble(strDouble);
		System.out.println("Balance=$"+strDouble);
		return;
	}
	static void nickel(double x) {
		sum=sum+x;
		String strDouble=String.format("%.2f", sum);
		sum=Double.parseDouble(strDouble);
		System.out.println("Balance=$"+strDouble);
		return;
	}
	static void dime(double x) {
		sum=sum+x;
		String strDouble=String.format("%.2f", sum);
		sum=Double.parseDouble(strDouble);
		System.out.println("Balance=$"+strDouble);
		return;
	}
	static void quarter(double x) {
		sum=sum+x;
		String strDouble=String.format("%.2f", sum);
		sum=Double.parseDouble(strDouble);
		System.out.println("Balance=$"+strDouble);
		return;
	}
	static void custom(double x) {
		sum=sum+x;
		String strDouble=String.format("%.2f", sum);
		sum=Double.parseDouble(strDouble);
		System.out.println("Balance=$"+strDouble);
		return;
	}
	static void take(double x) {
		if (sum-x>=0) {
			sum=sum-x;
			String strDouble=String.format("%.2f", sum);
			sum=Double.parseDouble(strDouble);
			System.out.println("You have Withdrawn"+"\nBalance now =$"+strDouble);
		}
		else {
			System.out.println("Cannot be done, Balance would be Less than 0");
		}
		return;
	}
}
public class MySavings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PiggyBank mySavings=new PiggyBank(); //storing the class
		boolean exit=false; //exit statement
		while (exit==false) { //program to add or take money
			System.out.println("Balance=$"+String.format("%.2f", mySavings.sum)); //print balance
			Scanner input=new Scanner(System.in); //ScannerInput
		    System.out.println("Add or Take Money. To Exit \"Bank\" Webpage Type Exit"); //asking user what to do
		    String at=input.nextLine(); //storing info
		    at=at.toLowerCase(); //converting everything into lower-case
		    at=at.replaceAll(" ", ""); //removing all spaces
		    at=at.replaceAll("$", "");
		    switch (at) { //program to add money
		    case "add": //what to do when at content is add
		    case "addmoney":
		    case "ad":
		    case "+":
		    case "admoney":
		    case "admon":
		    case "addmon":
		    case "+money":
		    case "+mon":
		    	boolean add=true; //exit statement
		    	while (add==true) { // exit statement
		    		System.out.println("Penny, Nickel, Dime, Quarter, or Custom (example:35.74). To Exit \"Add\" Webpage Type Exit"); //asking user what to do
		    		String sub=input.nextLine();
		    		sub=sub.toLowerCase();
		    		sub=sub.replaceAll(" ", "");
		    		sub=sub.replaceAll("$", "");
		    		double addnum=0;
		    		try {
		    			addnum=Double.parseDouble(sub);
		    			mySavings.custom(addnum);
		    		}
		    		catch (NumberFormatException nfe) {
			    		switch (sub) { //program to add type of money
			    		case "penny": //what to do when addnum content is penny
					    case "pennymoney":
					    case "pen":
					    case "penmoney":
					    case "penmon":
					    case "pennymon":
			    			mySavings.penny(0.01); //goes to class piggybank and accesses method penny
			    			break; //exit statement
			    		case "nickel": //what to do when addnum content is nickel
					    case "nickelmoney":
					    case "nic":
					    case "nicmoney":
					    case "nicmon":
					    case "nickelmon":
			    			mySavings.nickel(0.05); //goes to class piggybank and accesses method nickel
			    			break; //exit statement
			    		case "dime": //what to do when addnum content is dime
					    case "dimemoney":
					    case "dim":
					    case "dimmoney":
					    case "dimmon":
					    case "dimemon":
			    			mySavings.dime(0.10);
			    			break;
			    		case "quarter":
					    case "quartermoney":
					    case "quart":
					    case "quartmoney":
					    case "quartmon":
					    case "quartermon":
			    			mySavings.quarter(0.25);
			    			break;
			    		case "exit":
			    		case "ex":
			    			add=false;
			    			break;
			    		}
		    		}
		    	}
		    	break;
		    case "take":
		    case "takemoney":
		    case "tak":
		    case "-":
		    case "takmoney":
		    case "takmon":
		    case "takemon":
		    case "-money":
		    case "-mon":
		    	boolean take=true;
		    	while (take==true) {
		    		System.out.println("Enter Amount of Money to be Taken. To Exit \"Take\" Webpage Type Exit");
		    		String sub=input.nextLine();
		    		sub=sub.toLowerCase();
		    		sub=sub.replaceAll(" ", "");
		    		sub=sub.replaceAll("$", "");
		    		double takenum=0;
		    		try {
		    			takenum=Double.parseDouble(sub);
		    			mySavings.take(takenum);
		    		}
		    		catch (NumberFormatException nfe) {
		    			take=false;
		    		}
		    	}
		    	break;
		    case "exit":
		    case "ex":
		    	exit=true;
		    	break;
		    }
		}
		System.out.println("You have Exited");
	}

}

package programs;

import java.util.Scanner;

public class Password_Verifier {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input1=new Scanner(System.in);
		boolean flag=false;
		String num1=" ";
		int ascii=0;
	    while (flag==false) {
	    	System.out.println("Set Your Password.");
	    	num1=input1.nextLine();
	    	for (int i=0; i<num1.length(); i++) {
	    		ascii=(int) num1.charAt(i);
	    		if (ascii>=91 && ascii<=96) {
	    			break;
	    		}
	    	}
	    	if ((num1.matches(".*[A-Z].*") &&  num1.matches(".*[a-z].*")) && num1.matches(".*[0-9].*") && (num1.matches(".*[ -/].*") || num1.matches(".*[:-@].*") || (ascii>=91 && ascii<=96) || num1.matches(".*[{-~].*")) && num1.length()>=8 && num1.length()<=16) {
	    		flag=true;
	    	}	
	    }
	    int tries=0;
	    String num2=null;
	    while (tries<3){
	      System.out.println("Enter Your Password.");
	      num2=input1.nextLine(); 
	      if (num1.contentEquals(num2)){
	        break;
	      }
	      tries++;
	      System.out.println("Access Denied");
	    }
	    if (num1.contentEquals(num2))
	    System.out.println("Access Granted");
	    input1.close();
	}

}

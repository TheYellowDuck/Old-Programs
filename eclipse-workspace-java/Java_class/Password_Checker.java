package programs;
import java.util.Scanner;
public class Password_Checker {
	public static void main(String[] args) {
	    Scanner input1=new Scanner(System.in);
	    System.out.println("Set Your Password.(numbers only)");
	    int num1=input1.nextInt();
	    int tries=0;
	    int num2=0;
	    while (tries<3){
	      System.out.println("Enter Your Password.");
	      num2=input1.nextInt(); 
	      if (num1==num2){
	        break;
	      }
	      tries++;
	      System.out.println("Access Denied");
	    }
	    if (num1==num2)
	    System.out.println("Access Granted");
	    input1.close();
	  }
}
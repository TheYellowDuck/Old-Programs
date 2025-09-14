package programs;
import java.util.Scanner;
public class Positive_or_Negative {
	public static void main(String[] args){
	    Scanner input1=new Scanner(System.in);
	    System.out.println("Enter a Positive or Negative number.");
	    double num1=input1.nextDouble();
	    input1.close();
	    if (num1>0){
	      System.out.println("Your number is Positive.");
	    }
	    else if (num1==0){
	      System.out.println("You have a Zero.");
	    }
	    else{
	      System.out.println("Your number is Negative.");
	    }
	  }
}

package programs;
import java.util.Scanner;
public class Square_or_Rectangle {
	public static void main(String[] args){
	    Scanner input1=new Scanner(System.in);
	    System.out.println("Enter a width.");
	    double num1=input1.nextDouble();
	    System.out.println("Enter a length.");
	    double num2=input1.nextDouble();
	    input1.close();
	    if (num1==num2){
	      System.out.println("This is a Square.");
	    }
	    else{
	      System.out.println("This is an Rectangle.");
	    }
	  }
}

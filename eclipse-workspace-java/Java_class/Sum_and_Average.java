package programs;
import java.util.Scanner;
public class Sum_and_Average {
	public static void main(String[] args) {
	    Scanner input1=new Scanner(System.in);
	    System.out.println("Enter an Integer.");
	    double num1=input1.nextDouble();
	    Scanner input2=new Scanner(System.in);
	    System.out.println("Enter an Integer.");
	    double num2=input2.nextDouble();
	    Scanner input3=new Scanner(System.in);
	    System.out.println("Enter an Integer.");
	    double num3=input3.nextDouble();
	    Scanner input4=new Scanner(System.in);
	    System.out.println("Enter an Integer.");
	    double num4=input4.nextDouble();
	    Scanner input5=new Scanner(System.in);
	    System.out.println("Enter an Integer.");
	    double num5=input5.nextDouble();
	    input1.close();
	    input2.close();
	    input3.close();
	    input4.close();
	    input5.close();
	    double num6=num1+num2+num3+num4+num5;
	    double num7=num6/5;
	    System.out.println("The Sum is "+num6+" And the Average is "+num7);
	  }
}

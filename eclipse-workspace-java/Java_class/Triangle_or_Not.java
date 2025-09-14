package programs;
import java.util.Scanner;
public class Triangle_or_Not {
	public static void main(String[] args) {
	    Scanner input1=new Scanner(System.in);
	    System.out.println("Enter an Angle.");
	    double num1=input1.nextDouble();
	    Scanner input2=new Scanner(System.in);
	    System.out.println("Enter another Angle.");
	    double num2=input2.nextDouble();
	    Scanner input3=new Scanner(System.in);
	    System.out.println("Enter another Angle.");
	    double num3=input3.nextDouble();
	    input1.close();
	    input2.close();
	    input3.close();
	    double num4=num1+num2+num3;
	    if (num4==180){
	      System.out.println("This is a Triangle.");
	    }
	    else{
	      System.out.println("This is not a Triangle.");
	    }
	  }
}

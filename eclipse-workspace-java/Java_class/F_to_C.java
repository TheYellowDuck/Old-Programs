package programs;
import java.util.Scanner;
public class F_to_C {
	public static void main(String[] args) {
	    Scanner input1=new Scanner(System.in);
	    System.out.println("enter your farenheit temperature");
	    double num1=input1.nextDouble();
	    double num2=num1-32;
	    double num3=num2*5/9;
	    System.out.print(num3);
	    System.out.print("°C");
	  }
}

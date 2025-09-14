package programs;
import java.util.Scanner;
public class Min_to_Year_and_Day {
	public static void main(String[] args) {
	    Scanner input1=new Scanner(System.in);
	    System.out.println("Enter a Minute.");
	    int num1=input1.nextInt();
	    input1.close();
	    int num2=num1/525600;
	    double num3=num1%525600;
	    double num4=num3/1440;
	    System.out.println(num2+" years and "+num4+" days.");
	  }
}

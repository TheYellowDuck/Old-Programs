package programs;
import java.util.Scanner;
public class Equal_or_Not {
	public static void main(String[] args) {
	    Scanner input1=new Scanner(System.in);
	    System.out.println("Enter a number.");
	    double num1=input1.nextDouble();
	    Scanner input2=new Scanner(System.in);
	    System.out.println("Enter another number.");
	    double num2=input2.nextDouble();
	    Scanner input3=new Scanner(System.in);
	    System.out.println("Enter another number.");
	    double num3=input3.nextDouble();
	    input1.close();
	    input2.close();
	    input3.close();
	    if (num1==num2 && num1==num3){
	      System.out.println("All Three Numbers are Equal.");
	    }
	    else if (num1!=num2 && num1!=num3 && num2!=num3){
	      System.out.println("All Three Numbers are Different.");
	    }
	    else{
	      System.out.println("Neither All are Equal or Different");
	    }
	  }
}

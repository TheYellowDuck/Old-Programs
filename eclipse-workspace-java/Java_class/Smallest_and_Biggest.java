package programs;
import java.util.Scanner;
public class Smallest_and_Biggest {
	public static void main(String[] args) {
	    System.out.println("Please Enter Three Numbers In The Following Requests.");
	    Scanner input1=new Scanner(System.in);
	    System.out.println("Please Enter Your First Number.");
	    double num1=input1.nextDouble();
	    System.out.println("Please Enter Your Second Number.");
	    double num2=input1.nextDouble();
	    System.out.println("Please Enter Your Third Number.");
	    double num3=input1.nextDouble();
	    System.out.println("From The Information You Gave:");
	    if (num1<num2) if (num1<num3){
	      System.out.println(num1+" is the smallest number.");
        }
	    if (num1>num2) if (num1>num3){
	      System.out.println(num1+" is the largest number.");
	    }
	    if (num2<num1) if (num2<num3){
	      System.out.println(num2+" is the smallest number.");
	    }
	    if (num2>num1) if (num2>num3){
	      System.out.println(num2+" is the largest number.");
	    }
	    if (num3<num1) if (num3<num2){
	      System.out.println(num3+" is the smallest number.");
	    }
	    if (num3>num1) if (num3>num2){
	      System.out.println(num3+" is the largest number");
	    }
	  }
}

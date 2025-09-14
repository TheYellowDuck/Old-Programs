package programs;
import java.util.Scanner;
public class Leap_Year_Checker {
	public static void main(String[] args) {
	    Scanner input1=new Scanner(System.in);
	    System.out.println("Enter a Year.");
	    int year=input1.nextInt();
	    input1.close();
	    if(year%4==0 && year%100!=0){
	     System.out.println("Leap year!");
	    }
	    else{
	      System.out.println("This is not a leap year.");
	    }
	  }
}

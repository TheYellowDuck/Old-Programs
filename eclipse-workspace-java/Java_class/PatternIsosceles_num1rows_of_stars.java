package programs;
import java.util.Scanner;
public class PatternIsosceles_num1rows_of_stars {
	public static void main(String[] args) {
	    Scanner input1=new Scanner(System.in);
	    System.out.println("Enter an Integer.");
	    int num1=input1.nextInt();
	    input1.close();
	    for (int i=0; i<=num1-1; i++){
	      for (int ii=2*(num1-i); ii>=0; ii--){
	        System.out.print(" ");
	      }
	      for (int ii=0; ii<=i; ii++){
	        System.out.print("* ");
	      }
	      for (int ii=1; ii<=i; ii++){
	        System.out.print("* ");
	      }
	      System.out.println();
	    }
	  }
}

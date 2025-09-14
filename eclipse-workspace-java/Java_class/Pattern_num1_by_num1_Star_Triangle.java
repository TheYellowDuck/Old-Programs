package programs;
import java.util.Scanner;
public class Pattern_num1_by_num1_Star_Triangle {
	public static void main(String[] args) {
	    Scanner input1=new Scanner(System.in);
	    System.out.println("Enter an Integer.");
	    int num1=input1.nextInt();
	    input1.close();
	    for (int i=1; i<=num1; i++){
	      for (int ii=1; ii<=i; ii++){
	        System.out.print(" *");
	      }
	      System.out.println();
	    }
	  }
}

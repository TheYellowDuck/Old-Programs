package programs;
import java.util.Scanner;
public class PatternIsosceles_1_212_32123 {
	public static void main(String[] args) {
	    Scanner input1=new Scanner(System.in);
	    System.out.println("Enter an Integer.");
	    int num1=input1.nextInt();
	    input1.close();
	    for (int i=1; i<=num1; i++){
	      for (int ii=2*(num1-i); ii>=0; ii--){
	        System.out.print(" ");
	      }
	      for (int ii=i; ii>=1; ii--){
	        System.out.print(ii+" ");
	      }
	      for (int ii=2; ii<=i; ii++){
	        System.out.print(ii+" ");
	      }
	      System.out.println();
	    }
	  }
}

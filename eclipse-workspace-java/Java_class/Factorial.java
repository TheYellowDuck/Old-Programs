package programs;
import java.util.Scanner;
public class Factorial {
	public static void main(String[] args) {
	    Scanner input1=new Scanner(System.in);
	    System.out.println("Enter an Integer.");
	    int num1=input1.nextInt();
	    input1.close();
	    int sum=1;
	    for (int i=1; i<=num1; i++){
	      sum=sum*i;
	    }
	    System.out.println(sum);
	  }
}

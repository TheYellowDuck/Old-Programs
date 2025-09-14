package programs;
import java.util.Scanner;
public class Fibonacci_number {
	public static void main(String[] args) {
	    Scanner input1=new Scanner(System.in);
	    System.out.println("Enter an Integer.");
	    int num1=input1.nextInt();
	    input1.close();
	    int i=0;
	    int sum=1;
	    for (i=0; i<=num1; i=i+sum){
	      sum=sum+i;
	      System.out.println(i);
	      System.out.println(sum);
	    }
	  }
}

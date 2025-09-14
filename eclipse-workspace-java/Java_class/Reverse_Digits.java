package programs;
import java.util.Scanner;
public class Reverse_Digits {
	public static void main(String[] args) {
	    Scanner input1=new Scanner(System.in);
	    System.out.println("Enter an Integer.");
	    int num1=input1.nextInt();
	    input1.close();
	    while (num1>0){
	      int num2=num1%10;
	      num1=num1/10;
	      System.out.print(num2);
	    }
	  }
}

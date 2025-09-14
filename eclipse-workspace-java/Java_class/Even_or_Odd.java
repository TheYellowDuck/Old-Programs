package programs;
import java.util.Scanner;
public class Even_or_Odd {
	public static void main(String[] args){
	    Scanner input1=new Scanner(System.in);
	    System.out.println("Enter a any Integer.");
	    int num1=input1.nextInt();
	    input1.close();
	    if (num1%2==0){
	      System.out.println("This is an Even Number.");
	    }
	    else{
	      System.out.println("This is an Odd Number.");
	    }
	  }
}

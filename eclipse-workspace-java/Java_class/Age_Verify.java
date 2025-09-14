package programs;
import java.util.Scanner;
public class Age_Verify {
	public static void main(String[] args) {
	    Scanner input1=new Scanner(System.in);
	    System.out.println("Please Verify Your Age");
	    int num1=input1.nextInt();
	    if (num1<18){
	      System.out.println("Access Denied");
	    }
	    else{
	      System.out.println("Access Granted");
	    }
	  }
}

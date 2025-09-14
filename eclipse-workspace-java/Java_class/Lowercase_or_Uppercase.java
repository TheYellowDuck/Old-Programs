package programs;
import java.util.Scanner;
public class Lowercase_or_Uppercase {
	public static void main(String[] args) {
	    Scanner input1=new Scanner(System.in);
	    System.out.println("Enter a Letter.");
	    char num1=input1.next().charAt(0);
	    input1.close();
	    if (num1>=65 && num1<=90){
	      System.out.println(num1+" is Capitalized.");
	    }
	    else if (num1>=97 && num1<=122){
	      System.out.println(num1+" is Lowercase.");
	    }
	    else{
	      System.out.println("This is not what I asked for");
	    }
	  }
}

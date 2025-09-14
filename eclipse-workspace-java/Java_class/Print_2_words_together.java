package programs;
import java.util.Scanner;
public class Print_2_words_together {
	public static void main(String[] args) {
	    System.out.println("think of a two word phrase");
	    Scanner input1=new Scanner(System.in);
	    System.out.println("enter the first word");
	    String s1=input1.nextLine();
	    Scanner input2=new Scanner(System.in);
	    System.out.println("enter the second word");
	    String s2=input2.nextLine();
	    String s3=s1+s2;
	    System.out.println(s3);
	  }
}

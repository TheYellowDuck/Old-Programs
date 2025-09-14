package programs;
import java.util.Scanner;
public class If_Else_Age {
	public static void main(String[] args) {
	    Scanner input1=new Scanner(System.in);
	    System.out.println("enter your age.");
	    int age=input1.nextInt();
	    input1.close();
	    if (age<=0)
	    {System.out.println("You are not alive.");}
	    if (age>0) if (age<=8)
	    {System.out.println("You cannot read this because you are a Baby!");}
	    if (age>8) if (age<=12)
	    {System.out.println("You are not here because you lost your interest already and playing something else, since you are still a child.");}
	    if (age>12) if (age<=19)
	    {System.out.println("You are not reading this because you are on your phones, as are all teenagers.");}
	    if (age>19) if (age<=65)
	    {System.out.println("You are too busy to be reading this.");}
	    if (age>65) if (age<=100)
	    {System.out.println("Finally someone who has time to read this.");}
	    else 
	    {System.out.println("You are a wonder! What is your secret to living a long life?");}
	  }
}

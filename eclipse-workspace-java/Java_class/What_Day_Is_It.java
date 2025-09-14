package programs;
import java.util.Scanner;
public class What_Day_Is_It {
	public static void main(String[] args){
	    Scanner input1=new Scanner(System.in);
	    System.out.println("Enter a Number between 1-7.");
	    int num1=input1.nextInt();
	    input1.close();
	    switch (num1){
	      case 1:
	      System.out.println("It's Monday.");
	      break;
	      case 2:
	      System.out.println("It's Tuesday.");
	      break;
	      case 3:
	      System.out.println("It's Wednesday.");
	      break;
	      case 4:
	      System.out.println("It's Thursday.");
	      break;
	      case 5:
	      System.out.println("It's Friday.");
	      break;
	      case 6:
	      System.out.println("It's Saturday.");
	      break;
	      case 7:
	      System.out.println("It's Sunday.");
	      break;
	      default:
	      System.out.println("Not Valid");
	    }
	  }
}

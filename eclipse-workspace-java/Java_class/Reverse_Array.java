package programs;
import java.util.Scanner;
public class Reverse_Array {
	public static void main(String[] args) {
		Scanner input1=new Scanner(System.in);
	    System.out.println("Enter the Number of Numbers In The Array.");
	    int num1=input1.nextInt();
		int [] array1=new int[num1];
		System.out.println("Enter All The Numbers In The Array");
		for (int n=0; n<num1; n++) {
			array1[n]=input1.nextInt();
		}
        for (int r=array1.length-1; r>-1; r--) {
        	System.out.println(array1[r]);
        }
    }
}

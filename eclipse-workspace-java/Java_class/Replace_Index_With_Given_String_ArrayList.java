package programs;

import java.util.ArrayList;
import java.util.Scanner;

public class Replace_Index_With_Given_String_ArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input1=new Scanner(System.in);
	    System.out.println("Enter a any String.");
	    String num1=input1.nextLine();
		ArrayList<String> cars=new ArrayList<String>();
		cars.add("Volvo");
		cars.add("BMW");
		cars.add("Ford");
		cars.add("Mazda");
		cars.add("Blah");
		cars.set(1, num1);
		for (String i:cars) {
			System.out.println(i);
		}
	}

}

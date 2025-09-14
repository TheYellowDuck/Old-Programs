package programs;

import java.util.ArrayList;
import java.util.Scanner;

public class Search_Element_ArrayList {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input1=new Scanner(System.in);
	    System.out.println("Enter a any Integer.");
	    String num1=input1.nextLine();
		ArrayList<String> cars=new ArrayList<String>();
		cars.add("Volvo");
		cars.add("BMW");
		cars.add("Ford");
		cars.add("Mazda");
		cars.add("Blah");
		cars.add(0, "Opel");
		boolean flag=false;
		for (int i=0; i<cars.size(); i++) {
        	if (cars.get(i).equals(num1)) {
        		System.out.println(num1+" Is At Index "+i);
        		flag=true;
        		break;
        	}
        }
		if (flag==false) {
			System.out.println(num1+" Is Not In This ArrayList");
		}
	}
}

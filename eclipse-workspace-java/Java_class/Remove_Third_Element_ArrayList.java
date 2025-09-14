package programs;

import java.util.ArrayList;

public class Remove_Third_Element_ArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> cars=new ArrayList<String>();
		cars.add("Volvo");
		cars.add("BMW");
		cars.add("Ford");
		cars.add("Mazda");
		cars.add("Blah");
		cars.remove(2);
		for (String i:cars) {
			System.out.println(i);
		}
	}

}

package programs;

import java.util.ArrayList;

public class Swap_ArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> cars=new ArrayList<String>();
		cars.add("Volvo");
		cars.add("BMW");
		cars.add("Ford");
		cars.add("Mazda");
		cars.add("Blah");
		String num3=cars.get(1);
		cars.set(1, cars.get(2));
		cars.set(2, num3);
		for (String i:cars) {
			System.out.println(i);
		}
	}

}

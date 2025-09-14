package programs;

import java.util.ArrayList;

public class Reverse_ArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> cars=new ArrayList<String>();
		cars.add("Volvo");
		cars.add("BMW");
		cars.add("Ford");
		cars.add("Mazda");
		cars.add("Blah");
		for (int r=cars.size()-1; r>=0; r--) {
        	System.out.println(cars.get(r));
        }
	}

}

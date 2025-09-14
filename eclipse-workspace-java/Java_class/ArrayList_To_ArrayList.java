package programs;

import java.util.ArrayList;

public class ArrayList_To_ArrayList {

	public static void main(String[] args) {
		ArrayList<String> cars=new ArrayList<String>();
		cars.add("Volvo");
		cars.add("BMW");
		cars.add("Ford");
		cars.add("Mazda");
		cars.add("Blah");
		cars.add(0, "Opel");
		ArrayList<String> cars2=new ArrayList<String>();
		for (int i=0; i<cars.size(); i++) {
			cars2.add(cars.get(i));
		}
		for (int i=0; i<cars2.size(); i++) {
			System.out.println(cars.get(i));
		}
	}

}

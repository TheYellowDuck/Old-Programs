package programs;
import java.util.ArrayList;
public class ArrayList_Insert_At_Index0 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> cars=new ArrayList<String>();
		cars.add("Volvo");
		cars.add("BMW");
		cars.add("Ford");
		cars.add("Mazda");
		cars.add("Blah");
		cars.add(0, "Opel");
		for (String i:cars) {
			System.out.println("Then "+i);
		}
	}

}

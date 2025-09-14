package programs;

import java.util.ArrayList;
import java.util.Collections;

public class Shuffle_ArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> arraylist1=new ArrayList<String>();
		arraylist1.add("A");
		arraylist1.add("B");
		arraylist1.add("C");
		arraylist1.add("D");
		arraylist1.add("A");
		arraylist1.add("B");
		arraylist1.add("C");
		arraylist1.add("A");
		arraylist1.add("B");
		arraylist1.add("A");
		Collections.shuffle(arraylist1);
		System.out.println(arraylist1);
	}

}

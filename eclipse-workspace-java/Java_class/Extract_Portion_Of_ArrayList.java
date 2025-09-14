package programs;

import java.util.ArrayList;
import java.util.List;

public class Extract_Portion_Of_ArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> arraylist1=new ArrayList<Integer>();
		arraylist1.add(1);
		arraylist1.add(2);
		arraylist1.add(3);
		arraylist1.add(4);
		arraylist1.add(5);
		arraylist1.add(6);
		arraylist1.add(7);
		arraylist1.add(8);
		arraylist1.add(9);
		List<Integer> arraylist2=new ArrayList<Integer>();
		arraylist2=arraylist1.subList(4, 9);
		System.out.println(arraylist2);
	}

}

package programs;

import java.util.ArrayList;

public class Removing_Odd_Numbers_ArrayList {

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
		for (int i=0; i<arraylist1.size(); i++) {
			if (arraylist1.get(i)%2!=0) {
				arraylist1.remove(i);
				i--;
			}
		}
		for (int i:arraylist1) {
			System.out.println(i);
		}
	}

}

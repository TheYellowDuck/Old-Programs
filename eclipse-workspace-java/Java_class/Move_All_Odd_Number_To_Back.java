package programs;

import java.util.ArrayList;

public class Move_All_Odd_Number_To_Back {

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
		int num1=0;
		int count=0;
		for (int i=0; i<arraylist1.size(); i++) {
			if (arraylist1.get(i)%2!=0) {
				count++;
			}
		}
		for (int i=0; i<arraylist1.size(); i++) {
			if (arraylist1.get(i)%2!=0 && i<count) {
				num1=arraylist1.get(i);
				arraylist1.remove(i);
				arraylist1.add(arraylist1.size(), num1);
			}
		}
		for (int i:arraylist1) {
			System.out.println(i);
		}
	}

}

package programs;

import java.util.ArrayList;

public class Multiplying_2ArrayLists {

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
		ArrayList<Integer> arraylist2=new ArrayList<Integer>();
		arraylist2.add(9);
		arraylist2.add(8);
		arraylist2.add(7);
		arraylist2.add(6);
		arraylist2.add(5);
		arraylist2.add(4);
		arraylist2.add(3);
		arraylist2.add(2);
		arraylist2.add(1);
		int num1=0;
		if (arraylist1.size()>arraylist2.size()) {
			num1=arraylist1.size();
		}
		else {
			num1=arraylist2.size();
		}
		ArrayList<Integer> arraylist3=new ArrayList<Integer>();
		for (int i=0; i<num1; i++) {
        	arraylist3.add(i, arraylist1.get(i)*arraylist2.get(i));
        }
		for (int i:arraylist3) {
			System.out.println(i);
		}
	}

}

package programs;

import java.util.ArrayList;

public class Check_If_ArrayLists_Are_Equal_Or_Not {

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
		arraylist2.add(1);
		arraylist2.add(2);
		arraylist2.add(3);
		arraylist2.add(4);
		arraylist2.add(5);
		arraylist2.add(6);
		arraylist2.add(7);
		arraylist2.add(8);
		arraylist2.add(9);
		boolean flag=false;
		if (arraylist1.size()==arraylist2.size()) {
			for (int i=0; i<arraylist1.size(); i++) {
				flag=false;
				if (arraylist1.get(i)==arraylist2.get(i)) {
					flag=true;
				}
				else {
					break;
				}
			}
		}
		System.out.println(flag);
	}

}

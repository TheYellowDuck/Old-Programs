package programs;

import java.util.ArrayList;
import java.util.List;

public class Split_ArrayList_In_Half {

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
		int num1=(arraylist1.size()+1)/2;
		List<String> arraylist2=new ArrayList<String>();
		arraylist2=arraylist1.subList(0, num1);
		System.out.println(arraylist2);
		List<String> arraylist3=new ArrayList<String>();
		arraylist3=arraylist1.subList(num1, arraylist1.size());
		System.out.println(arraylist3);
	}

}

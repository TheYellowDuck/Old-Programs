package programs;

import java.util.ArrayList;

public class Join_2StringArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> arraylist1=new ArrayList<String>();
		arraylist1.add("abcdefghijklm");
		arraylist1.add("ABCDEFGHIJKLM");
		ArrayList<String> arraylist2=new ArrayList<String>();
		arraylist2.add("nopqrstuvwxyz");
		arraylist2.add("NOPQRSTUVWXYZ");
		ArrayList<String> arraylist3=new ArrayList<String>();
		for (int i=0; i<arraylist1.size(); i++) {
			arraylist3.add(arraylist1.get(i).concat(arraylist2.get(i)));
		}
		System.out.println(arraylist3);
	}

}

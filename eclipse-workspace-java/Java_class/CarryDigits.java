package programs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class CarryDigits {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
		ArrayList<Integer> array=new ArrayList<Integer>();
		ArrayList<Integer> array2=new ArrayList<Integer>();
		System.out.println("Enter First Number: ");
		String[] num=input.readLine().split("");
		for (String s:num) {
			array.add(Integer.parseInt(s));
		}
		System.out.println("Enter Second Number: ");
		String[] num2=input.readLine().split("");
		for (String s:num2) {
			array2.add(Integer.parseInt(s));
		}
		if (array.size()>array2.size()) {
			ArrayList<Integer> array3=new ArrayList<Integer>(array);
			array=new ArrayList<Integer>(array2);
			array2=new ArrayList<Integer>(array3);
		}
		for (int i=array.size(); i<array2.size(); i++) {
			array.add(0, 0);
		}
		int c=0;
		for (int i=array.size()-1; i>=0; i--) {
			if (array.get(i)+array2.get(i)>9) {
				c++;
				if (i==0) {
					array.add(0, 1);
					array2.add(0, 0);
				}
				else
					array.set(i-1, array.get(i-1)+1);
			}
		}
		System.out.println("Number Of Times To Carrying Digits: "+c);
	}

}

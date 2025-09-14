package programs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Array_Review {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
		double sum=0;
		ArrayList<String> lf=new ArrayList<String>();
		ArrayList<String> la=new ArrayList<String>();
		double array[]=new double[20];
		double avg=0;
		for (int i=0; i<array.length; i++) {
			System.out.println("Enter Your Price: ");
			double ipt=Double.parseDouble(input.readLine());
			sum=sum+ipt;
			array[i]=ipt;
			if (ipt<=5)
				lf.add("$".concat(String.format("%.2f", ipt)));
		}
		avg=sum/array.length;
		for (int i=0; i<array.length; i++) {
			if (array[i]>=avg)
				la.add("$".concat(String.format("%.2f", array[i])));
		}
		System.out.println("Sum: ");
		System.out.println("$".concat(String.format("%.2f", sum)));
		System.out.println("\nLesser/Equal Than 5: ");
		for (String i:lf) {
			System.out.println(i);
		}
		System.out.println("\nAverage: ");
		System.out.println("$".concat(String.format("%.2f", avg)));
		System.out.println("\nGreater/Equals Than Average: ");
		for (String i:la) {
			System.out.println(i);
		}
		System.out.println();
	}

}

package programs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GeneratedNums {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter How Many Numbers To Generate: ");
		int stop=Integer.parseInt(input.readLine());
		int[] array=new int[stop];
		for (int i=0; i<stop; i++) {
			char[] adda=String.valueOf(i).toCharArray();
			int add=0;
			for (int j=0; j<adda.length; j++) {
				add+=adda[j]-'0';
			}
			array[i]=i+add;
		}
		System.out.println("INDEX                    GENERATED NUMBER");
		for (int i=0; i<stop; i++) {
			System.out.println(i+"                              "+array[i]);
		}
	}

}

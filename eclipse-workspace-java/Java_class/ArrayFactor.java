package programs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ArrayFactor {
	public static void makeArray(int num) {
		ArrayList<Integer> array=new ArrayList<Integer>();
		for(int i=1; i<=(int) (num+1)/2; i++) {
            if (num%i==0) {
                array.add(i);
            }
        }
		array.add(num);
		System.out.println(array);
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Your Number: ");
		int num=Integer.parseInt(input.readLine().replace(" ", ""));
		makeArray(num);
	}

}

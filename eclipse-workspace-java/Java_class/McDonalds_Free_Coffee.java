package programs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class McDonalds_Free_Coffee {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Your Number Of Cups Bought: ");
		int num=Integer.parseInt(input.readLine());
		num+=num/6;
		System.out.println(num);
	}

}

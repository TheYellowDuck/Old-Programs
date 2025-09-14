package programs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AverageWhole {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String[] num;
		BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Your Numbers: ");
		num=input.readLine().replace(" ", "").split(",");
		double i=0;
		for (String s:num) {
			i+=Integer.parseInt(s);
		}
		System.out.println((i/num.length)%1==0);
	}

}

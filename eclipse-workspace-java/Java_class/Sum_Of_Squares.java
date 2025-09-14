package programs;

import java.util.Scanner;

class SOSclass {
	private double sum;
	public SOSclass(String[] array) {
		for (int i=0; i<array.length; i++) {
			sum=sum+(Double.parseDouble(array[i])*Double.parseDouble(array[i]));
		}
		System.out.println(sum);
	}
}
public class Sum_Of_Squares {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in); //ScannerInput
		System.out.println("Enter Your Numbers");
		String x=input.nextLine();
		x=x.replace(" ", "");
		String[] array1=x.split(",");
		SOSclass n1=new SOSclass(array1);
	}

}
package programs;

import java.util.ArrayList;
import java.util.Scanner;

class L1Eclass {
	private String[] array1;
	private String[] array2;
	ArrayList<String> list=new ArrayList<String>();
	private boolean check=false;
	public L1Eclass(String x1, String y1) {
		x1=x1.replace(" ", "");
		array1=x1.split(",");
		y1=y1.replace(" ", "");
		array2=y1.split(",");
	}
	public void calculate() {
		for (int i=0; i<array1.length; i++) {
			for (int j=0; j<array2.length; j++) {
				if (array1[i].contentEquals(array2[j])) {
					list.add(array1[i]);
					check=true;
				}
			}
		}
		if (check==false) {
			System.out.println("False, There Is At No Element That Is Equal In These Two Lists");
		}
		else {
			System.out.println(list);
			System.out.println("True, There Are At Least One Element That Is Equal In These Two Lists");
		}
	}
}
public class List_1_Element_Equal {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in); //ScannerInput
		System.out.println("Enter Your List");
		String x=input.nextLine();
		System.out.println("Enter Your Next List");
		String y=input.nextLine();
		L1Eclass n1=new L1Eclass(x, y);
		n1.calculate();
	}

}
package programs;

import java.util.Arrays;

class A3Dclass {
	private String[][][] array1;
	private String[] array;
	private String str;
	public A3Dclass(String[][][] array) {
		array1=array;
	}
	public void calculate() {
		System.out.println(Arrays.deepToString(array1));
		for (int i=0; i<array1.length; i++) {
			for (int j=0; j<array1[i].length; j++) {
				for (int n=0; n<array1[i][j].length; n++) {
					if (array1[i][j][n].contentEquals("6000")) {
						str=String.join(",", array1[i][j]);
						str=str.concat(",7000");
						array=str.split(",");
						array1[i][j]=array;
					}
				}
			}
		}
		System.out.println(Arrays.deepToString(array1));
	}
}
public class Array_3D_Add_After_6000 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[][][] array=new String[][][] {{{"10"}}, {{"20"}}, {{"300"}, {"400"}, {"5000", "6000"}, {"500"}}, {{"30"}}, {{"40"}}};
		A3Dclass n1=new A3Dclass(array);
		n1.calculate();
	}

}
package programs;
public class Locate_Index_in_2DArray {
	public static void main(String[] args){
		double [][] array1= {{1,2,3,4},{5,6,7}};
		for (int r=0; r<array1.length; ++r) {
			for (int j=0; j<array1.length; ++j) {
				System.out.println(array1[r][j]);
			}
		}
	}
}

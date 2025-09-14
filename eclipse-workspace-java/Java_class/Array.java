package programs;

public class Array {
	public static void main(String[] args){
		String [] str=new String [20];
		int [] array1= {2,3,4,5,6,7,8};
		int [] array2=new int [20];
		array1[6]=290;
		System.out.println(array1[6]);
		System.out.println(array1.length-1);
		for (int r=0; r<7; r++) {
			System.out.println(array1[r]);
		}
		//for (int y:array1) {
			//System.out.println(array1[y]);
		//}
	}
}

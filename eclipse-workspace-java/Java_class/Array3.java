package programs;

public class Array3 {
	public static void main(String[] args){
		int c=0;
		int l=0;
		int [] array1= {1,2,3,4,16};
		for (int y:array1) {
			c=c+y;
		}
		double m=c/array1.length;
		System.out.println(c);
		System.out.println(m);
	}
}
package programs;

public class TwoDArray_Largest_Smallest {
	public static void main(String[] args) {
		int a=0;
		int array1[][]= {{12,11,10,9},{8,7,6,5},{4,3,2,1}};
		for (int i=0; i<array1.length; i++)
		{
			for(int j=0; j<array1[i].length; j++) 
			{	
				if (a<array1[i][j]) {
					a=array1[i][j];
				} 
			}
		}
		System.out.println(a);
	}
}

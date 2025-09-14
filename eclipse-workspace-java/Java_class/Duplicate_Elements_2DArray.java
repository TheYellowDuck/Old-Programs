package programs;

public class Duplicate_Elements_2DArray {
	public static void main(String[] args) {
		int array1[][]= {{12,11,10,9},{1,2,5,6},{4,3,2,1}};
		int a=0;
		/*for (int i=0; i<array1.length; i++) {
			for(int j=0; j<array1[i].length; j++) {	
				for (int n=0; n<array1.length; n++) {
					for (int l=1; l<array1[n].length; l++) {
						if (array1[i][j]==array1[n][l]) {
							System.out.println("Duplicate Element : "+array1[n][j]);
						}
					}
				}
			}
		}*/
		for (int i=0; i<array1.length; i++)
		{
			for(int j=0; j<array1[i].length; j++) 
			{	
				if (a==array1[i][j]) {
					a=array1[i][j];
				} 
			}
		}
	}
}

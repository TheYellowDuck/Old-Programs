package programs;

public class TwoD_Average {

	public static void main(String[] args) {
		double r=0;
		double m=0;
		double l=0;
		int array1[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12}};
		for (int i=0; i<array1.length;i++)
	    {
	   	    for(int j=0;j<array1[i].length;j++) 
			{	
		 	    r=r+array1[i][j]; 
			    l++;
		    } 
		}
		m=r/l;
		System.out.println(m);
	}
}

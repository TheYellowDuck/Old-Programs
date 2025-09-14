package programs;

public class Finding_Duplicate_Values_in_Array {
	public static void main(String[] args) {
		int[] array = {1,3,2,5,5,6,6,7,2,3};
		for (int i=0; i<array.length-1; i++) {
            for (int j=i+1; j<array.length; j++) {
                if (array[i]==array[j]) {
	                System.out.println("Duplicate Element : "+array[j]);
                }
            }
	    }
	}
}


	
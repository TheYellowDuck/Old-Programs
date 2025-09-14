package programs;

public class Even_Odd_Array {
	public static void main(String[] args) {
        int[] array = {5,2,7,5,2,9,7,8};
        for (int i=0; i<array.length-1; i++) {
        	if (array[i]%2==0){
      	       System.out.println("Even Numbers: "+array[i]);
            }
        }
        for (int n=0; n<array.length-1; n++) {
    	    if (array[n]%2!=0) {
               System.out.println("Odd Numbers: "+array[n]);
      	    }
        }
    }
}

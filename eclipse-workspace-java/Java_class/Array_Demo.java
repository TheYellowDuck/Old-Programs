package programs;

public class Array_Demo {
	public static void main(String[] args) {
		int[][] ticketInfo;
	    String[][] seatingChart;
	    ticketInfo=new int[2][3];
	    seatingChart=new String[3][2];
	    ticketInfo[0][0]=15;
	    ticketInfo[0][1]=10;
	    ticketInfo[0][2]=15;
	    ticketInfo[1][0]=25;
	    ticketInfo[1][1]=20;
	    ticketInfo[1][2]=25;
	    seatingChart[0][0]="A";
	    seatingChart[0][1]="B";

	    seatingChart[1][0]="D";
	    seatingChart[1][1]="E";

	    for (int i=0; i<ticketInfo.length; i++) {
	    	for (int j=0; i<ticketInfo[i].length; j++) {
	    		System.out.println(ticketInfo[i][j]+" ");
	    	}
	    	System.out.println();
	    }
	}
}

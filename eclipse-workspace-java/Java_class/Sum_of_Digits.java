package programs;

public class Sum_of_Digits {
	public static void main(String[] args) {
	    int num1=539; //random #
	    int sum=0;
	    while (num1>0){ //to create a loop until num1 is equal to 0
	      sum=sum+num1%10; //1st time through sum=9, 2nd sum=12, 3rd sum=17
	      num1=num1/10; //1st time through num1=53 because num1 is an int, the decimals get ignored, 2nd num1=5, 3rd num1=0
	    } //after num1 is =0, the loop would stop because of the (num1>0) because num1 is no longer greater than 0
	    System.out.println(sum);
	  }
}

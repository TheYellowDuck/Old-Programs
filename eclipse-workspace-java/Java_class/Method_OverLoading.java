package programs;

public class Method_OverLoading {
	static int myMethod(int x, int y) {
    	return x+y;
    }
	static double myMethod(double x, double y) {
    	return x+y;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1=myMethod(8, 5);
		double num2=myMethod(4.3, 6.26);
		System.out.println("int: "+num1);
		System.out.println("double: "+num2);
	}
}

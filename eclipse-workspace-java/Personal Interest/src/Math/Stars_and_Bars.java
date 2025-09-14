package Math;

public class Stars_and_Bars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 0, b = 1, c = 2, d = 3;
		int count = 0;
		for (; a <= 4; a ++) {
			for (b = 1; b <= 5; b ++) {
				for (c = 2; c <= 6; c ++) {
					for (d = 3; d <= 7; d ++) {
						if (a + b + c + d == 10)
							count++;
					}
				}
			}
		}
		System.out.println(count);
	}

}

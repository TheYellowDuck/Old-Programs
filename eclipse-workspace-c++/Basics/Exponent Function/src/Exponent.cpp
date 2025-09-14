#include <iostream>
using namespace std;

double exponent(double num, double pow) {
	double ans = 1;
	for (int i = 0; i < pow; i++)
		ans *= num;
	for (int i = 0; i > pow; i--)
		ans /= num;
	return ans;
}

int main() {
	double num;
	int pow;
	scanf("%lf%*[ ,/\\]%d%*[ ,/\\]", &num, &pow);
	printf("%g\n", exponent(num, pow));
	return 0;
}

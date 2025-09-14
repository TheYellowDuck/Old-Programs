#include <iostream>
using namespace std;

bool equals(double a, double b) {
	return a == b;
}

double max(double a, double b) {
	if (a > b)
		return a;
	return b;
}

double min(double a, double b) {
	if (a < b)
		return a;
	return b;
}

int main() {

	//boolean operators: true, false, !, &&, ||, >=, <=, >, <, ==;

	int f = 0;
	double a = 0, b = 0;
	scanf("%d%*[ ,/\\]%lf%*[ ,/\\]%lf%*[ ,/\\]", &f, &a, &b);
	cout << f << " " << a << " " << b << "\n";
	if (f == 0)
		cout << "Equals: " << equals(a, b) << "\n";
	else if (f < 0)
		cout << "Min: " << min(a, b) << "\n";
	else
		cout << "Max: " << max(a, b) << "\n";

	return 0;
}

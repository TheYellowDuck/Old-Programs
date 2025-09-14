#include <iostream>
using namespace std;

int cube(int x) {
	return x * x * x;
//	cout << "This will not be ran\n";
}

double cube(double x) {
	return x * x * x;
//	cout << "This will not be ran\n";
}

int main() {

	int x;
	cin >> x;
	int ans = cube(x);
	cout << ans << "\n";
	double y;
	cin >> y;
	double ans2 = cube(y);
	cout << ans2 << "\n";

	return 0;
}

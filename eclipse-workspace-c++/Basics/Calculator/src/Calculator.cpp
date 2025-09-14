#include <iostream>

using namespace std;

int main() {
	while (true) {
		double n, m, ans = 0;
		char o;
		scanf(" %lf %c %lf", &n, &o, &m);
		switch(o) {
		case '+' :
			ans = n + m;
			break;
		case '-' :
			ans = n - m;
			break;
		case '*' :
			ans = n * m;
			break;
		case '/' :
			ans = n / m;
			break;
		case '%' :
			ans = (int) n % (int) m;
			break;
		}
		printf(" = %g\n", ans);
//		fflush(stdout);
	}
	return 0;
}

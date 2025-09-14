#include <iostream>
using namespace std;

int main() {

	int i = 10;

	do {
		cout << i-- << "\n";
	} while (i >= 10);

	while (i >= 0)
		cout << i-- << "\n";

	return 0;
}

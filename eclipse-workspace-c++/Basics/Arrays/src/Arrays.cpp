#include <iostream>
using namespace std;

int main() {

	int array[20] = {0, 9, 8, 7, 6, 5, 4, 3, 2, 1};

	array[0] = 10;

	for (auto i : array)
		cout << i << "\n";

	return 0;
}

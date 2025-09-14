#include <iostream>
using namespace std;

string numToDay(int n) {
	switch(n) {
	case 0 :
		return "Sunday";
	case 1 :
		return "Monday";
	case 2 :
		return "Tuesday";
	case 3 :
		return "Wednesday";
	case 4 :
		return "Thursday";
	case 5 :
		return "Friday";
	case 6 :
		return "Saturday";
	default:
		return "Invalid Day Number";
	}
}

int main() {

	cout << numToDay(6) << "\n";

	return 0;
}

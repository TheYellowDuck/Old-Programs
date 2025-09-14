#include <iostream>
using namespace std;

int main() {

	//boolean operators: true, false, !, &&, ||, >=, <=, >, <, ==;

	int age;
	cin >> age;

	if (age < 0)
		cout << "Access is Restricted to Liars.\n";
	else if (age < 18)
		cout << "Restricted Access.\n";
	else
		cout << "Access Granted.\n";

	return 0;
}

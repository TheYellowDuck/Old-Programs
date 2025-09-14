#include <iostream>
using namespace std;

int main() {
	cout << "Hello World! \n";
	cout << "My Name is George." << endl;

	string str;

	str = "Hello World!";
	cout << str << endl;

	cout << str.length() << endl;

	cout << str[0] << endl;
	cout << str[6] << endl;
	str[0] = 'J';
	cout << str << endl;

	cout << str.find('A') << endl;
	cout << str.find('W') << endl;
	cout << str.find("World") << endl;
	cout << str.find("Jello", 6) << endl;
	cout << str.find("World", 0, 6) << endl;

	string substr = str.substr(4, 4);
	cout << substr << endl;

	return 0;
}

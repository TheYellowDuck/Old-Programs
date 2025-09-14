#include <iostream>
using namespace std;

void function(string name, int age);

/*
*void function(string name, int age) {
*	cout << "Hello " << name << ". I'm a Function!!! You are " << age << " years old.\n";
*}
*/

int main() {

	string name;
	int age;

	cout << "Enter your name: ";
	getline(cin, name);

	cout << "Enter your age: ";
	cin >> age;

	cout << "Top\n";
	function(name, age);
	cout << "Bottom\n\n";

	cout << "Enter your name: ";
	cin.ignore();
	getline(cin, name);

	cout << "Enter your age: ";
	cin >> age;

	cout << "Top\n";
	function(name, age);
	cout << "Bottom\n\n";

	cout << "Enter your name: ";
	cin.ignore();
	getline(cin, name);

	cout << "Enter your age: ";
	cin >> age;

	cout << "Top\n";
	function(name, age);
	cout << "Bottom\n\n";

	return 0;
}

void function(string name, int age) {
	cout << "Hello " << name << ". I'm a Function!!! You are " << age << " years old.\n";
}


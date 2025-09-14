#include <iostream>
using namespace std;

int main() {

	int age = 18;
	int *pAge = &age;
	double gpa = 3.8;
	double *pGpa = &gpa;
	string name = "John Smith";
	string *pName = &name;

	//print out memory address of variable

	cout << &age << " " << &gpa << " " << &name << "\n";
	cout << pAge << " " << pGpa << " " << pName << "\n";
	cout << *pAge << " " << *pGpa << " " << *pName << "\n";

	return 0;
}

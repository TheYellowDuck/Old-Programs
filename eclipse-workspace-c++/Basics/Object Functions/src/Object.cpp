#include <iostream>
using namespace std;

class Student {
public :
	string name;
	string major;
	double gpa;

	Student () {
		name = "blank";
		major = "blank";
		gpa = -1;
	}

	Student (string name, string major, double gpa) {
		this -> name = name;
		this -> major = major;
		this -> gpa = gpa;
	}

	bool hasHonors () {
		return gpa >= 3.5;
	}

};

int main() {

	Student student("John Smith", "Business", 2.9);

	Student student2("Pamella White", "Art", 3.7);

	cout << student.name << ": " << (student.hasHonors() ? "Honors" : "No Honors") << "\n";
	cout << student2.name << ": " << (student2.hasHonors() ? "Honors" : "No Honors") << "\n";

	return 0;
}

#include <iostream>
using namespace std;


//scanf / printf is faster than cin / cout
//flush console for larger input
//\n is faster than endl because endl flushes the stream



/*
 * Template for fast input / output with cin / cout
 *
 * #include <bits/stdc++.h>
 * using namespace std;
 *
 * int main() {
 * 	   ios_base::sync_with_stdio(false);
 * 	   //cin.tie(NULL);
 * 	   //cout.tie(NULL);
 * 	   return 0;
 * }
 *
 */



int main() {
	ios_base::sync_with_stdio(false);

	int age;
	string name;
	cout << "Enter your age: ";
	cin >> age;
	cout << "Enter your name: ";
	cin.ignore();
	getline(cin, name);
	cout << name << " is " << age << " years old.\n";

	return 0;
}

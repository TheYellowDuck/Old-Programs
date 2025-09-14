#include <iostream>
using namespace std;

int main() {

	string noun1 = "All", noun2 = "Florida Man", noun3 = "crap", noun4 = "Taco Bell", adjective = "well";

	printf("Enter 4 nouns (separated by Enter): \n");
	getline(cin, noun1);
	getline(cin, noun2);
	getline(cin, noun3);
	getline(cin, noun4);
	printf("Enter an adjective: ");
	getline(cin, adjective);

	printf("Roses are red\n");
	printf("%s are %s\n", noun1.c_str(), adjective.c_str());
	printf("%s takes a %s\n", noun2.c_str(), noun3.c_str());
	printf("at a %s", noun4.c_str());

	return 0;
}

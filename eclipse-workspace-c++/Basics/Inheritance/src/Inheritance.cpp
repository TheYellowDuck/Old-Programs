#include <iostream>
using namespace std;

class Chef {
public:
	void makeChicken () {
		cout << "The Chef Makes Chicken.\n";
	}
	void makeSalad () {
		cout << "The Chef Makes Salad.\n";
	}
	void makeSpecialDish () {
		cout << "The Chef Makes BBQ.\n";
	}
};

class ItalianChef : public Chef {
public :
	void makePasta () {
		cout << "The Chef Makes Pasta.\n";
	}
	void makePizza () {
		cout << "The Chef Makes Pizza.\n";
	}
	void makeSpecialDish () {
		cout << "The Chef Makes Chicken Parm.\n";
	}
};

int main() {

	Chef chef;
	chef.makeChicken();
	chef.makeSpecialDish();

	ItalianChef italianChef;
	italianChef.makeChicken();
	italianChef.makePasta();
	italianChef.makeSpecialDish();

	return 0;
}

#include <iostream>
#include <ctime>
using namespace std;

int main() {

	cout << "Welcome to The Guessing Game!\n";

	while (true) {

		srand((int)time(0));

		int secretnum, l = -1000, r = 1000, maxguesses, numguesses = 0;

		cout << "Enter the range: ";
		fflush(stdout);
		scanf("%d%*[ ,/\\-=]%d%*[ ,/\\-=]", &l, &r);
		cout << "Enter Max Number of Guesses: ";
		cin >> maxguesses;

		secretnum = (rand() % (abs(r - l) + 1)) + min(l, r);

		cout << "Secret Number Generated!\nStart Guessing!\n";

		int guess = secretnum + 1;

		while (guess != secretnum && numguesses < maxguesses) {
			cin >> guess;
			if (numguesses != maxguesses - 1) {
				if (guess < secretnum)
					cout << "Higher!\n";
				else if (guess > secretnum)
					cout << "Lower!\n";
			}
			numguesses++;
		}

		string playagain;

		if (maxguesses >= numguesses && guess == secretnum)
			cout << "BINGO!!!\n";
		else
			cout << "Wrong.\n";
		cout << "Would you like to play again?(yes/no): ";
		cin.ignore();
		getline(cin, playagain);

		if (playagain == "no")
			break;

	}

	cout << "Goodbye!!!\n";

	return 0;
}

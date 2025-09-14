#include <iostream>
using namespace std;

class Movie {

private :
	string rating;

public :
	string title;
	string director;

	Movie () {
		title = "blank";
		director = "blank";
		rating = "NR";
	}

	Movie (string title, string director, string rating) {
		this -> title = title;
		this -> director = director;
		setRating(rating);
	}

	void setRating (string rating) {
		if (rating == "G" || rating == "PG" || rating == "PG - 13" || rating == "R" || rating == "NR")
			this -> rating = rating;
		else
			this -> rating = "NR";
	}

	string getRating () {
		return rating;
	}

};

int main() {

	Movie movie("Avengers", "Joss Whedon", "PG - 13");

	cout << movie.getRating() << "\n";

	return 0;
}

#include <iostream>
using namespace std;

class Book {
public :
	string title;
	string author;
	int pages;

	Book () {
		title = "blank";
		author = "blank";
		pages = 0;
	}

	Book (string title, string author, int pages) {
		this -> title = title;
		this -> author = author;
		this -> pages = pages;
	}
};

int main() {

	Book book("Harry Potter", "JK Rowling", 500);

	Book book2("Lord of the Rings", "JRR Tolkein", 750);

	cout << book.title << "\n" << book.author << "\n" << book.pages << "\n\n" << book2.title << "\n" << book2.author << "\n" << book2.pages << "\n";
	return 0;
}

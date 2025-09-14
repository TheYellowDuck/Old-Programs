#include <iostream>
using namespace std;

class Book {
public :
	string title;
	string author;
	int pages;
};

int main() {

	Book book;
	book.title = "Harry Potter";
	book.author = "JK Rowling";
	book.pages = 500;

	Book book2;
	book2.title = "Lord of the Rings";
	book2.author = "JRR Tolkein";
	book2.pages = 750;

	cout << book.title << "\n" << book.author << "\n" << book.pages << "\n\n" << book2.title << "\n" << book2.author << "\n" << book2.pages << "\n";
	return 0;
}

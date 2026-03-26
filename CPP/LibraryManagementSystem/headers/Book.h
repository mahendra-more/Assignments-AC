#pragma once
#include <iostream>
#include <string>
using namespace std;

namespace LibrarySystem {
    enum class BookStatus { AVAILABLE, ISSUED };
    enum class BookGenre { FICTION, NONFICTION, SCIENCE, HISTORY, OTHER };

    class Book {
    private:
        int bookId;
        string title, author, isbn;
        BookStatus status;
        BookGenre genre;
        int quantity, availableCopies;

    public:
        Book();
        Book(int id, string t, string a, string i, BookStatus s, BookGenre g, int q);
        Book(const Book& other);

        int getId() const;
        string getTitle() const;
        string getAuthor() const;
        string getISBN() const;
        BookStatus getStatus() const;
        BookGenre getGenre() const;
        int getQuantity() const;
        int getAvailableCopies() const;

        bool operator==(const Book& other) const;
        bool operator<(const Book& other) const;
        Book& operator++(); // pre
        Book operator++(int); // post
        Book& operator--();
        Book operator--(int);
        string operator[](int index) const;

        friend ostream& operator<<(ostream& os, const Book& b);
        friend istream& operator>>(istream& is, Book& b);
    };
}
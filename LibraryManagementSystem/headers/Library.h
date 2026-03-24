#pragma once
#include <iostream>
#include <fstream>
#include <vector>
#include <map>
#include "Book.h"
#include "Member.h"
#include "Librarian.h"
#include "Transaction.h"
#include "Container.h"

namespace LibrarySystem {
    class Library {
    private:
        Container<Book> books;
        Container<Member> members;
        vector<Transaction> transactions;
        map<int,int> issuedBooks;

    public:
        Library();

        void addBook(const Book& b);
        void displayBooks() const;
        Book* searchBook(int id);

        void addMember(const Member& m);
        void displayMembers() const;
        Member* searchMember(int id);

        void issueBook(int memberId, int bookId, string issueDate, string dueDate);
        void returnBook(int bookId, string returnDate);

        void saveData();
        void loadData();

        void displayTransactions() const;
    };
}
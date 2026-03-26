#pragma once
#include <iostream>
#include <string>
using namespace std;

namespace LibrarySystem {
    class Transaction {
    private:
        int transactionId, memberId, bookId;
        string issueDate, dueDate, returnDate;
        double fineAmount;

        static int nextTransactionId;
        static const double fineRate;

    public:
        Transaction(int mId, int bId, string issue, string due);

        int getTransactionId() const;
        int getMemberId() const;
        int getBookId() const;
        string getIssueDate() const;
        string getDueDate() const;
        string getReturnDate() const;
        double getFineAmount() const;

        void returnBook(string returnDt);
        void calculateFine();
        void display() const;
    };
}
#pragma once
#include "Person.h"

namespace LibrarySystem {
    class Member : public Person {
    private:
        int booksIssued;
        int* issuedBookIds;
        int capacity;

    public:
        Member(int i, string n, string p, int cap = 5);
        Member(const Member& other);
        ~Member();

        Member& operator=(const Member& other);
        bool operator==(const Member& other) const;

        void displayInfo() const override;

        friend ostream& operator<<(ostream& os, const Member& m);
        friend istream& operator>>(istream& is, Member& m);
    };
}
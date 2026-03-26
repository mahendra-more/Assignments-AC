#pragma once
#include <iostream>
#include <string>
using namespace std;

namespace LibrarySystem {
    class Person {
    protected:
        int id;
        string name, phone;

    public:
        Person(int i, string n, string p);
        virtual ~Person();
        virtual void displayInfo() const = 0;

        int getId() const;
        string getName() const;
        string getPhone() const;
    };
}
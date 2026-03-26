#pragma once
#include "Person.h"

namespace LibrarySystem {
    class Librarian : public Person {
    private:
        int employeeId;
        double salary;

    public:
        Librarian(int i, string n, string p, int empId, double sal);
        void displayInfo() const override;
    };
}
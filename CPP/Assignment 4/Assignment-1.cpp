#include <iostream>
#include <string>
using namespace std;

class Employee {
    int id;
    string name;
    mutable int accessCount; // mutable allows modification in const function

public:
    Employee(int i, string n) : id(i), name(n), accessCount(0) {}

    // Const function increments mutable variable
    void display() const {
        accessCount++;
        cout << "ID: " << id << ", Name: " << name 
             << ", AccessCount: " << accessCount << endl;
    }

    // User-defined copy constructor (deep copy)
    Employee(const Employee &e) {
        id = e.id;
        name = e.name;
        accessCount = e.accessCount;
        cout << "User-defined copy constructor called\n";
    }
};

int main() {
    Employee e1(101, "Mahendra");
    e1.display();
    e1.display();

    Employee e2 = e1; // invokes copy constructor
    e2.display();
    return 0;
}
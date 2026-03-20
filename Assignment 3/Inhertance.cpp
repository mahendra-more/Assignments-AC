#include <iostream>
using namespace std;

// Base class
class Student {
protected:
    int rollNo;

public:
    // Constructor to initialize rollNo
    Student(int r) : rollNo(r) {
        cout << "Student constructor called" << endl;
    }

    // Virtual function
    virtual void display() {
        cout << "Roll Number: " << rollNo << endl;
    }
};

// Derived class
class Result : public Student {
private:
    int marks;

public:
    // Constructor to initialize rollNo and marks
    Result(int r, int m) : Student(r), marks(m) {
        cout << "Result constructor called" << endl;
    }

    // Overriding display()
    void display()  {
        cout << "Roll Number: " << rollNo << ", Marks: " << marks << endl;
    }
};
int main(){
	Result res(777,26);
	Student* s= &res;
	s->display();
}
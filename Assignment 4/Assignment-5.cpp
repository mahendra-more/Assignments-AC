#include <iostream>
using namespace std;

class Number {
    int value;
public:
    Number(int v=0) : value(v) {}

    friend bool operator>(const Number &a, const Number &b) {
        return a.value > b.value;
    }

    friend class Inspector;

    Number& operator++() { // pre-increment
        ++value; return *this;
    }

    Number operator++(int) { // post-increment
        Number temp = *this;
        value++;
        return temp;
    }

    Number& operator=(const Number &n) {
        value = n.value;
        return *this;
    }

    void show() { cout << value << endl; }
};

class Inspector {
public:
    void inspect(const Number &n) {
        cout << "Inspector sees value: " << n.value << endl;
    }
};
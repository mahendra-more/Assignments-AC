#include <iostream>
using namespace std;

class DivideByZero : public exception {
public:
    const char* what() const throw() {
        return "Divide by zero error!";
    }
};

int divide(int a, int b) throw(DivideByZero) {
    if (b == 0) throw DivideByZero();
    return a / b;
}

int main() {
    try {
        try {
            cout << divide(10, 0);
        } catch (DivideByZero &e) {
            cout << "Inside inner catch\n";
            throw; // rethrow
        }
    } catch (DivideByZero &e) {
        cout << "Handled in outer catch\n";
    }
    return 0;
}
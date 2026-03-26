#include <iostream>
using namespace std;

class Vector {
    int *arr;
    int size;
public:
    Vector(int s) : size(s) {
        arr = new int[size];
        for (int i = 0; i < size; i++) arr[i] = 0;
    }
    ~Vector() { delete[] arr; }

    int& operator[](int index) { return arr[index]; }

    int operator()() {
        int sum = 0;
        for (int i = 0; i < size; i++) sum += arr[i];
        return sum;
    }

    void display() {
        for (int i = 0; i < size; i++) cout << arr[i] << " ";
        cout << endl;
    }
};

int main() {
    // Create a vector of size 5
    Vector v(5);

    // Assign values using operator[]
    v[0] = 10;
    v[1] = 20;
    v[2] = 30;
    v[3] = 40;
    v[4] = 50;

    cout << "Vector elements: ";
    v.display();

    // Modify one element
    v[2] = 100;
    cout << "After modifying v[2]: ";
    v.display();

    // Use operator() to compute sum
    cout << "Sum of elements: " << v() << endl;

    return 0;
}
#include <iostream>
#include <fstream>
using namespace std;

class Student {
    int roll;
    string name;
    float marks;

public:
    Student(int r, string n, float m) : roll(r), name(n), marks(m) {}
    ~Student() { cout << "Destroying student " << name << endl; }

    void display() {
        cout << roll << " " << name << " " << marks << endl;
    }

    void writeToFile(ofstream &out) {
        out << roll << " " << name << " " << marks << endl;
    }
};

int main() {
    Student arr[3] = {
        Student(1, "A", 90),
        Student(2, "B", 85),
        Student(3, "C", 88)
    };

    ofstream fout("students.txt");
    for (int i = 0; i < 3; i++) arr[i].writeToFile(fout);
    fout.close();

    ifstream fin("students.txt");
    string line;
    cout << "\nReading file:\n";
    while (getline(fin, line)) cout << line << endl;
    fin.close();
    return 0;
}
#include <iostream>
#include <cstring>
using namespace std;

class String {
    char *str;
public:
    String(const char *s="") {
        str = new char[strlen(s)+1];
        strcpy(str, s);
    }

    // Copy constructor (deep copy)
    String(const String &s) {
        str = new char[strlen(s.str)+1];
        strcpy(str, s.str);
    }

    // Destructor
    ~String() { delete[] str; }

    // Assignment operator (deep copy)
    String& operator=(const String &s) {
        if (this != &s) {
            delete[] str;
            str = new char[strlen(s.str)+1];
            strcpy(str, s.str);
        }
        return *this;
    }

    // Concatenation
    String operator+(const String &s) {
        char *temp = new char[strlen(str)+strlen(s.str)+1];
        strcpy(temp, str);
        strcat(temp, s.str);
        String result(temp);
        delete[] temp;
        return result;
    }

    // Output operator
    friend ostream& operator<<(ostream &out, const String &s) {
        out << s.str;
        return out;
    }

    // Input operator
    friend istream& operator>>(istream &in, String &s) {
        char buffer[100];
        in >> buffer;
        delete[] s.str;
        s.str = new char[strlen(buffer)+1];
        strcpy(s.str, buffer);
        return in;
    }
};

int main() {
    String s1, s2;

    cout << "Enter first string: ";
    cin >> s1;
    cout << "Enter second string: ";
    cin >> s2;

    // Concatenate
    String s3 = s1 + s2;

    cout << "\nString 1: " << s1;
    cout << "\nString 2: " << s2;
    cout << "\nConcatenated String (s3): " << s3 << endl;

    // Demonstrate deep copy
    String s4 = s1; // copy constructor
    cout << "Copied String (s4): " << s4 << endl;

    return 0;
}
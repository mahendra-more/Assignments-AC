#include <iostream>
using namespace std;

class Matrix {
    int rows, cols;
    int **data;

public:
    Matrix(int r, int c) : rows(r), cols(c) {
        data = new int*[rows];
        for (int i = 0; i < rows; i++)
            data[i] = new int[cols];
    }

    ~Matrix() {
        for (int i = 0; i < rows; i++) delete[] data[i];
        delete[] data;
    }

    friend istream& operator>>(istream &in, Matrix &m) {
        cout << "Enter elements (" << m.rows << "x" << m.cols << "):\n";
        for (int i = 0; i < m.rows; i++)
            for (int j = 0; j < m.cols; j++)
                in >> m.data[i][j];
        return in;
    }

    friend ostream& operator<<(ostream &out, const Matrix &m) {
        for (int i = 0; i < m.rows; i++) {
            for (int j = 0; j < m.cols; j++)
                out << m.data[i][j] << " ";
            out << endl;
        }
        return out;
    }

    Matrix operator+(const Matrix &m) {
        Matrix temp(rows, cols);
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                temp.data[i][j] = data[i][j] + m.data[i][j];
        return temp;
    }

    bool operator==(const Matrix &m) {
        if (rows != m.rows || cols != m.cols) return false;
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                if (data[i][j] != m.data[i][j]) return false;
        return true;
    }
};

int main() {
    int r, c;
    cout << "Enter rows and cols: ";
    cin >> r >> c;

    Matrix m1(r, c), m2(r, c);

    cin >> m1;
    cin >> m2;

    cout << "\nMatrix 1:\n" << m1;
    cout << "Matrix 2:\n" << m2;

    Matrix m3 = m1 + m2;
    cout << "\nSum Matrix:\n" << m3;

    if (m1 == m2)
        cout << "\nMatrices are equal.\n";
    else
        cout << "\nMatrices are NOT equal.\n";

    return 0;
}
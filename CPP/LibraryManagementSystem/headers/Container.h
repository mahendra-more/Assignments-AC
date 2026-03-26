#pragma once
#include <iostream>
#include <string>
using namespace std;

namespace LibrarySystem {
    template <typename T>
    class Container {
    private:
        T* arr;
        int size, capacity;

    public:
        Container(int cap = 10);
        Container(const Container& other);
        Container& operator=(const Container& other);
        ~Container();

        void add(const T& item);
        void remove(int index);
        T* find(int id);
        T* find(const string& name);
        void displayAll() const;

        int getSize() const;
        int getCapacity() const;
    };
}
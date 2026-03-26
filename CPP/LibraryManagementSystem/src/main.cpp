#include "../headers/Library.h"
using namespace LibrarySystem;

int main() {
    Library lib;
    int choice;
    do {
        cout << "\n--- Library Menu ---\n";
        cout << "1. Add Book\n2. Display Books\n3. Add Member\n4. Display Members\n";
        cout << "5. Issue Book\n6. Return Book\n7. Save Data\n8. Load Data\n9. View Transactions\n0. Exit\n";
        cout << "Enter choice: ";
        cin >> choice;

        try {
            if (choice == 1) {
                Book b;
                cin >> b;
                lib.addBook(b);
            } else if (choice == 2) {
                lib.displayBooks();
            } else if (choice == 3) {
                Member m(0,"","");
                cin >> m;
                lib.addMember(m);
            } else if (choice == 4) {
                lib.displayMembers();
            } else if (choice == 5) {
                int mid, bid;
                cout << "Enter Member ID and Book ID: ";
                cin >> mid >> bid;
                lib.issueBook(mid, bid, "20260324", "20260401");
            } else if (choice == 6) {
                int bid;
                cout << "Enter Book ID: ";
                cin >> bid;
                lib.returnBook(bid, "20260405");
            } else if (choice == 7) {
                lib.saveData();
            } else if (choice == 8) {
                lib.loadData();
            } else if (choice == 9) {
                lib.displayTransactions();
            }
        } catch (exception& e) {
            cout << "Error: " << e.what() << endl;
        }

    } while (choice != 0);

    return 0;
}
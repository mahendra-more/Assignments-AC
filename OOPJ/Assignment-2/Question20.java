package Assi2;
import java.util.*;

class Book {
    int bookID;
    String bookName;

    Book(int bookID, String bookName) {
        this.bookID = bookID;
        this.bookName = bookName;
    }
}

class Library {
    void display(Book b[]) {
        System.out.println("\n--- Book Details ---");
        for (int i = 0; i < b.length; i++) {
            if (b[i] != null) {
                System.out.println("Book ID: " + b[i].bookID);
                System.out.println("Book Name: " + b[i].bookName);
                System.out.println("----------------------");
            }
        }
    }
}

public class Question20 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of books:");
        int n = sc.nextInt();

        Book B[] = new Book[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter book id:");
            int id = sc.nextInt();
            sc.nextLine();  // consume newline

            System.out.println("Enter book name:");
            String name = sc.nextLine();

            B[i] = new Book(id, name);
        }

        Library lib = new Library();
        lib.display(B);

        sc.close();
    }
}
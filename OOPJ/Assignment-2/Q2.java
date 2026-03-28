import java.util.*;
class Student {

    String name;
    int roll;
    int marks[];

    int total;
    double average;
    char grade;

    // constructor
    Student(String name, int roll, int marks[]) {
        this.name = name;
        this.roll = roll;
        this.marks = marks;
    }

    // calculate method
    void calculateResult() {

        total = 0;

        for (int m : marks) {
            total += m;
        }

        average = total / 5.0;

        if (average >= 90)
            grade = 'A';
        else if (average >= 75)
            grade = 'B';
        else if (average >= 60)
            grade = 'C';
        else if (average >= 40)
            grade = 'D';
        else
            grade = 'F';
    }

    // display method
    void displayResult() {

        System.out.println("\n----- Student Result -----");
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + roll);
        System.out.println("Total Marks: " + total);
        System.out.println("Average: " + average);
        System.out.println("Grade: " + grade);

        if (average >= 40 && average<=49)
            System.out.println("Status: Promoted");
        else
            System.out.println("Status: Failed");
    }
}


public class Q2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Roll Number: ");
        int roll = sc.nextInt();

        int marks[] = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter marks of subject " + (i + 1) + ": ");
            marks[i] = sc.nextInt();
        }

        // create object
        Student s = new Student(name, roll, marks);

        // call methods
        s.calculateResult();
        s.displayResult();
    }
    
}

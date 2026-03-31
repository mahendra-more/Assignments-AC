class Student {
    int roll;
    String name;
    int[] marks;
    String phone, email;
    static int count = 0;

    Student(int roll, String name, int[] marks, String phone, String email) {
        this.roll = roll;
        this.name = name;
        this.marks = marks;
        this.phone = phone;
        this.email = email;
        count++;
    }

    int total() {
        int sum = 0;
        for (int m : marks) sum += m;
        return sum;
    }

    double average() {
        return (double) total() / marks.length;
    }

    void display() {
        System.out.println(roll + " " + name + " Total: " + total() + " Avg: " + average());
    }
}

public class Q1 {
    public static void main(String[] args) {
        Student s1 = new Student(1, "Mahendra", new int[]{80,90,85}, "999", "a@mail");
        s1.display();
        System.out.println("Total Students: " + Student.count);
    }
}
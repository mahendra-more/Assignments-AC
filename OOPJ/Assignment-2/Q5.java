import java.util.*;
class Employee {

    String name;
    int id;
    double basic;

    // constructor
    Employee(String name, int id, double basic) {
        this.name = name;
        this.id = id;
        this.basic = basic;
    }

    void generateSalarySlip() {

        double hra = basic * 0.20;
        double da = basic * 0.10;
        double pf = basic * 0.08;

        double net = basic + hra + da - pf;

        System.out.println("\n----- Salary Slip -----");
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + id);
        System.out.println("Basic Salary: " + basic);
        System.out.println("HRA: " + hra);
        System.out.println("DA: " + da);
        System.out.println("PF: " + pf);
        System.out.println("Net Salary: " + net);
    }
}


public class Q5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter ID: ");
        int id = sc.nextInt();

        System.out.print("Enter Basic Salary: ");
        double basic = sc.nextDouble();

        // create object of Employee class
        Employee emp = new Employee(name, id, basic);

        // call method
        emp.generateSalarySlip();
    }
}
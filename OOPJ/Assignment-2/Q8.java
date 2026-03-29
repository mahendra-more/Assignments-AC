class Patient {
    // Attributes as per requirements 
    int patientID;
    String patientName;
    int age;
    String disease;

    // Constructor to initialize patient objects 
    Patient(int id, String name, int age, String disease) {
        this.patientID = id;
        this.patientName = name;
        this.age = age;
        this.disease = disease;
    }

    // Method to check if patient is a senior citizen (60 or above) 
    boolean isSeniorCitizen() {
        return this.age >= 60;
    }

    // Method to display patient details in a clean format [cite: 101]
    void displayDetails() {
        System.out.println("ID: " + patientID);
        System.out.println("Name: " + patientName);
        System.out.println("Age: " + age);
        System.out.println("Disease: " + disease);
        System.out.println("Senior Citizen: " + (isSeniorCitizen() ? "Yes" : "No"));
        System.out.println("---------------------------");
    }
}

public class Q8 {
    public static void main(String[] args) {
        // Creating at least 3 patient objects 
        Patient p1 = new Patient(101, "Aman Sharma", 45, "Fever");
        Patient p2 = new Patient(102, "Bina Rai", 65, "Diabetes");
        Patient p3 = new Patient(103, "Chiranjeev Singh", 72, "Hypertension");

        System.out.println("=== Hospital Patient Records ===\n");

        // Displaying patient details [cite: 101]
        p1.displayDetails();
        p2.displayDetails();
        p3.displayDetails();
    }
}
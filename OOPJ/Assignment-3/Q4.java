class Contact {
    String phone, email;
    Contact(String p, String e) {
        phone = p; email = e;
    }
}

class Patient {
    int id, age;
    String name, disease;
    Contact contact;
    static int count = 0;

    Patient(int id, String name, int age, String disease, Contact c) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.disease = disease;
        this.contact = c;
        count++;
    }

    void display() {
        String status = (age >= 60) ? "Senior" : "Normal";
        System.out.println(name + " " + disease + " " + status);
    }
}

public class Q4 {
    public static void main(String[] args) {
        Patient p = new Patient(1, "Raj", 65, "Fever", new Contact("999","a@mail"));
        p.display();
    }
}
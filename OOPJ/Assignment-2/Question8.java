package Assi2;
import java.util.*;

class Patient{
	 int patientId;
	 String name;
	 int age;
	 String disease;

	    Patient(int patientId, String name, int age, String disease) {
	        this.patientId = patientId;
	        this.name = name;
	        this.age = age;
	        this.disease = disease;
	    }
	    void display() {
	        System.out.println("Patient ID   : " + patientId);
	        System.out.println("Name         : " + name);
	        System.out.println("Age          : " + age);
	        System.out.println("Disease      : " + disease);

	        if (isSeniorCitizen()) {
	            System.out.println("Status       : Senior Citizen");
	        } else {
	            System.out.println("Status       : Not Senior Citizen");
	        }
	    }
	    boolean isSeniorCitizen() {
	        return age >= 60;
	    }
}
public class Question8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		Patient p[] = new Patient[3];
        
		for(int i = 0 ; i < 3 ; i++)
		{
			 System.out.println("Enter Patient ID:");
			    int patientId = sc.nextInt();

			    System.out.println("Enter Name:");
			    String name = sc.next();

			    System.out.println("Enter Age:");
			    int age = sc.nextInt();

			    System.out.println("Enter Disease:");
			    String disease = sc.nextLine();

			    p[i] = new Patient(patientId, name, age, disease);
		}
		 for (int i = 0; i < 3; i++) {
		        p[i].display();
		    }
	}

}

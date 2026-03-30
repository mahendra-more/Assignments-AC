package Assi2;
class Student{
	String name;
	int rollno;
	static int totalStudent = 0;
	Student(String name , int rollno)
	{
		this.name = name;
		this.rollno = rollno;
		totalStudent++;
	}
	static int displayStudent()
	{
		return totalStudent;
	}
}
public class Question12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student("omkar" , 12);
		Student s2 = new Student("omkar" , 12);
		Student s3 = new Student("omkar" , 12);
		
		System.out.println(s3.displayStudent());
	}
}

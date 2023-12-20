package trial;

public class Student {

	public static void main(String[] args) {

		StudentDetails studentDetails = new StudentDetails();
		Service service = new Service(studentDetails);
		service.show("Sahil", 100, 35);

	}
}

class Service {

	private StudentDetails studentDetails;

	public Service(StudentDetails studentDetails) {
		this.studentDetails = studentDetails;
	}

	public void show(String name, int marks, int rollNo) {
		System.out.println("Your name  : " + name);
		System.out.println("Your Marks : " + marks);
		System.out.println("Your RollNo : " + rollNo);
	}

}

class StudentDetails {

	private String name;
	private int marks;
	private int rollNo;

	public void setName(String name) {
		this.name = name;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

}
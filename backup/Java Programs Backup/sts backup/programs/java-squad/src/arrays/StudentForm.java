package arrays;

import java.time.LocalDate;

public class StudentForm {

	public static void main(String[] args) {
		
		Student[] students = studentData();
	
		for (int index = 0; index < 3; index++) {
			System.out.println(index);
		}
	
		for (int index = 0; index < students.length; index++) {
			Student student = students[index];
			System.out.println(student);
		}
	
	}

	private static Student[] studentData() {
		Student aarnav = new Student(101, "aarnav", 8003628883l, "duc101", LocalDate.parse("2023-03-15"));
		Student prabhjeet = new Student(102, "prabhjeet", 8178110204l, "duc102", LocalDate.parse("2023-03-16"));
		Student sadaf = new Student(105, "sadaf", 7982452518l, "duc119", LocalDate.parse("2023-02-10"));
		
		Student[] students = {aarnav, prabhjeet, sadaf};
		
//	Student student = students[2]; 
//		System.out.println(prabhjeet.toString());
//		System.out.println(aarnav.toString());
//		System.out.println(sadaf.toString());
//		System.out.println(student);
		
		return students;
	}

}

class Student {

	private long id;
	private String name;
	private long mobileNumber;
	private String ducatId;
	private LocalDate joiningDate;

	public Student() {

	}

	public Student(long id, String name, long mobileNumber, String ducatId, LocalDate joiningDate) {
		this.id = id;
		this.name = name;
		this.mobileNumber = mobileNumber;
		this.ducatId = ducatId;
		this.joiningDate = joiningDate;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getDucatId() {
		return ducatId;
	}

	public void setDucatId(String ducatId) {
		this.ducatId = ducatId;
	}

	public LocalDate getJoiningDate() {
		return joiningDate;
	}

	public void setJoiningDate(LocalDate joiningDate) {
		this.joiningDate = joiningDate;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", mobileNumber=" + mobileNumber + ", ducatId=" + ducatId
				+ ", joiningDate=" + joiningDate + "]";
	}
	
	

}

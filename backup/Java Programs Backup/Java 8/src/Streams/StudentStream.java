package Streams;

import java.util.stream.Stream;

public class StudentStream {

	public static void main(String[] args) {
		StudentService studentService = new StudentService();
		studentService.processFemaleStudent();
		studentService.processMaleStudent();
	}

}
enum Gender {
	MALE, FEMALE
}

class Student {
	private long id;
	private String name;
	private Gender gender;

	public Student(long id, String name, Gender gender) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
	}

	public long getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}

	public Gender getGender() {
		return gender;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", gender=" + gender + "]";
	}
}

class StudentService{
	
	public void processFemaleStudent() {
		Stream<Student> streamOfStudent = getStudentStream();
		Stream<Student> streamOfFemaleStudent = streamOfStudent.
				filter((Student student) -> {return student.getGender().equals(Gender.FEMALE);});
		streamOfFemaleStudent.forEach((femaleStudent) -> System.out.println(femaleStudent));
		
	}
	public void processMaleStudent() {
		Stream<Student> streamOfStudent = getStudentStream();
		Stream<Student> streamOfMaleStudent=streamOfStudent.filter(student -> student.getGender().equals(Gender.MALE));
		streamOfMaleStudent.forEach(MaleStudent -> System.out.println(MaleStudent));
	}
	

	private Stream<Student> getStudentStream() {
		return Stream.of(new Student(101,"Aditi",Gender.FEMALE),  
				new Student(102,"Vansh",Gender.MALE), 
				new Student(103,"Sakshi",Gender.FEMALE),
				new Student(104,"Sadaf",Gender.FEMALE),
				new Student(105,"Akshat",Gender.MALE),
				new Student(106,"Prabhjeet",Gender.MALE),
				new Student(107,"Yuvraj",Gender.MALE),
				new Student(108,"Sahil",Gender.MALE),
				new Student(109,"Vishwa",Gender.MALE),
				new Student(110,"Sahil Kumar",Gender.MALE));
	}
}

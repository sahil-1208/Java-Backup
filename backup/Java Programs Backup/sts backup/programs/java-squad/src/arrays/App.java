package arrays;

import java.time.LocalDate;


public class App {
	
	public static void main(String[] args) {	
		Service service = new ServiceImpl();
		Controller controller = new Controller(service);
		controller.prepareDoctor();
	}
}

interface Service {
	public abstract void prepare();
}

class ServiceImpl implements Service {

	@Override
	public void prepare() {
		Employee[] employees = EmployeeDataSource.employeeData();
		
		for (int index = 0; index < employees.length; index++) {
			Employee employee = employees[index];
			System.out.println(employee);
		}
	}
	
}

class Controller {
	
	private Service service;
	
	public Controller(Service service) {
		this.service = service;		
	}
	
	public void prepareDoctor() {		
		service.prepare();
	}
	
}

class EmployeeDataSource {
	
	
	public static Employee[] employeeData() {
		Employee aarnav = new Employee(101, "aarnav", 8003628883l, "duc101", LocalDate.parse("2023-03-15"));
		Employee prabhjeet = new Employee(102, "prabhjeet", 8178110204l, "duc102", LocalDate.parse("2023-03-16"));
		Employee sadaf = new Employee(103, "sadaf", 7982452518l, "duc119", LocalDate.parse("2023-02-10"));
		Employee sahil = new Employee(104, "sahil", 8003628883l, "duc101", LocalDate.parse("2023-03-15"));
		Employee akhil = new Employee(105, "akhil", 8178110204l, "duc102", LocalDate.parse("2023-03-16"));
		Employee vansh = new Employee(106, "vansh", 7982452518l, "duc119", LocalDate.parse("2023-02-10"));
		
		Employee[] employees = {aarnav, prabhjeet, sadaf, sahil, akhil, vansh};
		return employees;
	}
}


class Employee {

	private long id;
	private String name;
	private long mobileNumber;
	private String ducatId;
	private LocalDate joiningDate;

	public Employee() {

	}

	public Employee(long id, String name, long mobileNumber, String ducatId, LocalDate joiningDate) {
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
		return "Employee [id=" + id + ", name=" + name + ", mobileNumber=" + mobileNumber + ", ducatId=" + ducatId
				+ ", joiningDate=" + joiningDate + "]";
	}
	
	

}

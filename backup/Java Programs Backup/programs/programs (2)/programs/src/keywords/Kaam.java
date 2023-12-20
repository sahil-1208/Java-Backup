package keywords;

import java.time.LocalDate;

public class Kaam {

	public static void main(String[] args) {
	new Data().printData();
		//new SuperData();
		//new Data(22);
//		new Data("sachin");
//		new Data (22 ,"sachin");
		
	}

}

class Service{
	
}

class Controller{
	
	private final Service service;
	
	public Controller(Service service) {
		this.service = service;			
	}
	
}

class SuperData{
	LocalDate date;
	
	public SuperData() {
		this(LocalDate.now());
		System.out.println("non param ");
		this.date = LocalDate.now();
	}
	public SuperData(LocalDate date){
		System.out.println("parameterized");
	}
	void display()
	{
	System.out.println(this.date);	
	}
}

class Data extends SuperData {
	private int id;
	private String name;

	public Data() {
	this(22);				// constructor calling
//	super();
		System.out.println("non param constructor");
	}

	public Data(int id) {
		this("naam");
		System.out.println("int param constructor");
	}

	public Data(String name) {
		this(22,"naam");
		System.out.println("name param constructor");
	}

	public Data(int id, String name) {
		
		System.out.println("int and name param constructor");
		
	}
	void printData() {
	System.out.println(this.id);
	System.out.println(this.name);
	System.out.println(super.date);
	}
	

}

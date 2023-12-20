package ControlFlow;

public class Client {
	public static void main(String[] args) {
		Services  service = new Services();
		Category category= new Category();
		category.setType("offline");
		service.CreateCustomer(102,"Aarnav",category);
	}

}

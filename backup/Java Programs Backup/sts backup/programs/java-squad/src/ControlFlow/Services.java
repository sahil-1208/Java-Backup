package ControlFlow;

public class Services {

void CreateCustomer( int id, String name, Category category) {
	Customer customer = new Customer();
	customer.setId(id);
	customer.setName(name);
	customer.setCategory(category);
	
	
}
	Customer findCustomer()
	{
		Category category = new Category(); 
		category.setType("online");
		
		Customer customer = new Customer();
		customer.setId(101);
		customer.setName("Sahil");
		customer.setCategory(category);
		return customer;
		
	}
}

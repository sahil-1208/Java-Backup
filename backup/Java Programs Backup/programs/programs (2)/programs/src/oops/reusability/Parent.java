package oops.reusability;

public class Parent {

	int parentMoney = 500;
	
	void deposit() {

	}
}


class Child extends Parent {
	
	int childMoney = 200;
	
	void payBill() {
		System.out.println(childMoney);
		System.out.println(parentMoney); // reuse from parent class
		//System.out.println(xyz);
		
		deposit();
	}
	
}

class Stranger {
	
	int childMoney = 200;
	
	void payBill() {
//		System.out.println(childMoney);
//		System.out.println(parentMoney); 
//		System.out.println(xyz);
//		
//		deposit();
	}
	
}
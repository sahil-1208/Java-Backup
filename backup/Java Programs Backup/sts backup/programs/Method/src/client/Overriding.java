package client;

public class Overriding {

	public static void main(String[] args) {
	
		Parent parent = new Parent();
		
		Child child = new Child();
		
		Parent parentRef = new Child();
		
		// Child childRef = new Parent(); Not Possible
		
		System.out.println(parent.canWeHaveAKiss());
		parent.letsGoForWalk();
		
		System.out.println(child.canWeHaveAKiss());
		child.letsGoForWalk();
		
		System.out.println(parentRef.canWeHaveAKiss());
		parentRef.letsGoForWalk();
		
		System.out.println(child.canWeForePlay());
		//System.out.println(parentRef.canWeForePlay()); Not possible coz parent reference can  access parent specific method
	}

}

class Parent {
	
	boolean canWeHaveAKiss() {
		return true;
	}
	
	void letsGoForWalk() {
		System.out.println("Sure sweet heart");
	}
	
}

class Child extends Parent {
	
	
	// same method signature and same return type, scope cannot be degrade
	
	@Override
	boolean canWeHaveAKiss() {
		return false;
	}
	
	boolean canWeForePlay() {
		return true;
	}
}

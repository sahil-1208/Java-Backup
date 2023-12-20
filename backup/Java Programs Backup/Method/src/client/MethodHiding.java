package client;

public class MethodHiding {

	public static void main(String[] args) {
	
		Super parent = new Super();
		
		Sub child = new Sub();
		
		Super parentRef = new Sub();
		
		
		System.out.println(parent.canWeHaveAKiss());     //true
		parent.letsGoForWalk();     					//Sure Sweet Heart
		
		System.out.println(child.canWeHaveAKiss());     // false
		child.letsGoForWalk();							// Sure Sweet Heart
		
		System.out.println(parentRef.canWeHaveAKiss());  //true 
		parentRef.letsGoForWalk();        				 // Sure Sweet Heart
		
		System.out.println(child.canWeForePlay());		// true 
		//System.out.println(parentRef.canWeForePlay()); Not possible coz parent reference can be access parent specific method
	}

}

class Super {
	
	 static boolean canWeHaveAKiss() {
		return true;
	}
	
	static void letsGoForWalk() {
		System.out.println("Sure sweet heart");
	}
	
}

class Sub extends Super {
	
	
	// same method signature and same return type, scope cannot be degrade
	
	static boolean canWeHaveAKiss() {
		return false;
	}
	
	static boolean canWeForePlay() {
		return true;
	}
}

package demo1;

public class kb {

	public static void main(String[] args) {
		Parent parent =  new Child();
		parent.show();
		
	}

}
 class Parent{
	 public void show()
	 {
		 System.out.println("hello");
	 }
}
class Child extends Parent{
	
	public void display()
	{
		System.out.println("hii");
	}
	
}

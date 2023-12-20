package day6;

public class Finaldemo {
 
	public static void main(String[] args) {
	 int a = 5;
	  a = 10;
	  System.out.println(a);
	    // final keyword doesn't let you change the assigned value
	    // a final cannot be inherited
	    // a final method cannot be override
	  
	  final int c = 10;
	  System.out.println(c);
	  c = 12 ;
	
	  Demo3 demo  = new Demo3();
	  demo.show();
	  demo.add(10, 20);
	  demo.add(30, 10);
	   
	  
	}
}

 final class Demo2{
	
	 public void show()
	 {
		 System.out.println("hello");
	 }
	  
	 
	final public void add(int a, int b)
	  {
		  System.out.println(a+b);
	  }
	 
}
 class Demo3 extends Demo2
 {
	 public void show()
	 {
		 System.out.println("hii");
	 }
	 
//	 public void add(int a ,int b)
//	  {
//		  System.out.println(a-b);
//	  }
	 
 }
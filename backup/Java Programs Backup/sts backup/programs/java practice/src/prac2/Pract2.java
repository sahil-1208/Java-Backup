package prac2;
public class Pract2 {
	static String name="sahil";
	static int age = 22;
	static  String course = "MCA";
	static void printData() {
	  System.out.println(name);
	  System.out.println(age);
	  System.out.println(course);
	}
	  void display() {
		  System.out.println("hello");
	  }
	  void show(int a)
	  {
		  System.out.println("hoja print");
	  }
	public static void main(String[] args) {
		Pract2 p1= new Pract2();
		p1.display();
		printData();
		
	}

}

package array;

public class ArrayExample {
	  static String gwagon;
	  static String supra;
	  static String rangerover;
	  static String lambo;
	  static String buggati;

	public static void main(String[] args)
	{
			Car gwagon = new Car();
			gwagon.name="G-wagon";
		
			Car supra = new Car();
			supra.name="Supra";
			
			Car rangerover = new Car();
			rangerover.name="RangeRover";
			
			Car lambo = new Car();
			lambo.name="Lamborghini";
			
			
		Car[] c = {gwagon,supra,rangerover,lambo};
			
//		Car car = c[0]; 
//		System.out.println(car.name);
//      Arraytype anyVariable : arrayRefrence;
		
//		Car var : c
		for(Car var : c) {
			System.out.println(var.name);
		}
	}

	 static  void carsArray(){
		 gwagon = "G-wagon";
		 supra = "Supra";
		 rangerover = "RangeRover";
		 lambo = "Lamborghini";
		 buggati = "Buggati";
		 
		//	 String[] myFav = {"G-wagon","Supra","RangeRover","lamborghini"};
		//	  String names = myFav[0];
		//	 System.out.println(myFav[0]);
	}
}
class Car{
	 String brand;
	 String name;
}
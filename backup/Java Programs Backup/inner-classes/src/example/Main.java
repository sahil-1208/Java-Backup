package example;

public class Main {

	public static void main(String[] args) {
		// nested class call
		Car.Mercedes mercedes = new Car.Mercedes();
		mercedes.show("Mercedes Benz G Class");

		// inner class call
		Car car = new Car();
		Car.Lamborghini lamborghini = car.new Lamborghini();
		lamborghini.display("Lamborghini Aventador");

		// anonymous class call
		Cars toyato = new Cars() {

			public void brands() {
				System.out.println("Let’s Go Places");
			}

		};

		Cars volkswagen = new Cars() {

			public void brands() {
				System.out.println("Drive Bigger");
			}

		};

		Cars hyundai = new Cars() {

			public void brands() {
				System.out.println("New Thinking, New Possibilities");
			}

		};
		toyato.brands();
		volkswagen.brands();
		hyundai.brands();
		
		//method local class call
		carType("coupe");
	}
	
			//method local class
	static void carType(String cartype) {
		
		class CarNotFoundException extends RuntimeException{
			
			public CarNotFoundException(String message) {
				super(message);
			}
			
		}
		
		if(cartype == "convertible") {
			System.out.println("Car Type Exist ");
		}
		else {
			throw new CarNotFoundException(cartype + " Car Type does'nt exist ");
		}
	}
	
	
}

class Car {

	// nested class
	static class Mercedes {

		public void show(String name) {
			System.out.println(name);
		}

	}

	// inner class
	class Lamborghini {

		public void display(String name) {
			System.out.println(name);
		}
	}

}

//anonymous class 
interface Cars {

	public abstract void brands();
}

 

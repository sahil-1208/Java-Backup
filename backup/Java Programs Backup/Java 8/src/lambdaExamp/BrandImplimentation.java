package lambdaExamp;

public class BrandImplimentation {

	public static void main(String[] args) {

		Brand brandAnonymous = new Brand() {

			@Override
			public void apple() {
				System.out.println("Think Diffrent" + " " + "Brand Anonymous");
			}
		};
		brandAnonymous.apple();

		Brand brandLambda = () -> {System.out.println("Think Diffrent" + " " + "Brand Lambda");};
		brandLambda.apple();

		Car carAnonymous = new Car() {

			@Override
			public void accept(String name) {
				System.out.println(name);
			}
		};
		carAnonymous.accept("Mercedes Benz G Class");

		Car carLambda = (String name) -> {System.out.println(name);};
		carLambda.accept("Lamborghini Aventador");

		User userAnonymous = new User() {

			@Override
			public String user() {
				return "Sahil";
			}
		};
		System.out.println(userAnonymous.user() + " " + "User Anonymous");

		User userLambda = () -> {return "Sahil";};
		System.out.println(userLambda.user() + " " + "User Lambda");

		Customer customerAnonymous = new Customer() {

			@Override
			public int characters(String name) {
				return name.length();
			}
		};
		System.out.println(customerAnonymous.characters("Sidhu Moosewala"));

		Customer customerLambda = (String name) -> {return name.length();};
		System.out.println(customerLambda.characters("Karan Aujla"));

	}

}

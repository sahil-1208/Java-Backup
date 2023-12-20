package oops.reusability;

public class MaggiMaking extends Utensil {

	public void prepare() {
		System.out.println("prepare starts");
		
		// Has A : class MaggiMaking has a object reference of Ingredient
		Ingredient ingredient = new Ingredient();

		// reuse
		String maggi = ingredient.maggiPacket;
		String veggi = ingredient.veggi;
		int waterQuantity = ingredient.cupOfWater;
		String cheese = ingredient.cheese;

		// Is A : class MaggiMaking is a child class of Utensil
		
		// reuse
		String knife = knife();
		String pan = pan();
		String fork = fork();
		String bowl = bowl();
		
		cutting(knife, veggi);
		boilWater(pan, waterQuantity);
		cook(maggi, veggi);
		addCheese(cheese);
		serve(bowl, fork);
		System.out.println("prepare ends");
	}

	private void cutting(String knife, String veg) {
		System.out.println("cutting " + knife + " " +veg);
	}

	private void boilWater(String pan, int cupOfWater) {
		System.out.println("boilWater " + pan + " " + cupOfWater);
	}

	private void cook(String maggie, String veg) {
		System.out.println("cook " + maggie + " " + veg);
	}

	private void addCheese(String cheese) {
		System.out.println("addCheese " + cheese);
	}
	
	private void serve(String bowl, String fork) {
		System.out.println("serve " + bowl + " " + fork);
	}

}

class Ingredient {
	String maggiPacket = "maggie";
	String veggi = "veg";
	int cupOfWater = 2;
	String cheese = "cheese";
}

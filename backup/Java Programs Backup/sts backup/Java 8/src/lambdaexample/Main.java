package lambdaexample;

import lambdaexample.MyConsumer;
import lambdaexample.MyFunction;
import lambdaexample.MyPredicate;
import lambdaexample.MySupplier;
import lambdaexample.User;

public class Main {

	public static void main(String[] args) {

		User user = new User() {

			@Override
			public void show() {
				System.out.println("Java Squad");
			}

		};
		user.show();

		User lambda = () -> {System.out.println("Java Squad");};
		lambda.show();

		
		MyConsumer consumerAnonymous = new MyConsumer() {

			@Override
			public void accept(String name) {
				System.out.println(name);
			}

		};
		consumerAnonymous.accept("Consumer Anonymous");

		
		MyConsumer consumerLambda = (name) -> {System.out.println(name);};
		consumerLambda.accept("Consmer Lambda");

		
		
		
		MySupplier supplierAnonymous = new MySupplier() {

			@Override
			public String get() {
				return "Supplier Anonymous";
			}

		};
		System.out.println(supplierAnonymous.get());

		
		MySupplier supplierLambda = () -> {return "Supplier Anonymous";};
		System.out.println(supplierLambda.get());
		
	
		
		MyFunction functionAnonymous = new MyFunction() {

			@Override
			public int apply(String address) {
				return address.length();
			}
			
		};
		System.out.println(functionAnonymous.apply("Faridabad") +" "+ "Anonymous Function");
		
		MyFunction functionlambda = (String address) -> { return address.length();};
		System.out.println(functionlambda.apply("delhi")+" "+"Lambda Function");
		
		
		
		MyPredicate predicateAnonymous = new MyPredicate() {

			@Override
			public boolean test(String name) {
				return name.equals("Sahil");					//== 	  reference comparison
			}													//equals  value comparison
	};
		System.out.println(predicateAnonymous.test("Sahil")+" "+"Predicate Anonymous");
		
		
		MyPredicate predicateLambda = (String name) -> {return name.equals("Sahil");};
		System.out.println(predicateLambda.test("Sahil")+" "+"Predicate Lambda");
}
}
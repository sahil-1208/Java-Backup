package practice;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class LambdaImplimentation {

	public static void main(String[] args) {

		Consumer<String> consumer = new ConsumerImplementation();
		consumer.accept("Sahil");

		Anonymous anonymousReference = new Anonymous();
		anonymousReference.Consumer();
		anonymousReference.find();
		anonymousReference.validation();
		anonymousReference.Processing();

		Lambda lambdaReference = new Lambda();
		lambdaReference.save();
		lambdaReference.find();
		lambdaReference.validate();
		lambdaReference.Process();
	}

}

class Lambda {

	void save() {
		Consumer<String> consumer = (String name) -> {System.out.println(name);};
		consumer.accept("Amrit gill");
	}

	void find() {
		Supplier<String> supplier = () -> {return "hello";};
		System.out.println(supplier.get());
	}
	
	void validate() {
		Predicate<String> predicate =(String input) ->{return input.equals("Zora");};
		String input ="aatif";
		boolean isValid = predicate.test(input);
		System.out.println(isValid);
}
	void Process() {
		Function <String,Integer> function = (String input) ->{return input.length();};
		System.out.println(function.apply("Mr.Chander Prakash Rajpal"));
}
}

class Anonymous {

	void Consumer() {
		Consumer<String> consumer = new Consumer<String>() {

			@Override
			public void accept(String name) {
				System.out.println(name);
			}
		};
		consumer.accept("Sidhu MooseWala");
	}

	void find() {

		Supplier<String> supplier = new Supplier<String>() {

			@Override
			public String get() {
				return "Hello My name is Sahil";
			}
		};
		System.out.println(supplier.get());
	}
	
	void validation() {
		Predicate<String> predicate = new Predicate<String>() {

			@Override
			public boolean test(String input) {
				return input.equals("Gurmukh") ;
			}
		};
		String input ="Gurmukh"; 
		boolean isValid = predicate.test(input);
		System.out.println(isValid);
	}
	
	void Processing() {
		Function<String,Integer> function = new Function<String,Integer>(){

			@Override
			public Integer apply(String name) {
				return name.length();
			}
		};
		System.out.println(function.apply("Sahil"));
	}
}

class ConsumerImplementation implements Consumer<String> {

	@Override
	public void accept(String name) {
		System.out.println(name);
	}

}

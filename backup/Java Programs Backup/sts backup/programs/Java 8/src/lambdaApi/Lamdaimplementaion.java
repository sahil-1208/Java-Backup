package lambdaApi;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Lamdaimplementaion {

	public static void main(String[] args) {
		ControllerA controller = new ControllerA();
		controller.save();
		controller.find();
		controller.validate();
		controller.process();
	}

	private static void previousCalling() {
		Consumer con = new ConsumerImpl();
		con.accept(con);
		Supplier sup = new SupplierImpl();
		Predicate pre = new PredicateImpl();
		Function fun = new FunctionImpl();
	}
}

class ControllerA {
	ServiceA service = new ServiceA();

	void save() {
		Consumer<String> consumer = (String t) -> {
			System.out.println(t);
		};
		service.save(consumer, "data input");
	}

	void find() {
		Supplier<String> supplier = service.find();
		String data = supplier.get();
		System.out.println(data);
	}

	void validate() {
		Predicate<String> predicate = (String input) -> {
			return input.equals("abc"); // == reference comparison
										// equals value comparison
		};
		String input = "abc";
		boolean isValid = service.validate(predicate, input);
		System.out.println(isValid);
	}

	void process() {
		Function<String, String> function = (String input) -> {
			return input.toLowerCase();
		};
		String input = "ABC";
		String output = service.process(function, input);
		System.out.println(output);
	}

}

class ServiceA {
	void save(Consumer<String> consumer, String input) {
		consumer.accept(input);
	}

	Supplier<String> find() {
		Supplier supplier = () -> {
			return "name";
		};
		return supplier;
	}

	Supplier<String> findByValue() {
		return () -> {
			return "name";
		};
	}

	boolean validate(Predicate<String> predicate, String input) {
		boolean bool = predicate.test(input);
		return bool;
	}

	String process(Function<String, String> function, String input) {
		String output = function.apply(input);
		return output;
	}
}

class Lambda {

	void consumer() {
		Consumer consumer = (Object t) -> {
		};
		consumer.accept(null);
	}

	void supplier() {
		Supplier supplier = () -> {
			return null;
		};
		Object object = supplier.get();
	}

	void predicate() {
		Predicate predicate = (Object t) -> {
			return false;
		};
		boolean booze = predicate.test(null);
	}

	void function() {
		Function function = (Object t) -> {
			return null;
		};
		Object object = function.apply(null);
	}

}

class Anonymous {

	void consumer() {
		Consumer consumer = new Consumer() {

			@Override
			public void accept(Object t) {

			}

		};
		consumer.accept(null);

	}

	void supplier() {
		Supplier supplier = new Supplier() {

			@Override
			public Object get() {
				// TODO Auto-generated method stub
				return null;
			}
		};
		Object object = supplier.get();
	}

	void predicate() {
		Predicate predicate = new Predicate() {

			@Override
			public boolean test(Object t) {
				return false;
			}
		};
		boolean booze = predicate.test(null);
	}

	void function() {
		Function function = new Function() {

			@Override
			public Object apply(Object t) {
				return null;
			}
		};
		Object object = function.apply(null);
	}

}

class ConsumerImpl implements Consumer<String> {

	@Override
	public void accept(String t) {
		System.out.println(t);
	}

}

class SupplierImpl implements Supplier<String> {

	@Override
	public String get() {
		return "data";
	}

}

class PredicateImpl implements Predicate<String> {

	@Override
	public boolean test(String t) {
		return t.equals("abc");
	}

}

class FunctionImpl implements Function<String, String> {

	@Override
	public String apply(String t) {
		return t.toLowerCase();
	}

}

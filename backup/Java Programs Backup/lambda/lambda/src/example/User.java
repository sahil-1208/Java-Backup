package example;

@FunctionalInterface
public interface User { 
	void show();
}

@FunctionalInterface
interface MyConsumer{
	void accept(String name);
}

@FunctionalInterface
interface MySupplier{
	String get();
}

@FunctionalInterface
interface MyFunction{
	int apply(String address);
}

@FunctionalInterface
interface MyPredicate{
	 boolean test(String name);
 }
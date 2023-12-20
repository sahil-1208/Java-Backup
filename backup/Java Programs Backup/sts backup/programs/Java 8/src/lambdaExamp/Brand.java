package lambdaExamp;

@FunctionalInterface
public interface Brand {
	void apple();
}

@FunctionalInterface
interface  Car{
	void accept(String name);
}

@FunctionalInterface
interface  User{
	String user();		
}

@FunctionalInterface
 interface Customer { 
	int characters(String name);
}
package exception;

public class ProductNotFoundException extends RuntimeException {
	
	public ProductNotFoundException(String string) {
		super(string);
	}

}

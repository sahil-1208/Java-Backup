package concept;

public class StringExample {

	public static void main(String[] args) {

		int ch = 'a';
		System.out.println(ch);
		
		String name = "golu"; // literal reference same
		String name2 = "golu"; // literal
		String email = new String("golu"); // reference different
		String email2 = new String("golu"); // reference different
		
		boolean literalResult = name == name2; // reference comparison
		
		boolean literalObjectResult = name2 == email; // reference comparison
		
		boolean objectObjectResult = email == email2; // reference comparison
		
		System.out.println(literalResult);
		
		System.out.println(literalObjectResult);
		
		System.out.println(objectObjectResult);
		
		boolean literalLiteralValueComparison = name.equals(name2); // Value Comparison
		
		boolean literalObjectValueComparison = name2.equals(email); // Value Comparison
		
		boolean objectObjectValueComparison = email.equals(email2); // Value Comparison
		
		System.out.println(literalLiteralValueComparison);
		
		System.out.println(literalObjectValueComparison);
		
		System.out.println(objectObjectValueComparison);
		
		shd();
		
	}
	
	static void shd() {
		String token = "abcd";
		String newValue = "";
		
		for (int index = 0; index < token.length(); index++) {
			char character = token.charAt(index);
			character = (char)(character + 1);
			newValue = newValue + character;
		}
		System.out.println(newValue);
	}

}

package List;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {

		List<String> listOfStrings = new ArrayList();

		listOfStrings.add("Sahil");
		listOfStrings.add("Amrit");
		listOfStrings.add("Gurmukh");
		listOfStrings.add("Zora");
		listOfStrings.add("aatif");

		// System.out.println(listOfStrings);

//		for(String names :listOfStrings) {
//			System.out.println(names);
//		}

		listOfStrings.add(2, "Jaggi");

//		for(String names : listOfStrings) {
//			System.out.println(names);
//		}
		System.out.println(listOfStrings.get(4));
		
		List<Integer> listOfInteger = new ArrayList();
		listOfInteger.add(45);
		listOfInteger.add(34);
		listOfInteger.add(29);
		listOfInteger.add(40);
		listOfInteger.add(3, 22);
		listOfInteger.remove(4);
		
		System.out.println(listOfInteger);
		
	}
}

package arrays;

import java.time.LocalDate;

public class IntegerArray {

	public static void main(String[] args) {
		localDateArray();  
		stringArray();
		intArray();
		
		
	}

	private static void localDateArray() {
		LocalDate currentDate = LocalDate.now(); // current date

		System.out.println(currentDate); // 2023-04- :: yyyy-mm-dd
		
		LocalDate joiningDate1 = LocalDate.parse("2023-03-15");
		LocalDate joiningDate2 = LocalDate.parse("2023-03-16");
		LocalDate joiningDate3 = LocalDate.parse("2023-02-10");
		
		LocalDate[] joiningDates = {LocalDate.parse("2023-03-15"), joiningDate2 , joiningDate3};

		LocalDate joiningDate = joiningDates[2];
		System.out.println(joiningDate);
	}

	private static void stringArray() {
		String name1 = "aarnav";
		String name2 = "prabhjeet";
		String name3 = "sadaf";
		String name4 = "Sahil";
		
		String[] nam = {name1,name2,name3,name4 };
		String[] names = {"aarnav", "prabhjeet", "sadaf", "sahil" };
		
		String name = nam[2];
		String namess = names[3];
		System.out.println(name);
		System.out.println(namess);
	}

	private static void intArray() {
		int id1 = 101;
		int id2 = 102;
		int id3 = 103;
		int id4 = 200;
		
		// array : contiguous memory location
		int [] idss = {id1, id2, id3, id4};
		
		int[] ids = {101,102,103,200}; 
		
		int forth = ids[3];
		
		int third = idss[2];
		System.out.println(forth);
		System.out.println(third);
	}

}

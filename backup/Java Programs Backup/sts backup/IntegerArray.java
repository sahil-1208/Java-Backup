package arrays;

import java.time.LocalDate;

public class IntegerArray {

	public static void main(String[] args) {
		localDateArray();
		
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
		String name4 = "koi bhi nahi";
		
		String[] names = {"aarnav", "prabhjeet", "sadaf", "koi bhi nahi" };
		
		String name = names[0];
		System.out.println(name);
	}

	private static void intArray() {
		int id1 = 101;
		int id2 = 102;
		int id3 = 103;
		int id4 = 200;
		
		// array : contiguous memory location
		
		int[] ids = {101,102,103,200}; 
		
		int forth = ids[0];
		
		System.out.println(forth);
	}

}

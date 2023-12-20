package day2;

public class Datatype {

		/*
		 * size and range
		 * byte : 1 byte space, range -128 0 127
		 * short : 2 byte space, range -32768 0 32767
		 * int : 4 byte space, range -2147483648 0 2147483647
		 * long : 8 byte space, range -9223372036854775808l 0 9223372036854775807l
		 */
		public static void main(String[] args) {
					
			boolean b = false;
			char ch = '1';
			
			String f = " ";
		}
	}

	/*
	 * id 
	 * name
	 * email
	 * mobileNumber
	 * 
	 * maritialStatus
	 * gender
	 * dateOfBirth
	 */
	class User {
		long id = 101;
		String name = "saby";
		String email = "sahil250@gmail.com";
		long mobileNumber = 8178110204l;
		byte age = 20;
		boolean isMarried = false;
		String gender = "male";
		String dateOfBirth = "26-01-2003";
		
		Address address = null;
	}

	class Address {
		int houseNumber = 250;
		String sector = "10 HBC";
		char block = 'C';
		String state = "Haryana";
		String city = "Faridabad";
		int pincode = 121006;
	}
	

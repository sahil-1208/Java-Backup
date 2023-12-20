package p3;

public class Userform {

	public static void main(String[] args) {
		PersonalInfo  pf = new PersonalInfo();
		pf.name = "sahil";
		pf.age=22;
		pf.gender="male";
		
		System.out.println(pf.name);
		System.out.println(pf.age);
		System.out.println(pf.gender);
		 
		Adress ad= new Adress();
		ad.city = "faridabad";
		ad.state = "Haryana";
		ad.pincode = "121002";
		
		System.out.println(ad.city);
		System.out.println(ad.state);
		System.out.println(ad.pincode);
		pf.address=ad;
		System.out.println(pf.address.city);
		System.out.println(pf.address.state);
		System.out.println(pf.address.pincode);
	}
}
class PersonalInfo{
	String name;
	int age;
	String gender;
	Adress address;
}
class Adress{
	String state;
	String city;
	String pincode;
	
}
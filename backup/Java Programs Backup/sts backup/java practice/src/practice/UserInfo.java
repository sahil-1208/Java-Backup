package practice;

public class UserInfo {
	
	public static void main(String[] args)
	{
		Verification verifyRef= new Verification();
		  User  u = verifyRef.verify(3);
		  System.out.println(u.id+" "+u.name);	
	}	
}
class Verification{
	
		User verify(int userId)
	 {
		 User u = new User();
		 if(userId==1) {
			 u.id=123;
			 u.name="Sahil";
		 }
		 else if(userId==2) {
			 u.id=120;
			 u.name="Jaggi";
		 }
		 else if(userId==3) {
			 u.id=125;
			 u.name="Zorawar";
		 }
		 else if (userId==4) {
			 u.id=130;
			 u.name="Gurmukh";
		 }
		 else{
			 u.id=132;
			 u.name="Extra";
		 }
		 return u; 
	 }
}
 class User{
	 int id;
	 String name;
 }
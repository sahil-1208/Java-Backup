package basics;

public class basic {
	
	static int a = 6; //static variable
	
	int b = 9; // instance variable
	public static void main(String[] args) {
		
		
		// Java is case sensitive , we can use diffrent identifiers in java which are as follows 
		
		int number = 4;
		int Number = 5;
		int NumBer = 7;
		int abc123 = 3;     
		// int 123abc = 5;     // invalid 
		int _a = 4;
		int a_ = 6;
		String $m = "s";
		String b$ = "5";
		String _$_ = "sahil";
		// int #a = 4;			//invalid
		 // String $*a# = 4;     //invalid
		
		long  mobileNumber = 9873244887l;
		
		System.out.println(number+" "+Number+" "+NumBer);
			
	    System.out.println("My Name is Sahil");
	    System.out.println(5+5);
	    
//---------------------------------------------------------------------------------------------
	    
	    //concat and add strings and integers
	    
	    //if integer comes first then add will perform
	    System.out.println(1+2+3+"4");      				//64
	    
	    //if string comes first then concat will perform
	    System.out.println("4"+5+5+6);						//4556
	}

}
 class sahil{
	  
	 public void Display() {
		 
		 int a = 10;           					//local variable
		 System.out.println(a);
	 }
 }

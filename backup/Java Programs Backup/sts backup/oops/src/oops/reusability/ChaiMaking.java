package oops.reusability;

public class ChaiMaking extends Vessels  				// is a
{
	 public void prepare()
	 {
		 System.out.println("Prepration Starts");
		 Ingridients items = new Ingridients();     	// has a
		String teaLeaves =items.teaLeaves;
		String sugar =items.sugar;
		  String milk =items.milk;
		 String ginger =items.ginger;
		 
		
		String kettle = kettle();
		 String cup =cup();
		  String teaStrainer = teaStrainer();
		  
		  boiling(kettle,milk);
		  adding(teaLeaves,sugar,ginger);
		  serve(kettle,teaStrainer,cup);
		  System.out.println("chai is ready and served ");
	 }
	 //procedure for chai making
	private void boiling(String kettle,String milk)
	{
		System.out.println("boiling the milk"+kettle+" "+milk);
	}
	private void adding(String teaLeaves,String sugar,String ginger)
	{
		System.out.println("adding tealeaves,sugar and ginger" +teaLeaves+" " +sugar+ " "
				+ginger);
	}
	private void serve(String kettle, String teaStrainer,String cup) 
	{
		System.out.println("serve the tea in the cup " +kettle+" "+teaStrainer+" "+cup);	
	}
	
}
class Ingridients{
	String teaLeaves="tealeaves";
	String sugar="sugar";
	String milk="Milk";
	String ginger="Ginger";
}

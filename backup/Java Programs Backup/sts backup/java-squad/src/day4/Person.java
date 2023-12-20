package day4;
public class Person {
 static long id =101;
 static String name="Sahil";
  static void printDetails()
  {
	  System.out.println(id);
	  System.out.println(name);
  }
  static void laxmiChitFund()
  {
	  double money = 59.00;
	  money = money*2;
	  System.out.println(money);
  }
 static void fixedDeposit(int a)
 {
  System.out.println(a);
 }
  
 public static void main(String[] args) {
	printDetails();
	laxmiChitFund();
	fixedDeposit(12);
}
}

package main;

import controller.Controller;
import java.util.Scanner;

public class MedicalShop {

	public static void main(String[] args)  {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your name");
		String user = sc.nextLine();
		
		Controller controller = new Controller();
		controller.findUser(user);
	}

}

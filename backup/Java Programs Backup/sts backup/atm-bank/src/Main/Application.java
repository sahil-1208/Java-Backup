package Main;

import java.util.Scanner;

import controller.HdfcController;
import controller.IciciController;

public class Application {

	public static void main(String[] args) {
		
		System.out.println("Please enter your bank");
		
		Scanner scanner = new Scanner(System.in);
		
		String bankName = scanner.next();
		
		if (bankName.equals("HDFC")) {
			HdfcController hdfcController = new HdfcController();
			System.out.println("Please enter account holder name");
			String name = scanner.next();
			hdfcController.withDrawBalance(name);
		} else if (bankName.equals("ICICI")) {
			IciciController iciciController = new IciciController();
			System.out.println("Please enter account holder name");
			String name = scanner.next();
			iciciController.withDrawBalance(name);
		}
	}

}

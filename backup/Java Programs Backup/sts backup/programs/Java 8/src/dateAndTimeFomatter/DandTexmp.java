package dateAndTimeFomatter;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DandTexmp {

	public static void main(String[] args) {
		
//		String stringdate = "12-2023-20";
//		
//		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM-yyyy-dd"); //12-2023-20
//		LocalDate formattedDate = LocalDate.parse(stringdate , formatter);
		
		String stringDate = "12-2023-20";
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM-yyyy-dd");
		LocalDate formattedDate = LocalDate.parse(stringDate, formatter);
x
		System.out.println(formattedDate);
	//extracted();
	}

	public static void extracted() {
		LocalDateTime date = LocalDateTime.now();
	
		 DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM-yyyy-dd hh:mm a");
		 	 
		 	String	formatted = date.format(formatter);
	
		 	System.out.println("Formatted Date and Time  " +formatted);
	}
}

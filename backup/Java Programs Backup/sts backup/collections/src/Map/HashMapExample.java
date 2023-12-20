package Map;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

	public static void main(String[] args) {
		Map<String,Long> contactList = new HashMap();
		contactList.put("Sahil", 9873244887l);
		contactList.put("Hemant", 8826305680l);
		contactList.put("Aatif", 7905277078l);
		contactList.put("Sumit", 8077196677l);
		
		System.out.println(contactList);
		
		System.out.println(contactList.get("Sahil"));
		contactList.remove("Sumit");
		System.out.println(contactList);

	}

}

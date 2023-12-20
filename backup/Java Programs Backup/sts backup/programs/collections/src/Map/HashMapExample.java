package Map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class HashMapExample {

	public static void main(String[] args) {
		Map<String,Long> salary = new TreeMap<>();
		salary.put("Manager", 200000l);
		salary.put("Engineer",180000l);
		salary.put("HR", 50000l);
		salary.put("Junior Engineer", 40000l);
		salary.put("Peon", 32000l);
		
		
	
	}

	public static void linkedMapExmp() {
		Map<String, Integer> pocketMoney = new LinkedHashMap<>();
		pocketMoney.put("Sahil", 200);
		pocketMoney.put("Amrit", 500);
		pocketMoney.put("Himanshu", 300);
		pocketMoney.put("Shubham", 100);
		// preserves insertion order
		for (Entry<String, Integer> money : pocketMoney.entrySet()) {
			System.out.println(money);
		}
		pocketMoney.replace("Shubham", 100, 250);
		
		for (Entry<String, Integer> money : pocketMoney.entrySet()) {
			System.out.println(money);
		}
	}

	public static void hashmapExmp() {
		Map<String, Long> contactList = new HashMap();
		contactList.put("Sahil", 9873244887l);
		contactList.put("Hemant", 8826305680l);
		contactList.put("Aatif", 7905277078l);
		contactList.put("Sumit", 8077196677l);

//		System.out.println(contactList);
//		
//		System.out.println(contactList.get("Sahil"));
//		contactList.remove("Sumit");
//		System.out.println(contactList);
		System.out.println(contactList.containsKey("Sahil"));

		for (Entry<String, Long> map : contactList.entrySet()) {
			System.out.println(map);
		}

		for (String keys : contactList.keySet()) {
			System.out.println(keys);
		}
	}

}

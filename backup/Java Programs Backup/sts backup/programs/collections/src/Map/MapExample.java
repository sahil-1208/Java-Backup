package Map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapExample {

	public static void main(String[] args) {

		Map<String,String> map = new HashMap();
		map.put("name1", "Sahil");
		map.put("name2", "Amrit");
		map.put("name3", "Zora");
		map.put("name4", "Gucci");
		
//		Set<String> keys = map.keySet();
//		System.out.println(keys);
//		
//		Collection<String> values = map.values();
//		System.out.println(values);
//	
//		Set<Entry<String ,String>> entry = map.entrySet();
//		System.out.println(entry);
//		
//		for(Entry<String,String> eachEntry :map.entrySet()) {
//			System.out.println(eachEntry);
//		}
//		
		map.forEach((key,value)->{System.out.println(key+":"+value);});
	}
}

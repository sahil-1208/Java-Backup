package set;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {
	
	public static void main(String[] args) {
		
		Set<Integer> set = new TreeSet<>();
		set.add(10);
		set.add(1);
		set.add(2);
		set.add(5);
		set.add(9);
		
		
		System.out.println(set);
		
		SetExample.extracted();
		System.out.println("_____________________________________________");
		SetExample.linkedHashSet();
		
	}

	private static void extracted() {
		List<Long> mobileNumbers = Arrays.asList(8800122227l, 8800122227l, 8800122227l, 9560994410l, 9560994410l,
				8800193660l, 8800193660l);
		
	
		boolean isNotEmpty = !mobileNumbers.isEmpty();
		
		if (isNotEmpty) {
			Set<Long> mobileNumberSet = new HashSet<>();
			mobileNumberSet.addAll(mobileNumbers);
			System.out.println(mobileNumberSet);
		}
		
		Set<Integer> set = new HashSet<>();
		
		set.add(1);
		set.add(2);
		set.add(5);
		set.add(9);
		set.add(10);
		
		System.out.println(set);
		
	}
	
	 static void linkedHashSet() {
		Set<Integer> set = new LinkedHashSet<>();
		set.add(10);
		set.add(1);
		set.add(2);
		set.add(5);
		set.add(9);
		System.out.println(set);
	}

}

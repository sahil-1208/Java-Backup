package set;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class UserCompare {

	public static void main(String[] args) {
		User one = new User(101l, "A");
		User two = new User(102l, "B");
		User three = new User(103l, "C");
		User four = new User(104l, "D");

		
		Comparator<User> idCompare = new IdFilter();
		Set<User> userSet = new TreeSet<>(idCompare);

		//Comparator<User> nameCompare = new NameFilter();
		//Set<User> userSet = new TreeSet<>(nameCompare);
		userSet.add(three);
		userSet.add(one);
		userSet.add(four);
		userSet.add(two);
//		userSet.add(three);
//		userSet.add(one);
//		userSet.add(four);
//		userSet.add(two);
		
		System.out.println(userSet);
	}

}

class IdFilter implements Comparator<User> {

	@Override
	public int compare(User user1, User user2) {
		return user1.getId().compareTo(user2.getId());
	}
	
}

class NameFilter implements Comparator<User> {

	@Override
	public int compare(User user1, User user2) {
		return user1.getName().compareTo(user2.getName());
	}
	
	
}

// Immutable class
final class User {
	
	private final Long id;
	private final String name;
	
	public User(Long id, String name) {
		this.id = id;
		this.name = name;
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + "]";
	}
	
}

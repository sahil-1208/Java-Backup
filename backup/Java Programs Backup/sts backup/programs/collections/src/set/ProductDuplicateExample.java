package set;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

public class ProductDuplicateExample {

	public static void main(String[] args) {
		
		Product one = new Product(101l, "mobile", LocalDate.now());
		Product two = new Product(102l, "mobile", LocalDate.now());
		Product three = new Product(103l, "mobile", LocalDate.now());

		Set<Product> nonDuplicateProducts = new TreeSet<>();
		nonDuplicateProducts.add(one);
		nonDuplicateProducts.add(two);
		nonDuplicateProducts.add(three);
		
		System.out.println(nonDuplicateProducts);

		System.out.println("----------------------------------------------------");
		 ProductDuplicateExample.nonDuplicate();;
		 
		 ProductDuplicateExample.compare();
	
	}
	
	 static void compare() {
		Integer a = 1;
		Integer b = 2;
		
		System.out.println(b.compareTo(a));
	}

	private static void nonDuplicate() {
		Product one = new Product(101l, "mobile", LocalDate.now()); // reference id -> hashcode 1
		Product two = new Product(101l, "mobile", LocalDate.now()); // reference id -> hashcode 2
		Product three = new Product(101l, "mobile", LocalDate.now()); // reference id -> hashcode 3

		Set<Product> nonDuplicateProducts = new HashSet<>();
		nonDuplicateProducts.add(one);
		nonDuplicateProducts.add(two);
		nonDuplicateProducts.add(three);

		System.out.println(nonDuplicateProducts);
	}

}



final class Product implements Comparable<Product> {

	private final Long id;
	private final String name;
	private final LocalDate date;

	public Product(Long id, String name, LocalDate date) {
		this.id = id;
		this.name = name;
		this.date = date;
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public LocalDate getDate() {
		return date;
	}

	@Override
	public int hashCode() {
		return Objects.hash(date, id, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		return Objects.equals(date, other.date) && Objects.equals(id, other.id) && Objects.equals(name, other.name);
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", date=" + date + "]";
	}

	@Override
	public int compareTo(Product product) {
		//return this.id.compareTo(product.getId()); // default sorting ascending
		return product.getId().compareTo(this.id);  // descending
	}

}
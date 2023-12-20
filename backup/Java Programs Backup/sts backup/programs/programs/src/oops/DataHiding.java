package oops;

public class DataHiding {

	private long id;
	private String name;
	private boolean valid;

	public long getId() {
		return id;
	}

	public void setId(long idno) {
		this.id = idno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isValid() {
		return valid;
	}

	public void setValid(boolean valid) {
		this.valid = valid;
	}

}

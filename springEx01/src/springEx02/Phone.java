package springEx02;

public class Phone {
	private String name;

	public Phone(String name) {
		super();
		this.name = name;
	}
	
	public Phone() {
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Phone [name=" + name + "]";
	}
	
	
}

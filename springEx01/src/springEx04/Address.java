package springEx04;

public class Address {
	private String si;
	private String dong;
	public Address(String si, String dong) {
		super();
		this.si = si;
		this.dong = dong;
	}
	
	public Address() {
		// TODO Auto-generated constructor stub
	}

	public String getSi() {
		return si;
	}

	public void setSi(String si) {
		this.si = si;
	}

	public String getDong() {
		return dong;
	}

	public void setDong(String dong) {
		this.dong = dong;
	}

	@Override
	public String toString() {
		return "Address [si=" + si + ", dong=" + dong + "]";
	}
	
	
}

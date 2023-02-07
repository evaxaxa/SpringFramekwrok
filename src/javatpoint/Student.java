package javatpoint;

public class Student {
private String name;
private int id;
private String address;

public String getName() {
	return name;
}

	public int getId() {
		return id;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
	this.name = name;
}

public void displayInfo(){
	System.out.println("Hello: "+name);
}
}

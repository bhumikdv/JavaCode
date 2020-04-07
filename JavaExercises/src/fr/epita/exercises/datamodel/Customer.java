package fr.epita.exercises.datamodel;

public class Customer {
	private String name;
	private String address;
	
	public void setName(String name) {
		if("".equals(name))
		{
			System.out.println("Invalid new Name");
			return;
		}
		this.name=name;
	}
	
	public String getName() {
		return name;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getAddress() {
		return address;
	}

	
	
	

}

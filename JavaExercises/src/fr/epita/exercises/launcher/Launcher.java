package fr.epita.exercises.launcher;

import fr.epita.exercises.datamodel.Customer;

public class Launcher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World");
		Customer bhumik = new Customer();
		bhumik.setName("Bhumik");
		bhumik.setAddress("Paris");
		
		System.out.println("Customer name: "+bhumik.getName());
		System.out.println("Customer Address: "+bhumik.getAddress());
		
	}

}

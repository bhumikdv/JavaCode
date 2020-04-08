package fr.epita.person.launcher;

import java.util.Scanner;

import fr.epita.person.datamodel.Person;

public class Launcher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * Accepts number of person(s) details you want to enter. Stores in Person
		 * object and prints it.
		 */
		Scanner scan = new Scanner(System.in);

		System.out.println("Number of person details you want to enter:");
		int num = scan.nextInt();
		Person persons[] = new Person[num];

		for (int i = 0; i < num; i++) {
			persons[i] = new Person();

			System.out.println("Enter Name: ");
			persons[i].setName(scan.next());

			System.out.println("Enter Sex: ");
			persons[i].setSex(scan.next());

			System.out.println("Enter Age: ");
			persons[i].setAge(scan.nextDouble());

			System.out.println("Enter Height: ");
			persons[i].setHeight(scan.nextDouble());

			System.out.println("Enter Weight: ");
			persons[i].setWeight(scan.nextDouble());
		}
		scan.close();

		for (int i = 0; i < num; i++) {

			persons[i].personDetails();
		}

	}

}

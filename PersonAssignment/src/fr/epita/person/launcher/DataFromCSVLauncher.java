package fr.epita.person.launcher;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import fr.epita.person.datamodel.Person;

public class DataFromCSVLauncher {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		/**
		 * Reads the data from the file and stores the data in ArrayList of type Person.
		 * Prints the details of the Person data read from the file.
		 * 
		 */

//		public static final String csvFile = "C:\\Users\\bhumik\\Desktop\\persons.csv";
		final String CSV_FILE = "persons.csv";
		File file = new File(CSV_FILE);
		Scanner inputScanner = null;

		try {
			List<Person> persons = new ArrayList<Person>();
			inputScanner = new Scanner(file);
			boolean flag = false;
			while (inputScanner.hasNext()) {
				Person p = new Person();
				String row = inputScanner.nextLine();
				String[] cell = row.split(",");

				if (!flag) {
					// To escape from adding Header in the object !
					System.out.println(cell[0] + "\t" + cell[1] + "\t" + cell[2] + "\t" + cell[3] + "\t" + cell[4]);
					flag = true;
				} else {
					// Here we are not checking for any exceptions as we know the exact number of
					// attributes and its type
					System.out.println(cell[0] + "\t" + cell[1] + "\t" + cell[2] + "\t" + cell[3] + "\t \t" + cell[4]);
					p.setName(cell[0]);
					p.setSex(cell[1]);
					p.setAge(Double.parseDouble(cell[2]));
					p.setHeight(Double.parseDouble(cell[3]));
					p.setWeight(Double.parseDouble(cell[4]));
					persons.add(p);
				}

			}
			System.out.println("\n\nAfter Deserialization, values in the object are: ");

			for (Person person : persons) {
				person.personDetails();

			}

		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} finally {
			inputScanner.close();

		}

	}

}

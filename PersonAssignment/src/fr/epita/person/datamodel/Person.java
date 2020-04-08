package fr.epita.person.datamodel;

public class Person {

	private String name;
	private String sex;
	private Double age;
	private Double height;
	private Double weight;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public Double getAge() {
		return age;
	}

	public void setAge(Double age) {
		this.age = age;
	}

	public Double getHeight() {
		return height;
	}

	public void setHeight(Double height) {
		this.height = height;
	}

	public Double getWeight() {
		return weight;
	}

	public void setWeight(Double weight) {
		this.weight = weight;
	}

	public void personDetails() {
		System.out.println("Name: " + getName() + "\nSex: " + getSex() + "\nAge: " + getAge() + "\nHeight: "
				+ getHeight() + "\nWeight: " + getWeight());
	}
}

package com.java.tutorial;

class NewCar {
	private String name;
	private int make;

	public void setName(String carName) {
		name = carName;
	}

	public String getName() {
		return name;
	}

	public void setMake(int carMake) {
		make = carMake;
	}

	public int getMake() {
		return make;
	}

}

public class MyClass1 {
	public static void main(String[] args) {
		NewCar c1 = new NewCar();
		c1.setName("Mercedes");
		c1.setMake(1997);

		System.out.println("Car : Name is " + c1.getName() + " and make is " + c1.getMake());
	}
}

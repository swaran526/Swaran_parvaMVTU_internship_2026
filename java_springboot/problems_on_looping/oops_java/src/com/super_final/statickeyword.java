package com.super_final;
class Car{
	String name;
	static int noWheels=4;
	public static void display() {
		System.out.println("nowheels:"+Car.noWheels);
	}
}
public class statickeyword {
public static void main(String[] args) {
	Car c= new Car();
	c.name="Tesla";
	Car.display();
	Car c1=new Car();
	c1.name="xyz";
	Car.display();
}
}

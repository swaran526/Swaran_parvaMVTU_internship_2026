package com.abstaraction;



abstract class Person{
	public abstract void isWalking();
	public void isSleeping() {
		System.out.println("Person is sleeping");
	}
}
class Student extends Person{
	@Override
	public void isWalking() {
		System.out.println("Student is sleeping");
	}
}

public class Abstraction {
	public static void main(String[] args) {
		Student s1=new Student();
		s1.isSleeping();
		s1.isWalking();
	}

	}
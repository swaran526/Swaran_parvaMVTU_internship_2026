package com.super_final;
class Person{
	public void display() {
		System.out.println("parent class display");
	}
}
class Student extends Person{
	@Override
	public void display() {
		System.out.println("child class display");
	}
}
public class final_key_world {
public static void main(String[] args) {
	int age;
	age = 30;
System.out.println("age:"+age);
age = 40;
System.out.println("age:"+age);
Student s1= new Student();

}
}

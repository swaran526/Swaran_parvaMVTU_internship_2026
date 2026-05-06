package com.arraylist;
class MyGenericsClass<T>{
	private T variable;
	public MyGenericsClass(T variable) {
		this.variable=variable;
	}
	public T getVariable() {
		return variable;
	}
	public void setVariable(T variable) {
		this.variable=variable;
	}
}
public class generics {
	public static void main(String[] args) {
		MyGenericsClass<Integer>obj1=new MyGenericsClass<>(21);
		System.out.println("valve:"+obj1.getVariable());
		obj1.setVariable(40);
		System.out.println("valve2:"+obj1.getVariable());
		
		MyGenericsClass<String>Obj2=new MyGenericsClass<>("heloo");
		System.out.println("valve:"+Obj2.getVariable());
	}

}

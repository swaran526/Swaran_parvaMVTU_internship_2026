package com.arraylist;

import java.util.ArrayList;

public class arraylist1 {
public static void main(String[] args) {
	ArrayList al1 = new ArrayList();
	al1.add("hello");
	al1.add(null);
	al1.add(null);
	al1.add(21);
	al1.add(34);
	System.out.println(al1);
	String greet =(String )al1.get(0);
}
}

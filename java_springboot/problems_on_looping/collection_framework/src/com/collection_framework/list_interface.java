package com.collection_framework;

import java.util.List;
import java.util.ArrayList;

public class list_interface {
public static void main(String[] args) {
	List l = new ArrayList();
	l.add(12);
	l.add(12);
	l.add(true);
	l.add(true);
	l.add("hello");
	System.out.println(l);
	System.out.println(l.get(2));
}
}

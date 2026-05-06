package com.arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class arraylist4 {
public static void main(String[] args) {
	ArrayList<Integer>al=new ArrayList<>();
	al.add(10);
	al.add(2);
	al.add(20);
	al.add(12);
	al.add(23);
	al.add(8);
	System.out.println(al);
	Collections.sort(al);
	System.out.println(al);
	System.out.println("min:"+Collections.min(al));
	System.out.println("max:"+Collections.max(al));
	System.out.println("binary:"+Collections.binarySearch(al));
}
}

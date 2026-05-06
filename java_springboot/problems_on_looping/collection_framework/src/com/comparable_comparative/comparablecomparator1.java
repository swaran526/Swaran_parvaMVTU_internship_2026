package com.comparable_comparative;

import java.util.ArrayList;
import java.util.Collections;

public class comparablecomparator1 {
	public static void main(String[] args) {
		ArrayList<Integer> arr= new ArrayList<Integer>();
		arr.add(1000);
		arr.add(30);
		arr.add(25);
		arr.add(5);
		Collections.sort(arr);
		System.out.println("using comparabel:"+arr);
		Collections.sort(arr,(a1,a2)->a2-a1);
		System.out.println("using comparator:"+arr);
	}

}

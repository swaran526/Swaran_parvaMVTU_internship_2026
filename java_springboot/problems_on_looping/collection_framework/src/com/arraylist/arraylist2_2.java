package com.arraylist;

import java.util.ArrayList;

public class arraylist2_2 {
public static void main(String[] args) {
	ArrayList<Integer>arr1 =new ArrayList<Integer>();
	arr1.add(12);
	arr1.add(23);
	arr1.add(34);
	System.out.println(arr1);
	int age =arr1.get(1);
	int num=30;
	Integer num2= Integer.valueOf(num);
	int num3=num2.intValue();
	Byte b =30;
	byte b1=b.byteValue();
}

}

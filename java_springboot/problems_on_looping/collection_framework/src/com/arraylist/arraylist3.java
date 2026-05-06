package com.arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class arraylist3 {
public static void main(String[] args) {
	ArrayList<Integer>al =new ArrayList<Integer>();
	al.add(12);
	al.add(23);
	al.add(34);
	al.add(309);
	al.add(8);
	System.out.println(al);
	for(int i =0;i<al.size();i++){
		System.out.println(al.get(i)+" ");
	}
	for(int ele: al) {
		System.out.println(ele+"");
		
	}
	al.forEach((ele)->System.out.println(ele+" "));
	
	Iterator<Integer> itr =al.iterator();
	while(itr.hasNext()) {
		System.out.println(itr.next()+"");
		ListItreator<Integer> list = al.listIterator();
		while(list.hasNext()) {
			System.out.println(list.Next()+"");
		}
	}
}
}
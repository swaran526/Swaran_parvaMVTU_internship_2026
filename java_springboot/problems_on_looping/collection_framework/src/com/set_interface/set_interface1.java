package com.set_interface;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class set_interface1 {
public static void main(String[] args) {
Set<Integer>s1=new HashSet<Integer>();
  s1.add(12);
  s1.add(14);
  s1.add(100);
  s1.add(12);
  s1.add(null);
  s1.add(null);
  System.out.println(s1);
  List<Integer>marks=new ArrayList<Integer>();
  marks.add(18);
  marks.add(9);
  marks.add(87);
  marks.add(0);
  marks.add(5);
  marks.add(5);
  marks.add(26);
  System.out.println(marks);
  Set<Integer>s2=new HashSet<Integer>(marks);
  System.out.println(s2);
}
}

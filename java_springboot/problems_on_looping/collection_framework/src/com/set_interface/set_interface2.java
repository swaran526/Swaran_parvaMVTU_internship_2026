
package com.set_interface;
//import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
//import java.util.List;
import java.util.Set;

public class set_interface2 {
public static void main(String[] args) {
Set<Integer>s1=new HashSet<Integer>();
  s1.add(12);
  s1.add(14);
  s1.add(78);
  s1.add(12);
  s1.add(11);
  s1.add(12);
  
  for(int ele:s1) {
	  System.out.println(ele+"");
  }
  System.out.println();
  s1.forEach((ele)->System.out.println(ele+""));
  System.out.println();
  Iterator<Integer> iterator=s1.iterator();
  while(iterator.hasNext()) {
	  System.out.println(iterator.next()+"");
  }
  
}
}
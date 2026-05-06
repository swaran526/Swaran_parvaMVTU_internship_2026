package com.map;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.HashMap;

public class mapinterface1 {
    public static void main(String[] args) {

      
    	Map<Integer,String>map=new TreeMap<Integer>((a,b)->b-a);

        map.put(1, "Hello");
        map.put(2, "Hello");
        map.put(3, "Hello");
        map.put(4, "loki");
        map.put(1, "Hunter"); 

        System.out.println(map);

       
        map.forEach((k, v) -> System.out.println(k + " -> " + v));

       
        Set<Map.Entry<Integer, String>> entrySet = map.entrySet();

        for (Map.Entry<Integer, String> entry : entrySet) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }
    }
}
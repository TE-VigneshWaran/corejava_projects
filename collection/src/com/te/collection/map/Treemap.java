package com.te.collection.map;

import java.util.Map;
import java.util.TreeMap;

public class Treemap {

	public static void main(String[] args) {
		
		TreeMap<Integer, String> map=new TreeMap<Integer, String>();
		
		map.put(1,"siva");
		map.put(4,"suresh");
		map.put(3,"bala");
		map.put(5,"david");
		map.put(2,"hari");
		
		System.out.println(map.isEmpty());//false
		
		System.out.println(map.size());//5
		
		System.out.println(map.containsKey(3));//true
		
		System.out.println(map.containsValue("bala"));//true
		
		System.out.println(map);//{1=siva, 2=hari, 3=bala, 4=suresh, 5=david}
		
		System.out.println(map.pollFirstEntry());//1=siva
		
		System.out.println(map.pollLastEntry());//5=david
		
		System.out.println(map.descendingMap());//{4=suresh, 3=bala, 2=hari}

	}

}

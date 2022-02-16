package com.te.collection.map;

import java.util.HashMap;
import java.util.Map;

public class Hashmap {

	public static void main(String[] args) {
		
		Map<Integer, String> map=new HashMap<Integer, String>();
		
		map.put(1,"siva");
		map.put(4,"suresh");
		map.put(3,"bala");
		map.put(5,"david");
		map.put(2,"hari");
		map.put(2,null);
		
		
		System.out.println(map);//{1=siva, 2=null, 3=bala, 4=suresh, 5=david}
		
		System.out.println(map.isEmpty());
		
		System.out.println(map.size());
		
		System.out.println(map.containsKey(5));
		
		System.out.println(map.containsValue("siva"));
		
	}

}

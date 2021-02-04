package com.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class SortHashMapByKey {
	
	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<>();

		map.put(3, "Akhil");
		map.put(2, "Anvesh");
		map.put(4, "Shanvi");
		map.put(1, "Rahul");
		
		//sorting with key using TreeMap
		
		Map<Integer, String> treeMap = new TreeMap<>(map);
		
		for(Map.Entry<Integer, String> entry : treeMap.entrySet()) {
			System.out.println("Key is : "+entry.getKey()+" & value is :"+ entry.getValue());
		}
		
		//sorting with key using Set
//		Set set = map.entrySet();
//		
//		Iterator itr = set.iterator();
//		
//		while(itr.hasNext()) {
//			Map.Entry<Integer, String> entry = (Entry<Integer, String>) itr.next();
//			System.out.println("Key is : "+entry.getKey()+" & value is :"+ entry.getValue());
//		}
	}

}

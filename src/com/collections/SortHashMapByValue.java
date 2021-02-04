package com.collections;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class SortHashMapByValue {

	public static void main(String[] args) {
		
		HashMap<Integer, String> map = new HashMap<>();

		map.put(3, "Akhil");
		map.put(2, "Anvesh");
		map.put(4, "Shanvi");
		map.put(1, "Rahul");
		
		Map<Integer, String> sortedMap = sortByValues(map);
		
		for(Map.Entry<Integer, String> entry : sortedMap.entrySet()) {
			System.out.println("Key is : "+entry.getKey()+" value is : "+entry.getValue());
		}
		
		
	}
	private static HashMap sortByValues(HashMap map) {
		List list = new LinkedList(map.entrySet());
		
		Collections.sort(list, new Comparator() {

			@Override
			public int compare(Object o1, Object o2) {
				// TODO Auto-generated method stub
				return ((Map.Entry<Integer, String>) (o1)).getValue().compareTo(((Map.Entry<Integer, String>)(o2)).getValue());
			}
			
		});
		Iterator it = list.iterator();
		
		HashMap<Integer, String> sortedMap =  new LinkedHashMap<>();
		
		while(it.hasNext()) {
			Map.Entry<Integer, String> entry = (Entry<Integer, String>) it.next();
			sortedMap.put(entry.getKey(), entry.getValue());
		}
		
		return sortedMap;
	}

}

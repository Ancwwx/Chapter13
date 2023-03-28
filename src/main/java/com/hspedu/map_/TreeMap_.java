package com.hspedu.map_;

import java.util.Comparator;
import java.util.TreeMap;

public class TreeMap_ {
	public static void main(String[] args) {
		// TreeMap treeMap = new TreeMap();
		TreeMap treeMap = new TreeMap(new Comparator() {
			public int compare(Object o1, Object o2) {
				return ((String) o1).compareTo((String) o2);
				//return((String)o1).length()-((String)o2).length();
			}
		});

		treeMap.put("jack", "jieke");
		treeMap.put("tom", "tangmu");
		treeMap.put("kristina", "krstn");
		treeMap.put("smith", "simisi");

		System.out.println(treeMap);

	}

}

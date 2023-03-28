package com.hspedu.map_;

import java.util.Hashtable;

public class HashTableExercise {
	@SuppressWarnings({ "all" })
	public static void main(String[] args) {
		Hashtable table = new Hashtable();
		table.put("join", 100);
		// table.put(null, 100);
		// table.put("join", null);
		table.put("lucy", 100);
		table.put("lic", 100);
		table.put("lic", 88);
		System.out.println(table);

	}

}

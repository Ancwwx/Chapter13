package com.hspedu.set_;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class setMethod {
	@SuppressWarnings({ "all" })
	public static void main(String[] args) {
		Set set = new HashSet();
		set.add("join");
		set.add("lucy");
		set.add("join");
		set.add("jack");
		set.add("hsp");
		set.add("mary");
		set.add(null);
		set.add(null);

		System.out.println("set=" + set);

		System.out.println("=============");

		Iterator iterator = set.iterator();
		while (iterator.hasNext()) {
			Object object = iterator.next();
			System.out.println(object);

		}

		set.remove(null);
		System.out.println("=============");

		for (Object object : set) {
			System.out.println(object);
		}

	}

}

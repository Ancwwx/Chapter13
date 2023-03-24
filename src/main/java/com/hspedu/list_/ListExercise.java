package com.hspedu.list_;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListExercise {
	@SuppressWarnings({ "all" })
	public static void main(String[] args) {
		List list = new ArrayList();
		for (int i = 0; i < 12; i++) {
			list.add("hello" + i);

		}
		System.out.println("list=" + list);
		list.add(1, "hspedu");
		System.out.println(list);
		System.out.println(list.get(4));
		System.out.println(list.remove(5));
		list.set(6, "hi");
		System.out.println(list);

		Iterator col = list.iterator();
		while (col.hasNext()) {
			Object obj = col.next();
			System.out.println(obj);
		}

	}

}

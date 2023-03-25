package com.hspedu.list_;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListUserCRUD {
	@SuppressWarnings({ "all" })
	public static void main(String[] args) {
		LinkedList linkedList = new LinkedList();
		for (int i = 1; i <= 2; i++) {
			linkedList.add(i);
		}
		linkedList.add(100);
		linkedList.add(100);
		System.out.println("===LinkedList遍历迭代器===");

		Iterator inIterator = linkedList.iterator();
		while (inIterator.hasNext()) {
			Object object = inIterator.next();
			System.out.println(object);
		}
		System.out.println("===LinkedList遍历增强for===");

		for (Object object : linkedList) {
			System.out.println(object);
		}
		System.out.println("===LinkedList遍历普通for===");
		for (int i = 0; i < linkedList.size(); i++) {
			System.out.println(linkedList.get(i));
		}
		// linkedList.remove(0);
		// linkedList.remove(kk);

		linkedList.set(0, "hspedu");
		System.out.println("=================");
		for (Object object : linkedList) {
			System.out.println(object);

		}
		Object object = linkedList.get(0);
		System.out.println("object=" + object);
		System.out.println(linkedList.getFirst());
		System.out.println(linkedList.getLast());

	}

}

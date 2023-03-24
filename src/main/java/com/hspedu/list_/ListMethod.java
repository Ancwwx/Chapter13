package com.hspedu.list_;

import java.util.ArrayList;
import java.util.List;

public class ListMethod {
	@SuppressWarnings({ "all" })
	public static void main(String[] args) {
		List list = new ArrayList();
		list.add("张三丰");
		list.add("贾宝玉");
		list.add(1, "hsp");
		System.out.println(list);
		List list2 = new ArrayList();
		list2.add("jack");
		list2.add("mary");
		list.addAll(1, list2);
		System.out.println(list);

		System.out.println(list.indexOf("mary"));
		list.add("hsp");
		System.out.println(list);
		System.out.println(list.lastIndexOf("hsp"));
		list.remove(0);
		System.out.println(list);
		list.set(1, "tom");
		System.out.println(list);
		List returnList = list.subList(0, 2);
		System.out.println(returnList);

	}

}

package com.hspedu.set_;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHsahSetSource {
	@SuppressWarnings({ "all" })
	public static void main(String[] args) {
		Set set = new LinkedHashSet();
		set.add(new String("AA"));
		set.add(456);
		set.add(456);
		set.add(new Customer("Liu", 10001));
		set.add(123);
		set.add("HSP");

		System.out.println(set);

	}

}

class Customer {
	private String name;
	private int no;

	public Customer(String name, int no) {
		super();
		this.name = name;
		this.no = no;
	}

}

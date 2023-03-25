package com.hspedu.set_;

import java.util.HashSet;

public class HashSet01 {
	@SuppressWarnings({ "all" })
	public static void main(String[] args) {
		HashSet set = new HashSet();
		System.out.println(set.add("join"));
		System.out.println(set.add("lucy"));
		System.out.println(set.add("join"));
		System.out.println(set.add("jack"));
		System.out.println(set.add("Rose"));

		set.remove("join");
		System.out.println("set=" + set);
		
		
		set=new HashSet();
		System.out.println("set=" + set);
		set.add("lucy");
		set.add("lucy");
		set.add(new Dog("tom"));
		set.add(new Dog("tom"));
		System.out.println("set="+set);
		set.add(new String("hsp"));
		set.add(new String("hsp"));
		System.out.println("set="+set);
	}

}
class Dog{
	private String name;

	public Dog(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Dog [name=" + name + "]";
	}
	
	
}

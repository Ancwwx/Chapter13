package com.hspedu.collection_;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CollectionExercise {
	public static void main(String[] args) {
		List arr = new ArrayList();
		arr.add(new Dog("aa", 1));
		arr.add(new Dog("cc", 3));
		arr.add(new Dog("kk", 2));
		Iterator interator =arr.iterator();
		while(interator.hasNext()) {
			Object dog=interator.next();
			System.out.println(dog);
			
		}
		
		for(Object dog:arr) {
			System.out.println(dog);
		}

	}

}

class Dog {
	private String name;
	private int age;

	public Dog(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Dog [name=" + name + ", age=" + age + "]";
	}
	

}

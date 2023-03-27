package com.hspedu.map_;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapExercise {
	@SuppressWarnings({ "all" })
	public static void main(String[] args) {
		Map map = new HashMap();
		map.put(1, new Employee("jack", 50000, 10001));
		map.put(2, new Employee("tom", 3000, 10002));
		map.put(3, new Employee("rose", 8000, 10003));

		Set keySet = map.keySet();
		for (Object key : keySet) {
			Employee emp = (Employee) map.get(key);
			if (emp.getPrice() > 18000) {
				System.out.println(emp);
			}
		}
		Set entrySet=map.entrySet();
		Iterator iterator=entrySet.iterator();
		while(iterator.hasNext()) {
			Map.Entry entry=(Map.Entry)iterator.next();
			Employee p=(Employee) entry.getValue();
			if(p.getPrice()>18000) {
				System.out.println(p);
			}
		}
	}

}

class Employee {
	private String name;
	private double price;
	private int id;

	public Employee(String name, double price, int iD) {
		super();
		this.name = name;
		this.price = price;
		this.id = iD;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getID() {
		return id;
	}

	public void setID(int iD) {
		id = iD;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", price=" + price + ", id=" + id + "]";
	}



}

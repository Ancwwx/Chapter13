package com.hspedu.map_;

import java.util.HashMap;
import java.util.Map;

public class MapMethod {
	@SuppressWarnings({ "all" })
	public static void main(String[] args) {

		Map map = new HashMap();
		map.put("邓超", new Book(" ", 100));
		map.put("邓超", "孙俪");
		map.put("王宝强", "马蓉");
		map.put("宋喆", "马蓉");
		map.put("刘令博", null);
		map.put(null, "刘亦菲");
		map.put("鹿晗", "关晓彤");
		map.put("hsp", "hsplp");
		

		System.out.println("map=" + map);
		map.remove(null);
		System.out.println("map=" + map);
		Object val = map.get("鹿晗");
		System.out.println("val=" + val);
		System.out.println("k-v" + map.size());
		System.out.println(map.isEmpty());
		//map.clear();
		System.out.println("map=" + map);
		
		System.out.println(map.containsKey("hsp"));


	}

}

class Book {
	private String name;
	private int num;

	public Book(String name, int num) {
		super();
		this.name = name;
		this.num = num;
	}

}
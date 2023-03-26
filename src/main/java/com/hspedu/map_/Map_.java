package com.hspedu.map_;

import java.util.HashMap;
import java.util.Map;

public class Map_ {
	@SuppressWarnings({ "all" })
	public static void main(String[] args) {
		Map map = new HashMap();
		map.put("no1", "hsp");
		map.put("no2", "zwj");
		map.put("no1", "zsf");
		map.put("no3", "zsf");
		map.put(null, null);
		map.put(null, "abc");
		map.put("no5", null);
		map.put("no6", null);
		System.out.println(map);
		System.out.println(map.get("no2"));
		

	}

}

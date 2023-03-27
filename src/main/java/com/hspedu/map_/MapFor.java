package com.hspedu.map_;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapFor {
	@SuppressWarnings({"all"})
	public static void main(String[] args) {
		Map map = new HashMap();
		map.put("邓超", "孙俪");
		map.put("王宝强", "马蓉");
		map.put("宋喆", "马蓉");
		map.put("刘令博", null);
		map.put(null, "刘亦菲");
		map.put("鹿晗", "关晓彤");
		map.put("hsp", "hsplp");
		
		Set keyset= map.keySet();
		System.out.println("========1=======");
		for(Object key:keyset) {
			System.out.println(key+"-"+map.get(key));
		}
		System.out.println("========2=======");
		Iterator iterator=keyset.iterator();
		while(iterator.hasNext()) {
			Object key=iterator.next();
			System.out.println(key+"-"+map.get(key));
			
		}
		Collection values= map.values();
		for(Object value:values) {
			System.out.println(value);
		}
		Iterator iterator2=values.iterator();
		while(iterator2.hasNext()) {
			Object value=iterator2.next();
			System.out.println(value);
		}
		System.out.println("========3=======");
		Set entrySet=map.entrySet();
		for(Object entry:entrySet) {
			Map.Entry m =(Map.Entry) entry;
			System.out.println(m.getKey()+"-"+m.getValue());
		}
		System.out.println("========4=======");
		Iterator interator3=entrySet.iterator();
		while(interator3.hasNext()) {
			Object entry=interator3.next();
			Map.Entry m=(Map.Entry) entry;
			System.out.println(m.getKey()+"-"+m.getValue());
		}
		
	}

}

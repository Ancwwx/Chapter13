package com.hspedu.list_;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ListFor {
	@SuppressWarnings({"all"})
	public static void main(String[] args) {
		//List list=new ArrayList();
		List list=new LinkedList();
		//List list=new Vector();
		list.add("jack");
		list.add("tom");
		list.add("鱼香肉丝");
		list.add("北京烤鸭子");
		Iterator iterator=list.iterator();
		while(iterator.hasNext()) {
			Object obj=iterator.next();
			System.out.println(obj);
		}
		System.out.println("~~~~~~~~~~~~~~~");
		for(Object obj:list) {
			System.out.println(obj);
		}
		System.out.println("~~~~~~~~~~~~~~~");
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		
		
	}

}

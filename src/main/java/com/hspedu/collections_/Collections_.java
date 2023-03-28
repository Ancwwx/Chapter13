package com.hspedu.collections_;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Collections_ {
	@SuppressWarnings({ "all" })
	public static void main(String[] args) {
		List list = new ArrayList();
		list.add("tom");
		list.add("smith");
		list.add("king");
		list.add("milan");
		Collections.reverse(list);
		System.out.println("list=" + list);

		Collections.shuffle(list);
		System.out.println("list=" + list);

		Collections.sort(list);
		System.out.println("list自然排序=" + list);

		Collections.sort(list, new Comparator() {
			public int compare(Object o1, Object o2) {
				return ((String) o1).length() - ((String) o2).length();
			}
		});
		System.out.println("list按照字符串长度大小排序=" + Collections.max(list));

		Collections.swap(list, 0, 1);
		System.out.println("list=" + list);

		System.out.println("list自然顺序最大元素=" + Collections.max(list));

		Object maxObject = Collections.max(list, new Comparator() {
			public int compare(Object o1, Object o2) {
				return ((String) o1).length() - ((String) o2).length();
			}

		});
		System.out.println("list长度最大的元素=" + maxObject);
		System.out.println("tom出现的次数=" + Collections.frequency(list, "tom"));

		ArrayList dest = new ArrayList();
		for (int i = 0; i < list.size(); i++) {
			dest.add("");
		}
		Collections.copy(dest, list);
		System.out.println("dest=" + dest);
		
		Collections.replaceAll(list, "tom", "rose");
		System.out.println("list=" + list);

	}

}

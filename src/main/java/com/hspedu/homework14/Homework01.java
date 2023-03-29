package com.hspedu.homework14;

import java.util.ArrayList;

public class Homework01 {
	@SuppressWarnings({ "all" })
	public static void main(String[] args) {

		ArrayList arrayList = new ArrayList();
		arrayList.add(new News("新冠确诊病例超千万，数百万印度信徒付恒河\"圣浴\"引民众担忧"));
		arrayList.add(new News("男子突然想起2个月前钓的鱼还在网兜里，捞起一看赶紧放生"));
		int size = arrayList.size();
		for (int i = size - 1; i >= 0; i--) {
			News news = (News) arrayList.get(i);
			System.out.println(processTitle(news.getTitel()));
		}

	}

	public static String processTitle(String title) {
		if (title == null) {
			return "";
		}
		if (title.length() > 15) {
			return title.substring(0, 15) + "...";

		} else {
			return title;
		}
	}

}

class News {
	private String titel;
	private String content;

	public News(String titel) {
		super();
		this.titel = titel;
	}

	public String getTitel() {
		return titel;
	}

	public void setTitel(String titel) {
		this.titel = titel;
	}

	@Override
	public String toString() {
		return "News [titel=" + titel + "]";
	}

}
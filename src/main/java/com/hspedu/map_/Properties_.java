package com.hspedu.map_;

import java.util.Properties;

public class Properties_ {
	public static void main(String[] args) {
		Properties properties=new Properties();
		properties.put("join",100);
		properties.put("lucy",100);
		properties.put("lic",100);
		properties.put("lic",88);
		properties.put("join",100);
		properties.put("join",100);
		System.out.println(properties);
		
		properties.remove("lic");
		
		properties.put("join","beijing");
		System.out.println(properties);
		
		System.out.println(properties.get("join"));
		System.out.println(properties.getProperty("join"));
		
	}

}

package com.hspedu.string_;

public class StringMethod01 {
	public static void main(String[] args) {
		String str1 = "hello";
		String str2 = "Hello";
		System.out.println(str1.equals(str2));

		String username = "joiN";
		if ("join".equalsIgnoreCase(username)) {
			System.out.println("Success!");
		} else {
			System.out.println("Failure!");
		}

		System.out.println("hello".length());

		String s1 = "wer@terwe@g";
		int index = s1.indexOf('@');
		System.out.println(index);
		
		s1 = "wer@terwe@g@";
		index=s1.lastIndexOf('@');
		System.out.println(index);
			
		String name="hello,join";
		System.out.println(name.substring(6));
		System.out.println(name.substring(3,7));
		
				

	}

}

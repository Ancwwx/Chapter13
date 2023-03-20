package com.hspedu.string_;

public class StringExercise02 {
	public static void main(String[] args) {
		String a = "hsp";
		String b = new String("hsp");

		System.out.println(a.equals(b));
		System.out.println(a == b);
		System.out.println(a == b.intern());
		System.out.println(b == b.intern());   //intern()返回常量池的地址;

	}

}

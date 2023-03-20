package com.hspedu.string_;

public class StringExercise03 {
	public static void main(String[] args) {

		String s1 = "hspedu";
		String s2 = "java";
		String s3 = new String("java");
		String s4 = "java";

		System.out.println(s2 == s3);
		System.out.println(s2 == s4);
		System.out.println(s2.equals(s3));
		System.out.println(s1 == s2);

	}

}

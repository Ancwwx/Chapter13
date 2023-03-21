package com.hspedu.string_;

public class StringMethod02 {
	public static void main(String[] args) {
		String s = "heLLo";
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());

		String s1 = "jack";
		s1 = s1.concat(" mary").concat(" join").concat(" together");
		System.out.println(s1);

		s1 = "jack and join join join";
		s1 = s1.replace("join", "jack");
		System.out.println(s1);

		String poem = "锄禾日当午,汗滴禾下土,谁知盘中餐,粒粒皆辛苦";
		String[] split = poem.split(",");
		poem = "E:\\aaa\\bbb";
		split = poem.split("\\\\");
		for (int i = 0; i < split.length; i++) {
			System.out.println(split[i]);
		}

		s = "happy";
		char[] chs = s.toCharArray();
		for (int i = 0; i < chs.length; i++) {
			System.out.println(chs[i]);
		}

		String a = "jacc";
		String b = "jack";

		System.out.println(a.compareTo(b));

		String name = "join";
		int age = 10;
		double score = 98.3 / 3;
		char gender = '男';
		String info = "我的姓名是" + name + "年龄是" + age + ",成绩是" + score + "性别是" + gender + "。 希望大家喜欢我！";
		String info2 = String.format("我的姓名是%s 年龄是%d,成绩是%.2f 性别是%c。希望大家喜欢我！", name, age, score, gender);
		System.out.println(info2);

	}

}

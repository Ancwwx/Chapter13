package com.hspedu.date_;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class LocalDate_ {
	public static void main(String[] args) {
		LocalDateTime ldt = LocalDateTime.now();
		System.out.println(ldt);

		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy年MM月dd日 HH小时mm分钟ss秒");
		String format = dateTimeFormatter.format(ldt);
		System.out.println(format);

		System.out.println("年=" + ldt.getYear());
		System.out.println("月=" + ldt.getMonthValue());
		System.out.println("月=" + ldt.getMonth());
		System.out.println("日=" + ldt.getDayOfMonth());
		System.out.println("时=" + ldt.getHour());
		System.out.println("分=" + ldt.getMinute());
		System.out.println("秒=" + ldt.getSecond());
		LocalDate now = LocalDate.now();
		System.out.println(now);
		LocalTime now1 = LocalTime.now();
		System.out.println(now1);

		LocalDateTime localDateTime = ldt.plusDays(890);
		System.out.println(dateTimeFormatter.format(localDateTime));
		LocalDateTime localDateTime2 = ldt.minusDays(354);
		System.out.println(dateTimeFormatter.format(localDateTime2));

	}

}

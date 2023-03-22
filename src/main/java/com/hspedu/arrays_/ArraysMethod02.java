package com.hspedu.arrays_;

import java.util.Arrays;
import java.util.List;

public class ArraysMethod02 {
	public static void main(String[] args) {
		Integer[] arr = { 1, 2, 90, 123, 567 };
		int index = Arrays.binarySearch(arr, 4);
		System.out.println(index);
		
		Integer[] newArr=Arrays.copyOf(arr, arr.length+1);
		System.out.println(Arrays.toString(newArr));
		
		Integer[] num= new Integer[] {9,3,2}; 
		Arrays.fill(num, 99);
		System.out.println(Arrays.toString(num));
		
		Integer[] arr2 = { 1, 2, 90, 123 };
		boolean equals=Arrays.equals(arr, arr2);
		System.out.println(equals);
		
		List asList=Arrays.asList(2,3,4,5,6,7,1);
		System.out.println(asList);
		
	}

}

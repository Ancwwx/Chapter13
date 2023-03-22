package com.hspedu.bignum;

import java.math.BigInteger;

public class BigInteger_ {
	public static void main(String[] args) {
		// long l=23788888888888888888889l;

		BigInteger bigInteger = new BigInteger("23788888888888888888889");
		BigInteger biginteger2 = new BigInteger("100");

		System.out.println(bigInteger);
		BigInteger add = bigInteger.add(biginteger2);
		System.out.println(add);

		BigInteger subtract = bigInteger.subtract(biginteger2);
		System.out.println(subtract);

		BigInteger multiply = bigInteger.multiply(biginteger2);
		System.out.println(multiply);

		BigInteger divide = bigInteger.divide(biginteger2);
		System.out.println(divide);
	}

}

package com.whileloop;

public class Reverse {

	public static void main(String[] args) {

//		 Write a Program to reverse the integer number
		int n = 231;
		while (n > 0) {
			int rem = n % 10;
			System.out.print(rem);
			n = n / 10;
		}
		System.out.println("");

	}

}

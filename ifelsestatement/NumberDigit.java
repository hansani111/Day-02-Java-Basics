package com.ifelsestatement;

public class NumberDigit {

	public static void main(String[] args) {
		int n = 0;
		if (n == 1) {
			System.out.println("unit..");
		} else if (n == 10) {
			System.out.println("ten..");
		} else if (n == 100) {
			System.out.println("hundred..");
		} else if (n == 1000) {
			System.out.println("thousand..");
		} else
			System.out.println("not found..");
	}
}

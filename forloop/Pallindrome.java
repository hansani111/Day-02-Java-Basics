package com.forloop;

public class Pallindrome {

	public static void main(String[] args) {

		int num = 121;
		int temp;
		int sum, rem;

		temp = num;
		for (sum = 0; num > 0; num /= 10) {
			rem = num % 10;
			sum = (sum * 10) + rem;
		}
		if (sum == temp)
			System.out.println(temp + " is a palindrome number ");
		else
			System.out.println(temp + " is not a palindrome number ");

	}
}
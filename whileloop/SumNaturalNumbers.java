package com.whileloop;

public class SumNaturalNumbers {

	public static void main(String[] args) {

//		Write a Program for the sum of n natural numbers 

		int num1 = 5;
		int sum1 = 0;
		int j = 1;
		while (j <= num1) {
			sum1 = sum1 + j;
			j++;
		}
		System.out.println("sum : " + sum1);

	}

}

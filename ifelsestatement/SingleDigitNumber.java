package com.ifelsestatement;

import java.util.Scanner;

public class SingleDigitNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter numbers : ");
		int n =sc.nextInt() ;
		
		//int n=0;
		
		if (n == 1) {
			System.out.println("one");
		} else if (n == 2) {
			System.out.println("two");
		} else if (n == 3) {
			System.out.println("three");
		} else if (n == 4) {
			System.out.println("four");
		} else
			System.out.println("not found");

	}

}

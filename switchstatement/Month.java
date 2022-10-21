package com.switchstatement;

public class Month {

	public static void main(String[] args) {
		String month = "jan";
		switch (month) {
		case "jan":
			System.out.println("Month name is january.....");
			break;
		case "feb":
			System.out.println("Month name is february....");
			break;
		case "mar":
			System.out.println("Month name is march.....");
			break;
		case "apr":
			System.out.println("Month name is april.....");
			break;
		case "may":
			System.out.println("Month name is may.....");
			break;
		case "june":
			System.out.println("Month name is june.....");
			break;
		case "july":
			System.out.println("Month name is july.....");
			break;
		default:
			System.out.println("invalid month name.....");
			break;
		}

	}

}

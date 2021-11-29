package com.te.challenges;

public class Challenge5 {
	static int temp;
	static String one[] = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };
    static String teen[] = {"ten","eleven ","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eigthteen","ninteen"};
	public static void toWords(String n) {
		temp = Integer.parseInt(n);
		if (n.length() == 1) {
			System.out.println(one[temp]);
		}

	}

}

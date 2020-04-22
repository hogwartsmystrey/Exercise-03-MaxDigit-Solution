package com.stackroute;
import java.util.regex.*;
import java.util.*;
import java.util.Arrays;



public class MaxDigitInString {

	public static int getMaxDigit(String alphanumeric) {
		//array
		int size = 0;
		int j = 0;
		int[] arrays = new int[20];

		boolean x = alphanumeric.matches(".*\\d.*");
		if (alphanumeric.isEmpty()) {
			return -1;
		}
		if (x == true) {
			for (int pos = 0; pos < alphanumeric.length(); pos++) {
				boolean isdigit = false;
				isdigit = Character.isDigit(alphanumeric.charAt(pos));
				if (isdigit == true) {
					size = size + 1;

					arrays[j] = Integer.parseInt(String.valueOf(alphanumeric.charAt(pos)));
					//System.out.println(arrays[j]);
					j++;
				}
			}
			////System.out.println(size);

			Arrays.sort(arrays);
			//for (int number : arrays) {
			//	System.out.println("Number = " + number);
			//}
			int p = 0;
			p = arrays[arrays.length - 1];
			//System.out.println(p);
			return (p);
		}
		return -1;
	}



	//using list

	//Do not print anything other than what's expected/asked in problem
	public static void main(String args[]) {



		//Use Scanner to get input from console
		Scanner sc = new Scanner(System.in);
		String alpha =sc.nextLine();
		String alphanumeric =alpha.replaceAll("\\s","");

		int digit = MaxDigitInString.getMaxDigit(alphanumeric);


		if (MaxDigitInString.getMaxDigit(alphanumeric) == -1) {
			System.out.println("No digits in string");
		}
		else
		{
			System.out.println("Max digit:"+digit);
		}
	}
}
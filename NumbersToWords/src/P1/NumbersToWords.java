package P1;

import java.util.*;

public class NumbersToWords {
	    private static final String[] units = {"", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
	    private static final String[] teens = {"Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen",
	            "Seventeen", "Eighteen", "Nineteen"};
	    private static final String[] tens = {"", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter a number: ");
	        int number = sc.nextInt();

	        if (number < 0 || number > 9999) {
	            System.out.println("Number out of range");
	        } else {
	            System.out.println("Number in words: " + convertToWords(number));
	        }

	    }

	    public static String convertToWords(int number) {
	        if (number == 0) {
	            return "Zero";
	        }

	        if (number < 10) {
	            return units[number];
	        } else if (number < 20) {
	            return teens[number - 10];
	        } else if (number < 100) {
	            return tens[number / 10] + ((number % 10 != 0) ? " " + units[number % 10] : "");
	        } else if (number < 1000) {
	            return units[number / 100] + " Hundred" + ((number % 100 != 0) ? " and " + convertToWords(number % 100) : "");
	        } else {
	            return units[number / 1000] + " Thousand" + ((number % 1000 != 0) ? " " + convertToWords(number % 1000) : "");
	        }
	    }
	}

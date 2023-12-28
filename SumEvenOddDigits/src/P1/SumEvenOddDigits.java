package P1;

import java.util.*;

public class SumEvenOddDigits {
	  public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        
	        System.out.print("Enter a number: ");
	        int num = sc.nextInt();
	        
	        int[] sums = sumEvenOddDigits(num);
	        
	        System.out.println("Sum of digits at even places: " + sums[0]);
	        System.out.println("Sum of digits at odd places: " + sums[1]);
	    }
	    
	    public static int[] sumEvenOddDigits(int number) {
	        String str = Integer.toString(number);
	        int evenSum = 0;
	        int oddSum = 0;
	        
	        for (int i = 0; i < str.length(); i++) {
	            int digit = Character.getNumericValue(str.charAt(i));
	            if ((i + 1) % 2 == 0) { 
	                evenSum =evenSum+ digit;
	            } else {
	                oddSum = oddSum+ digit;
	            }
	        }
	        
	        return new int[] { evenSum, oddSum };
	    }
	}

